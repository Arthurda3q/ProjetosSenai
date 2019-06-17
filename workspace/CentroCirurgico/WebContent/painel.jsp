<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="org.senai.cntrCirurgico.modelo.Painel"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina do Paciente</title>
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

	<div class="container">

		<img
			src="http://www.df.gov.br/wp-conteudo/uploads/2015/10/Bandeira_do_Distrito_Federal_Brasil.png"
			style="width: 150px" align="left" />
		<h2>
			<br>
		</h2>
		<p>Hospital Regional de Taguatinga |</p>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Nome do Paciente</th>
					<th>Status</th>
					<th>Início<br>Previsto
					</th>
					<th>Início da<br>Cirurgia
					</th>
					<th>Fim da <br>Cirurgia
					</th>
					<th>Saída<br>Prevista
					</th>
				</tr>
			</thead>
			<tbody>
			
			<script>
			
			function prepararEditar(cod){
				window.location.replace('GerenciarPainel.jsp?cod='+cod)
			}
			
			</script>
				<%
					Painel painel = new Painel();
					for (Painel p : painel.getLista()) {
						out.print("<tr onclick='prepararEditar("+p.getCod()+")'>");
						//out.print("<td>" + p.getCod()+"</td>");
						out.print("<td>" + p.getNomeCompleto() + "</td>");
						out.print("<td class='"+p.getCorStatus()+"'>" + p.getStatus() + "</td>");
						//if (p.getStatus().equals("Pré-Operatório")){
						//	out.print("<td class='table-info'>"+p.getStatus()+"</td>");
						//}
						//if (p.getStatus().equals("Em Repouso")){
						//	out.print("<td class='table-success'>"+p.getStatus()+"</td>");
						//}
						//if (p.getStatus().equals("Em Operação")){
						//	out.print("<td class='table-warning'>"+p.getStatus()+"</td>");
						//}
						//if (p.getStatus().equals("Operacão Falha")){
						//	out.print("<td class='table-danger'>"+p.getStatus()+"</td>");
						//}
						out.print("<td>" +p.getIniPrevisto()+"</td>");
						out.print("<td>" +p.getIniCirurgia()+"</td>");
						out.print("<td>" +p.getFimCirurgia()+"</td>");
						out.print("<td>" +p.getSaidaPrevista()+"</td>");
						out.print("</tr>");
					}
				%>
			</tbody>
		</table>


	</div>

</body>
</html>