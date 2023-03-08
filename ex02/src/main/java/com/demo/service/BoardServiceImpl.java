package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.domain.BoardVO;
import com.demo.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	public BoardMapper boradMapper;
	
	@Override
	public void insert(BoardVO vo) {
		boradMapper.insert(vo);
	
	}
	
	@Override
	public List<BoardVO> getList(){
		return boradMapper.getList();
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		return boradMapper.get(bno);
	}

	@Override
	public void modify(BoardVO vo) {
		// TODO Auto-generated method stub
		boradMapper.modify(vo);
	}

	@Override
	public void remove(Long bno) {
		// TODO Auto-generated method stub
		boradMapper.remove(bno);
	}
	
	 
	
	

	
}
