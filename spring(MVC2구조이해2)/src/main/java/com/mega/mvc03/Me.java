package com.mega.mvc03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Me extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		PrintWriter out = response.getWriter();
		out.print("name : " + name);
		out.print("name : " + age);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		PrintWriter out = response.getWriter();
		out.print("name : " + name);
		out.print("name : " + age);
	}

}
