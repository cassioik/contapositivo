package br.edu.possitivo.contapositivo.servlets.seguranca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.edu.possitivo.contapositivo.dao.ClienteDAO;
import br.edu.possitivo.contapositivo.models.Clientes;

@WebServlet("/clientes/listar")
public class ListarClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO dao = new ClienteDAO();
		List<Clientes> clientes = new ArrayList<>();
		clientes = dao.Listar();
		
		String json = new Gson().toJson(clientes);
		
		System.out.println(json);
		
		response.setContentType("application;json");
		response.setCharacterEncoding("ISO-8859-1");
		response.getWriter().write(json);
	}

}
