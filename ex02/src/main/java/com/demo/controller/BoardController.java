package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.domain.BoardVO;
import com.demo.service.BoardService;

import lombok.extern.log4j.Log4j;


@Log4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	public BoardService boardService;
	
	// 글쓰기 폼
	@GetMapping("/write")
	public void write() {
		log.info("write called..");
	}

	// 글쓰기 저장
	@PostMapping("/write")
	public String write(BoardVO vo, RedirectAttributes rttr) {
		log.info("입력 데이터 : " + vo );
		
		boardService.insert(vo);

		//board/list에서 사용하는 jsp에서 msg. write 라는 변수값을 참조한다. 
		rttr.addFlashAttribute("msg", "write");
		
		//rttr.addArribute -> 이동하는 주소 메서드에 파라미터값을 전달목적으로 사용한다.
		
		
		return "redirect:/board/list";
	}
	
	//리스트 목록
	@GetMapping("/list")
	public void list(Model model){ //Model model -> view에 데이터를 전송하기위해 Model 파라미터 추가
		log.info("list called...");
		
		List<BoardVO> list = boardService.getList();
		model.addAttribute("list", list);
	}
	
	
	// 게시물 읽기
	@GetMapping(value= {"/get", "/modify"})
	public void get(Long bno , Model model) {
		log.info("게시물 번호 : " + bno);
		
		BoardVO board = boardService.get(bno);
		model.addAttribute("board",board);
		
	}
	
	// 게시글 수정
	@PostMapping("/modify")
	public String modify(BoardVO vo, RedirectAttributes rttr ) {
		log.info("수정내용 :" + vo);
		
		boardService.modify(vo);
		rttr.addFlashAttribute("msg", "modify");
		
		return "redirect:/board/list";
	}
	
	
	// 게시물 삭제
	@GetMapping("/remove")
	public String remove(Long bno) {
		log.info("삭제 게시물 번호:" + bno);
		
		boardService.remove(bno);

		return "redirect:/board/list";
		
		
	}
	
}
