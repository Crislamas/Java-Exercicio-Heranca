
public class Camarote extends Ingresso {
	private int valorExtra = 70;
	
	public Camarote(String nome, String CPF, int preco) {
		super(nome, CPF, preco);
		this.valorExtra = valorExtra;
	}
	
	public Camarote(String nome, String CPF) {
		super(nome, CPF);
		valorExtra = 70;
	}
	
	public void setValorExtra(int valorExtra) {
		int precoCamarote = setPreco();
		return precoCamarote;
	}
	
	private int setPreco() {
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	@Override
	public String dados() {
		return super.dados();
		return "\nValor Camarote a ser acrescentado R$: " + valorExtra;
		return "\nValor Camarote total R$: " + precoCamarote();
	}
}

