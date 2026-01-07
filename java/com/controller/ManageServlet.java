package com.controller;

import java.io.IOException;

import com.dao.Employeedao;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/manage")
public class ManageServlet extends HttpServlet {

	Employeedao dao = new Employeedao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("employees", dao.fetchEmployees());
		req.getRequestDispatcher("view.jsp").forward(req, resp);
	}
}
