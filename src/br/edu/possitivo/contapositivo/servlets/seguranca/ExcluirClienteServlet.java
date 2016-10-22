package br.edu.possitivo.contapositivo.servlets.seguranca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.edu.possitivo.contapositivo.dao.ClienteDAO;

@WebServlet("/clientes/excluir")
public class ExcluirClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		ClienteDAO dao = new ClienteDAO();
		dao.excluir(id);
		
		response.setContentType("application;json");
		response.setCharacterEncoding("ISO-8859-1");
		response.getWriter().write(new Gson().toJson(""));
	}

}
