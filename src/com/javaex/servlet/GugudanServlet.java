package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GugudanS")
public class GugudanServlet extends HttpServlet {
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성부분
		
		response.setContentType("text/html;charset=utf-8"); //한글 안깨지게 출력
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		PrintWriter out = response.getWriter();
		out.println(" <table border='1'> ");
		
		for (int i =1; i<=9;i++) {
		out.println("	<tr>");
		out.println("		<td>"+dan+"</td> ");
		out.println("		<td>"+i+"</td> ");
		out.println("		<td>"+dan*i+"</td> ");
		out.println("	</tr>");
		
		}
		
		out.println(" </table>");
		out.println("");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
