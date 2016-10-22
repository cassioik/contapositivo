package br.edu.possitivo.contapositivo.servlets.seguranca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.edu.possitivo.contapositivo.dao.ClienteDAO;
import br.edu.possitivo.contapositivo.models.Clientes;

@WebServlet("/clientes/incluir")
public class IncluirClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cnpj_cpf = request.getParameter("cnpj_cpf");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		
		ClienteDAO dao = new ClienteDAO();
		
		Clientes cliente = new Clientes();
		cliente.setId(dao.Listar().size() + 1);
		cliente.setNome(nome);
		cliente.setIdentificador(cnpj_cpf);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
		
		dao.adicionar(cliente);
		
		System.out.println(nome);
		
		response.setContentType("application;json");
		response.setCharacterEncoding("ISO-8859-1");
		response.getWriter().write(new Gson().toJson(""));
	}

}
