package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Log4jAdvice;
import com.springbook.biz.common.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	//private BoardDAO boardDAO;
	private BoardDAOSpring boardDAO;
	//private LogAdvice log;
	
	//public BoardServiceImpl(){
	//	log = new LogAdvice();
	//}
	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
	//	log.printLog();
	/*
	 * P177 에러사항 발생위한 코드 추가
	 * 	if(vo.getSeq()==0){
	 *		throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
	 *	}
	 */
		
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
	//	log.printLog();
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
	//	log.printLog();
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
	//	log.printLog();
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
	//	log.printLog();
		return boardDAO.getBoardList(vo);
	}

}
