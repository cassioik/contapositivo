function cadastrar(){
	var nome = $("#nome").val();
	var email = $("#email").val();
	var senha = $("#senha").val();
	var confirma_senha = $("#confirma_senha").val();

	if (nome=="" || email=="" || senha=="" || confirma_senha==""){
		alert("Todos os campos são obrigatórios!");
		return;
	}
	
	if (confirma_senha != senha){
		alert("A confirmação de senha esta errada!");
		return;
	}
}