package herancas_parte_2;

public class Bolsista extends Aluno {
	//ATRIBUTO
	private int bolsa;
	
	//METODOS PERSONALIZADOS
	public void renovarBolsa() {
		System.out.println("Bolsa do aluno(a) " + this.getNome() + " renovada!");
	}
	
	@Override	//Metodo sobreposto
	public void pagarMensalidade() {
		System.out.println("\n" + this.getNome() + " é bolsista! [...]" + " Pagamento facilitado");
	}
	
	//METODOS ESPECIAIS
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int b) {
		this.bolsa = b;
	}

}
