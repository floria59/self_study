package com.demo.service;

import java.util.List;

import com.demo.domain.BoardVO;

public interface BoardService {

	public void insert(BoardVO vo);
	
	public List<BoardVO> getList();
	
	public BoardVO get(Long bno);
	
	public void modify(BoardVO vo);
	
	public void remove(Long bno);

}
