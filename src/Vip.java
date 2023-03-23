
public class Vip  extends Ingresso {
	private int valorAdicional = 40;
	
	public Vip(String nome, String CPF, int preco, int valorAdicional) {
		super(nome, CPF, preco);
		this valorAdicional = valorAdicional;
	}
	
	public Vip (String nome, String CPF) {
		super(nome, CPF);
		valorAdicional = 40;
	}
	
	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public String dados() {
		return super.dados();
		return "\nValor VIP acrescentado R$: " + valorAdicional;
		return "\nValor VIP total R$: " + precoVip();
	}

}
