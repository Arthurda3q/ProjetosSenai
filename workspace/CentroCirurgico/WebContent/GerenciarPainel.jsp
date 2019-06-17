<%@page import="org.senai.cntrCirurgico.modelo.Painel"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Grenciar Painel</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>
<script type="text/javascript">
function dadosForm() {
	var dados = "";
	
	dados += "nome=" + document.getElementById("nome").value;
	dados += "&status=" + document.getElementById("status").value;
	dados += "&local=" + document.getElementById("local").value;
	dados += "&iniciop=" + document.getElementById("iniciop").value;
	dados += "&inicioc=" + document.getElementById("inicioc").value;
	dados += "&fimc=" + document.getElementById("fimc").value;
	dados += "&saidap=" + document.getElementById("saidap").value;
	dados += "&cod=" + document.getElementById("cod").value;
	
	return dados;
}

function gravar() {

	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	       var msg = xhttp.responseText;
	       document.getElementById("msg").innerHTML = msg;
	       if (msg == "Gravado com sucesso.") {
	    	   document.getElementById("msg").className = "alert alert-success";   
	    	   
	       }else {
	    	   document.getElementById("msg").className = "alert alert-danger";
	       }
	    }
	};
	xhttp.open("GET", "servletPainel?"+dadosForm(), true);
	xhttp.send();
	
}

function apagar(){
	
	if (confirm("Realmente deseja apagar este registro??")) {
		
	
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	       var msg = xhttp.responseText;
	       document.getElementById("msg").innerHTML = msg;
	       if (msg == "Gravado com sucesso.") {
	    	   document.getElementById("msg").className = "alert alert-success";   
	    	   document.getElementById("msg").innerHTML = "Apagado com sucesso.";
	    	   document.getElementById("formulario").reset();
	    	   
	       }else {
	    	   document.getElementById("msg").className = "alert alert-danger";
	    	   document.getElementById("msg").innerHTML = "Erro ao apagar.";
	       }
	    }
	};
	xhttp.open("GET", "servletPainel?"+dadosForm()+"&apagar", true);
	xhttp.send();
	}
}

function novo(){
	window.location.replace('GerenciarPainel.jsp?')
	
}

</script>

<%

Painel painel = new Painel();
if (request.getParameter("cod") != null){
	int cod = Integer.parseInt(request.getParameter("cod"));
	painel = painel.getPainel(cod);
}



%>




<div class="container">
<h2>Gerenciar Painel dos Pacientes no Centro Cirúrgico</h2>
<form id="formulario">
<input type="hidden" id="cod" value="<%out.print(painel.getCod()); %>"  />
<div id="msg" style="width: 200px"></div>
<br>
  <div class="row">
    <div class="form-group col-md-5">
      <label for="nome">Nome do Paciente:</label> <input
							type="text" name="nome" 
							value="<%out.print(painel.getNomeCompleto()); %>" 
							class="form-control" id="nome"
							placeholder="Nome do Paciente">
    </div>
    <div class="form-group col-md-3">
      <label for="sel1">Status:</label> <select
							class="form-control"  id="status" name="status">
								<option>Pré-Operatório</option>
								<option>Em Operação</option>
								<option>Em Repouso</option>
								<option>Operacão Falha</option>
	</select>
	<script>
	document.getElementById("status").value = "<% out.print(painel.getStatus()); %>";
	</script>
    </div>
    <div class="form-group col-md-3">
    <label for="loc">Local:</label> <input name="local" type="text"
							class="form-control"
							value="<% out.print(painel.getLocal()); %>"
							id="local" placeholder="Sala/Quarto">
    </div>
  </div>
  <br>
 <div class="row">
 <div class="form-group col-md-3">
  <label for="usr">Inicio Previsto:</label> <input
							type="time" class="form-control" id="iniciop" value="<% out.print(painel.getIniPrevisto()); %>" name="iniciop">
</div>
	<div class="form-group col-md-3">
	<label for="usr">Inicio Cirurgia:</label> <input
							type="time" class="form-control" id="inicioc" value="<% out.print(painel.getIniCirurgia()); %>" name="inicioc">
	</div>
	<div class="form-group col-md-3">
	<label for="usr">Fim da Cirurgia:</label> <input
							type="time" class="form-control" id="fimc"value="<% out.print(painel.getFimCirurgia()); %>" name="fimc">
	</div>
	<div class="form-group col-md-3">
	<label for="usr">Saida Prevista:</label> <input
							type="date" class="form-control" id="saidap" value="<% out.print(painel.getSaidaPrevista()); %>" name="saidap">
	</div>
  

  </div>
  <br>
  <button type="button" class="btn btn-dark" onclick="novo()" >Novo</button>
	<button type="button" class="btn btn-primary" onclick="gravar()" >Gravar</button>
	<button type="button" class="btn btn-danger" onclick="apagar()" >Apagar</button>
</form>
</div>
</body>
</html>
