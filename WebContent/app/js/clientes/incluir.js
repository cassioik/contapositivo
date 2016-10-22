function salvar(){
	var id = $("#id").val();
	var nome = $("#nome").val();
	var cnpj_cpf = $("#cnpj_cpf").val();
	var email = $("#email").val();
	var telefone = $("#telefone").val();
	
	var url = "";
	
	if(id==""){
		//inclusão
		url = "../clientes/incluir";
	}else{
		//alteração
		url = "../clientes/alterar";
	}
	
	$.ajax({
		url: url,
		type: "POST",
		dataType: "json",
		data:{
			id: id,
			nome: nome,
			cnpj_cpf: cnpj_cpf,
			email: email,
			telefone: telefone
		},
		success: function(data){
			window.location = "view/clientes/listar.html";
		},
		error: function(xhr, ajaxOptions, thrownError){
			alert("Deu erro: " + xhr.status);
		}
	})
}