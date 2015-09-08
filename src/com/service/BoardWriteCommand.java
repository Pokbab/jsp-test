package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BoardDAO;
import com.entity.BoardDTO;


public class BoardWriteCommand implements BoardCommand {

	/*
	 * FrontController 에서 해야 할 일을 따로 뽑아옴
	 * 따라서 HttpServletRequest, HttpServletResponse 가 필요
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDTO dto = new BoardDTO();
		dto.setAuthor(author);
		dto.setTitle(title);
		dto.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		int n = dao.write(dto);
	}
	
}
