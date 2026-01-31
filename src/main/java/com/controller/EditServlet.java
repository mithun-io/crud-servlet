package com.controller;

import java.io.IOException;

import com.dao.UserDao;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	
	private final UserDao userDao = new UserDao();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		User user = userDao.fetchById(id);
		request.setAttribute("user", user);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
		
	}

}
