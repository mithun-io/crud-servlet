package com.controller;

import java.io.IOException;
import java.util.List;

import com.dao.UserDao;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/manage")
public class ManageServlet extends HttpServlet {
	
	private final UserDao userDao = new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> users = userDao.fetchAll(); 
		request.setAttribute("users", users);
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}
}
