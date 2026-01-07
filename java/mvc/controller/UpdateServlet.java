package mvc.controller;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import mvc.dao.Employeedao;
import mvc.entity.Employee;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	Employeedao dao = new Employeedao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Employee e = new Employee();
		e.setId(Long.parseLong(req.getParameter("id")));
		e.setName(req.getParameter("name"));
		e.setJob(req.getParameter("job"));
		e.setSalary(Long.parseLong(req.getParameter("salary")));
		e.setHiredate(LocalDate.parse(req.getParameter("hiredate")));

		dao.update(e);
		resp.sendRedirect("manage");
	}
}
