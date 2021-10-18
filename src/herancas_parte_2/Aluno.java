package herancas_parte_2;

//HERANÇA PRA DIFERENÇA
public class Aluno extends Pessoa {
	//ATRIBUTOS
	private int matricula;
	private String curso;
	
	//METODO PERSONALIZADO
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade [...]");
	}
	
	//METODOS ESPECIAIS
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int mt) {
		this.matricula = mt;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String c) {
		this.curso = c;
	}

}
