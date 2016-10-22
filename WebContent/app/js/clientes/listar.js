$(document).ready(function() {
	listarClientes();
})

function listarClientes(){
	$.ajax({
		url: "../clientes/listar",
		type: "GET",
		dataType: "json",
		success: function(clientes){
			var tbody = $("#tbody");
			
			$.each(clientes, function(){
				var linha = $("<tr>");
				var colunas = "";
				colunas += '<td>' + this.id + '</td>';
				colunas += '<td>' + this.nome + '</td>';
				colunas += '<td>' + this.identificador + '</td>';
				colunas += '<td>' + this.email + '</td>';
				colunas += '<td>' + this.telefone + '</td>';
				colunas += '<td> <button class="btn btn-warning" onclick="editar('+this.id+')">Editar</button>';
				colunas += '     <button class="btn btn-danger" onclick="excluir('+this.id+')">Excluir</button> </td>';
				
				linha.append(colunas);
				tbody.append(linha);
			})
		},
		error: function(xhr, ajaxOptions, thrownError){
			alert("Deu erro: " + xhr.status);
		}
	})
}

function excluir(id){
	$.ajax({
		url: "../clientes/excluir?id="+id,
		type: "DELETE",
		dataType: "json",
		success: function(resposta){
			location.reload();
		},
		error: function(xhr, ajaxOptions, thrownError){
			alert("Deu erro: " + xhr.status);
		}
	})
}