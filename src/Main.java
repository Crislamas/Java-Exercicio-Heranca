
import javax.swing.JOptionPane;

public class Main {
	@SuppressWarnings("empty-statement")
	public static void main(String[] args) {
		Vip InVip;
		Ingresso pista;
		Camarote InCamaro;
		
		String tipo[] = {"Ingresso", "Ingresso VIP", "Camarote", "Sair"};
		String opUsr;
		
		String nome = JOptionPane.showInputDialog(null, "Nome do Cliente: ", "Rock in Program", 3);
		String cpf = JOptionPane.showInputDialog(null, "CPF do Cliente: ", "Rock in Program", 3);
		opUsr = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada: ", "Banco", 3, null, tipo, tipo[0]);
		
		switch (opUsr) {
		case "Ingresso":
		pista = new Ingresso(nome, cpf);
		JOptionPane.showMessageDialog(null, pista.dados()"Rock in Program", 1);
		break;
		
		case "Ingresso VIP":
		InVip = new VIP(nome, cpf);
		JOptionPane.showMessageDialog(null, InVip.dados()"Rock in Program", 1);
		break;
		
		case "Camarote":
		InCamaro = new Camarote(nome, cpf);
		JOptionPane.showMessageDialog(null, InCamaro.dados()"Rock in Program", 2);
		break;
		
		
		}
		
		while(!opUsr.equals("sair"));
	}

}
