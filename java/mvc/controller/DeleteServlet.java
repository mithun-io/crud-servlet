package mvc.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import mvc.dao.Employeedao;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	Employeedao dao = new Employeedao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Long id = Long.parseLong(req.getParameter("id"));
		dao.deleteById(id);

		resp.sendRedirect("manage");
	}
}
