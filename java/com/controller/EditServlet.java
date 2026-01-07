package com.controller;

import java.io.IOException;

import com.dao.Employeedao;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

	Employeedao dao = new Employeedao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Long id = Long.parseLong(req.getParameter("id"));
		req.setAttribute("employee", dao.findById(id));
		req.getRequestDispatcher("edit.jsp").forward(req, resp);
	}
}
