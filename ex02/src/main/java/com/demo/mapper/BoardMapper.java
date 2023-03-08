package com.demo.mapper;

import java.util.List;

import com.demo.domain.BoardVO;

public interface BoardMapper {
	
	// 글 저장
	public void insert(BoardVO vo);
	
	// 글 리스트
	public List<BoardVO> getList();
	
	// 글읽기 
	public BoardVO get(Long bno);
	
	// 글 수정
	public void modify(BoardVO vo);
	
	//글삭제
	public void remove(Long bno);
	
	

	
}
