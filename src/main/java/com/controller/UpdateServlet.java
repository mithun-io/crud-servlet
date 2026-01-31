package com.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.dao.UserDao;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	private final UserDao userDao = new UserDao();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setId(Long.parseLong(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setDob(LocalDate.parse(request.getParameter("dob")));
		
		userDao.update(user);
		response.sendRedirect("manage");
	}
}
