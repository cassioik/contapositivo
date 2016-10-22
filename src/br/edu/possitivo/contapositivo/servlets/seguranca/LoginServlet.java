package br.edu.possitivo.contapositivo.servlets.seguranca;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/seguranca/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		Map<String, String> resposta = new LinkedHashMap<String, String>();
		int autenticado = 0;

		if (email.equals("teste@teste.com") && senha.equals("admin")) {
			autenticado = 1;
			resposta.put("mensagem", "Login realizado com sucesso!");
		}

		resposta.put("autenticado", String.valueOf(autenticado));
		
		String json = new Gson().toJson(resposta);
		
		System.out.println(json);
		
		response.setContentType("application;json");
		response.setCharacterEncoding("ISO-8859-1");
		response.getWriter().write(json);
	}

}
