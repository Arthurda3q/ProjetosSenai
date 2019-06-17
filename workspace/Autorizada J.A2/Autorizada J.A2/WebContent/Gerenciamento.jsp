<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Grenciar Serviços</title>
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
<div class="container">
<img
			src="https://is.gd/Zaev8B"
			style="width: 70px" align="left" />
<h2>Autorizada J.A</h2>
<font size="2">Relatório de pestação de serviços.</font>
<form id="form">
<div id="msg" style="width: 200px"></div>
<br>
  <div class="row">
    <div class="form-group col-md-4">
      <label for="nome">Nome do Cliente/Empresa:</label> <input
							type="text" name="nome" 
							class="form-control" id="nome"
							placeholder="Nome do Cliente/Empresa">
    </div>
    	<div class="form-group col-md-2">
    <label for="loc">CEP:</label> <input name="local" type="number"
							class="form-control"
							id="local" placeholder="ex: 01001-000">
    </div>
    <div class="form-group col-md-4">
    <label for="loc">Endereço:</label> <input name="local" type="text"
							class="form-control"
							id="local" placeholder="Ex:Casa/Ap:2 ">
    </div>
    <div class="form-group col-md-2">
    <label for="loc">N° Nota Fiscal:</label> <input name="local" type="number"
							class="form-control"
							id="local" placeholder="ex: XXXXXX">
    </div>
  </div>
 <div class="row">
    <div class="form-group col-md-3">
      <label for="sel1">Loja que Vendeu:</label> <select
							class="form-control"  id="status" name="status">
								<option>Gasfilar</option>
								<option>Chama Alternativa</option>
								<option>Campeão da Construção</option>
								<option>Só Reparos</option>
								<option>Tendtudo</option>
								<option>AcCoelho</option>
	</select>
    </div>
    <div class="form-group col-md-2">
      <label for="sel1">Fabricante:</label> <select
							class="form-control"  id="fabrincante" name="fabrincante">
								<option>Emmeti</option>
								<option>Rinnai</option>
								<option>Aqualimp</option>
								<option>G-Light</option>
								<option>Rowa</option>
								<option>Aépio</option>

	</select>
    </div>
    <div class="form-group col-md-2">
    <label for="loc">Produto:</label> <input name="local" type="text"
							class="form-control"
							id="local" placeholder="Nome do Produto">
    </div>
     <div class="form-group col-md-2">
    <label for="loc">N° de Serie:</label> <input name="local" type="text"
							class="form-control"
							id="local" placeholder="N° de Serie">
    </div>
    <div class="form-group col-md-3">
    <label for="loc">Defeito:</label> <input name="local" type="text"
							class="form-control"
							id="local" placeholder="Defeito Alegado">
    </div>
 <div class="form-group col-md-3">
  <label for="usr">Data da visita/Chegada:</label> <input
							type="datetime-local" class="form-control" id="iniciop" 
							 name="iniciop">
</div>
	<div class="form-group col-md-2">
	<label for="usr">Saida:</label> <input
							type="time" class="form-control" id="inicioc" 
							name="inicioc">
	</div>
	<div class="form-group col-md-4">
	<label for="usr">Defeito Apresentado:</label> <input
							type="text" class="form-control" id="saidap" 
							name="saidap" placeholder="Defeito presenciado">
	</div>
	<div class="form-group col-md-3">
	<label for="usr">Nome do Técnico:</label> <input
							type="text" class="form-control" id="saidap" 
							name="saidap">
	</div>
  

  </div>
  <br>
  <button type="button" class="btn btn-dark" onclick="novo()" >Novo</button>
	<button type="button" class="btn btn-primary" onclick="gravar()" >Salvar</button>
	<button type="button" class="btn btn-danger" onclick="apagar()" >Imprimir</button>
</form>
</div>
</body>
</html>