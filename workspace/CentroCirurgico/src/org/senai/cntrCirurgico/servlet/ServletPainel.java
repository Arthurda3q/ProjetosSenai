package org.senai.cntrCirurgico.servlet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.senai.cntrCirurgico.modelo.Painel;

@WebServlet(name = "servletPainel", urlPatterns = "/servletPainel")

public class ServletPainel extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {

		String nome = request.getParameter("nome");
		String status = request.getParameter("status");
		String local = request.getParameter("local");
		String iniciop = request.getParameter("iniciop");
		String incioc = request.getParameter("inicioc");
		String fimc = request.getParameter("fimc");
		String saidap = request.getParameter("saidap");
		System.out.println("Nome: " + nome);
		System.out.println("Status: " + status);
		System.out.println("Local: " + local);
		System.out.println("Inicio Previsto: " + iniciop);
		System.out.println("Inicio Cirurgia: " + incioc);
		System.out.println("Fim da Cirurgia: " + fimc);
		System.out.println("Saida Prevista: " + saidap);

		Painel obj = new Painel();
		obj.setNomeCompleto(nome);
		obj.setStatus(status);
		obj.setLocal(local);
		obj.setIniPrevisto(iniciop);
		obj.setIniCirurgia(incioc);
		obj.setFimCirurgia(fimc);
		obj.setSaidaPrevista(saidap);
		
		PrintWriter saida = response.getWriter();
		
		int cod = Integer.parseInt(request.getParameter("cod"));
		boolean sucesso = false;
		if (cod > 0) {
			obj.setCod(cod);
			if (request.getParameter("apagar")==null) {
				sucesso = obj.atualizar();
			}else{
				sucesso = obj.apagar();
			}
		}else {
			sucesso = obj.inserir();
		}
		
		if (sucesso) {
			saida.print("Gravado com sucesso.");
		}else {
			saida.print("Erro ao gravar.");
		}
	}

}
