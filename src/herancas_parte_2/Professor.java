package herancas_parte_2;

public class Professor extends Pessoa {
	//ATRIBUTOS
	private String especialidade;
	private double salario;
	
	//METODOS PERSONALIZADOS
	public void receberAumento(double aum) {
		this.setSalario(getSalario() + aum);
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String esp) {
		this.especialidade = esp; 
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double sl) {
		this.salario = sl; 
	}

}
