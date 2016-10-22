package br.edu.possitivo.contapositivo.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.possitivo.contapositivo.models.Clientes;

public class ClienteDAO {
	private static List<Clientes> clientes = new ArrayList<>();
	
	public ClienteDAO(){
		if(clientes.size() == 0){
			Clientes votorantim = new Clientes();
			votorantim.setId(1);
			votorantim.setNome("Votorantim");
			votorantim.setIdentificador("123.123.123-12");
			votorantim.setEmail("votorantim@email.com");
			votorantim.setTelefone("(12) 1234-1234");
			
			Clientes petrobras = new Clientes();
			petrobras.setId(2);
			petrobras.setNome("Petrobras");
			petrobras.setIdentificador("123.123.123-12");
			petrobras.setEmail("petrobras@email.com");
			petrobras.setTelefone("(12) 1234-1234");
			
			clientes.add(votorantim);
			clientes.add(petrobras);
		}
	}
	
	public List<Clientes> Listar() {
		return clientes;
	}
	
	public void adicionar(Clientes cliente){
		clientes.add(cliente);
	}

	public void excluir(int id) {
		clientes.remove(id-1);
	}
}
