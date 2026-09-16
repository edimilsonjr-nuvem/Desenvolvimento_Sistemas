package academia;

public class app {

	public static void main(String[] args) {
		alunoAcademia aluno1 = new alunoAcademia("Ana", 17, 60, 1.65);
		alunoAcademia aluno2 = new alunoAcademia("Bruno", 25, 80, 1.80);
		
		aluno1.exibirDados();
		
		System.out.println();
		
		aluno2.exibirDados();
		
		System.out.println();
		
		aluno2.peso = 78;
		
		aluno2.exibirDados();
	}

}
