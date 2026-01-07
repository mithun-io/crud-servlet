package mvc.controller;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import mvc.dao.Employeedao;
import mvc.entity.Employee;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	Employeedao dao = new Employeedao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Employee e = new Employee();
		e.setName(req.getParameter("name"));
		e.setJob(req.getParameter("job"));
		e.setSalary(Long.parseLong(req.getParameter("salary")));
		e.setHiredate(LocalDate.parse(req.getParameter("hiredate")));


		dao.save(e);
		req.setAttribute("message", "data inserted successfully");
		req.getRequestDispatcher("main.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("add.jsp").forward(req, resp);
	}
}
