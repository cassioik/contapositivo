function logar(){
	var email = $("#email").val();
	var senha = $("#senha").val();

	if (email == "" || senha == ""){
		alert("Informe o email e senha!");
		return;
	}
	
	$.ajax({
		url: "../seguranca/login",
		type: "POST",
		dataType: "json",
		data: {
			email: email,
			senha: senha
		},
		success: function(data) {
			var autenticado = data.autenticado;
			var mensagem = data.mensagem;
			
			if(autenticado == 1){
				//alert(mensagem);
				window.location = "view/menu/menu.html";
			}else{
				alert("Email e/ou senha inválidos!");
			}
		},
		error: function(xhr, ajaxOptions, thrownError) {
			alert("Deu erro: " + xhr.status);
		}
	})
}