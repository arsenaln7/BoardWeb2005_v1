<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
//1. 브라우저와 연결된 세션 객체를 강제 종료한다.
session.invalidate();

//2. 세션 종료 후, 메인 화면으로 이동한다.
response.sendRedirect("login.jsp");

%>