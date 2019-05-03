import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;


public class GerenciarAut {

	public static void main(String[] args) {
		
		Autorizacao autorizacao = new Autorizacao();
		
		autorizacao.setNome(JOptionPane.showInputDialog("digite o nome do aluno"));
		autorizacao.setTurma(JOptionPane.showInputDialog("Informe a turma"));
		autorizacao.setCurso(JOptionPane.showInputDialog("digite o curso"));
		
		Object[] oTurno = { "Matutino", "Vespertino", "Noturno" };
		Object turno = JOptionPane.showInputDialog(null, "Selecione o turno",
				"Opções", JOptionPane.DEFAULT_OPTION, null, oTurno,
				oTurno[0]);
		autorizacao.setTurno(turno.toString().charAt(0));
		
		Object[] TipoAuto = { "Saida", "Entrada" };
		Object tipoaut = JOptionPane.showInputDialog(null, "Informe o tipo de autorização",
				"Opções", JOptionPane.DEFAULT_OPTION, null, TipoAuto,
				TipoAuto[0]);
		
		autorizacao.setTipoAut(tipoaut.toString());
		
		autorizacao.setMotivo(JOptionPane.showInputDialog("Informe o Motivo"));
		autorizacao.setResponsavel(JOptionPane.showInputDialog("Qual o nome do responsavel"));
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat formataData = DateFormat.getDateInstance();
		DateFormat hora = DateFormat.getTimeInstance();
		
		JOptionPane.showMessageDialog(
				null,
				"Nome: " + autorizacao.getNome() +"\n"+"Turma: "+ autorizacao.getTurma()+ "\n" + "Curso: "
						+ autorizacao.getCurso()+ "\n"
						+ "Turno: " + autorizacao.getTurno() + "\n" + "Tipo de Autorizacao: "
						+ autorizacao.getTipoAut() + "\n" + "Motivo: "
						+ autorizacao.getMotivo()+ "\nResponsavel: "+ autorizacao.getResponsavel()+"\nData: "+ formataData.format(data));
	
		
	}
}
