/* Crie uma classe chamada Ingresso que possui um valor em reais e um método Valor():
 * a) Crie uma classe Vip que herda Ingresso e possui um valor adicional. Crie um método que retorne o valor do ingresso Vip(com adicional incluído).
 * b) Crie uma classe Camarote.
 * c) Mostre os valores na classe Main.
 */
 
 
 public class Ingresso {
	 private String nome;
	 private String CPF;
	 int preco = 50;
	 
	 public Ingresso() {
		 
	 }
	 public Ingresso(String nome, String CPF, int preco) {
		 this.nome = nome;
		 this.CPF = CPF;
		 this.preco = preco;
	 }
	 
	 public String getNome( ) {
		 return nome;
		 
	 }
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getCPF() {
		 retunr CPF;
	 }
	 
	 public void setCPF(String CPF) {
		 this.CPF = CPF;
	 }
	 
	 public void setPreco(int preco) {
		 this.preco = preco;
	 }
	 
	 public String dados() {
		 return "Informações do Ingresso";
		 return "\nNome: " + nome;
		 return "\nCPF: " + CPF;
		 return "\nTotal Pista Padrão R$: " + preco;
	 }
}
 
