package application;

import herancas_parte_2.Aluno;
import herancas_parte_2.Bolsista;
import herancas_parte_2.Visitante;
import herancas_parte_2.Pessoa;
import herancas_parte_2.Professor;
import herancas_parte_2.Tecnico;

public class Program {

	public static void main(String[] args) {

		Aluno a[] = new Aluno[2];
		Bolsista b[] = new Bolsista[2];
		Visitante v[] = new Visitante[2];
		Professor p[] = new Professor[2];
		Tecnico t[] = new Tecnico[2]; 
		
		v[0] = new Visitante(); 
		b[0] = new Bolsista();
		a[0] = new Aluno(); 

		v[0].setIdade(22);
		v[0].setSexo("M");
		v[0].setNome("Morris"); 
		
		a[0].setNome("Alice");
		a[0].setIdade(19);
		a[0].setSexo("F");
		
		
		b[0].setNome("Melisandre");
		b[0].setIdade(26);
		b[0].setSexo("Trans");
		
		
		System.out.println(v[0]);
		

	}

}
