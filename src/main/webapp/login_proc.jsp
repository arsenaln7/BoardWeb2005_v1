<%@page import="com.springbook.biz.user.impl.UserDAO"%>
<%@page import="com.springbook.biz.user.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
// 1. ����� �Է� ���� ����
String id = request.getParameter("id");
String password = request.getParameter("password");

// 2. DB ���� ó��
UserVO vo = new UserVO();
vo.setId(id);
vo.setPassword(password);

UserDAO userDAO = new UserDAO();
UserVO user = userDAO.getUser(vo);

// 3. ȭ�� �׺���̼�

if(user != null){
	response.sendRedirect("getBoardList.jsp");
//  ������ ��� - 1
//	RequestDispatcher dispatcher = request.getRequestDispatcher("getBoardList.jsp");
//	dispatcher.forward(request, response);
} else{
	response.sendRedirect("login.jsp");
}

%>