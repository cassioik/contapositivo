function cadastrar(){
	var nome = $("#nome").val();
	var email = $("#email").val();
	var senha = $("#senha").val();
	var confirma_senha = $("#confirma_senha").val();

	if (nome=="" || email=="" || senha=="" || confirma_senha==""){
		alert("Todos os campos s�o obrigat�rios!");
		return;
	}
	
	if (confirma_senha != senha){
		alert("A confirma��o de senha esta errada!");
		return;
	}
}