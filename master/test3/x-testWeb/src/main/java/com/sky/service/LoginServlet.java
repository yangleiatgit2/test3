package com.sky.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Get请求。。。。。");
		response.getWriter().write("get ok");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Post请求。。。。。");
		System.out.println("just a test。。。。。");
		System.out.println("just a test222。。。。。");
		System.out.println("just a test。。。。。");
		response.getWriter().write("psot ok");
	}

}