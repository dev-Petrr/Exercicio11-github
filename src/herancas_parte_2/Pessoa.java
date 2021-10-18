package herancas_parte_2;

//Esta classe não pode ser instanciada. Abstrata;
public abstract class Pessoa {	
	//ATRIBUTOS
	private String nome, sexo;
	private int idade; 
	
	//Metodo final não pode ser sobrescrito.	
	public final void fazerAniversario() {
		this.setIdade(getIdade() + 1); //setta em idade mais um ano;
	}

	//METODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String s) {
		this.sexo = s; 
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int id) {
		this.idade = id; 
	}
	@Override
	public String toString() {
		return "-- DADOS -- \n"
				+ "Nome: " + this.getNome() 
				+ ". Sexo: " + this.getSexo()
				+ ". Idade: " + this.getIdade()
				+ "\n ---------------- \n";
	}
}
