package com.mega.mvc03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()호출됨");
		String driver = config.getInitParameter("driver");
		String dbName = config.getInitParameter("dbName");
		System.out.println(dbName);
		if (driver.equals("com.mysql.jdbc.Driver")) {
			System.out.println("mySQL서버에 연결됨");
		}else {
			System.out.println("오라클 서버에 연결함.");
		}
	}
	
	
	public Hello() {
		System.out.println("기본생성자 호출됨.");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET요청 들어왔음.");
		PrintWriter out = response.getWriter();
		out.print("GET recevied!!!!<br>");
		String id = request.getParameter("id");
		out.print("your id : " + id);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST요청 들어왔음.");
		System.out.println("GET요청 들어왔음.");
		PrintWriter out = response.getWriter();
		out.print("POST recevied!!!!");
		out.print("GET recevied!!!!<br>");
		String id = request.getParameter("id");
		out.print("your id : " + id);
	}

}
