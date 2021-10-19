package herancas_parte_2;

public class Tecnico extends Aluno {
	//ATRIBUTOS
	private int registroProfissional;
	
	//METODOS PERSONALIZADOS
	public void praticar() {
		System.out.println("Praticando. [...] ");
		
	}
	public int getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(int rp) {
		this.registroProfissional = rp;
	}
	
}
