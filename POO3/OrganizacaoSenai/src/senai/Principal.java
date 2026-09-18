package senai;

public class Principal {

	public static void main(String[] args) {
		UnidadeSenai uniSenai = new UnidadeSenai("SENAI Valença");
		
		Departamento ti = new Departamento(1, "Tecnologia da informação", "(24) 999999999");
		Departamento ad = new Departamento(2, "Administração", "(24) 111111111");
		
		Funcionario a = new Funcionario(1, "Ana", "Financeiro", 150);
		Funcionario b = new Funcionario(2, "Bruno", "Logística e Operações", 120);
		Funcionario c = new Funcionario(3, "Eduardo", "Atendimento ao usuário", 250);
		Funcionario d = new Funcionario(4, "Eduarda", "Gestão de redes", 240);
		
		ad.adicionarFuncionario(a);
		ad.adicionarFuncionario(b);
		ti.adicionarFuncionario(c);
		ti.adicionarFuncionario(d);
		
		
		uniSenai.adicionarDepartamento(ti);
        uniSenai.adicionarDepartamento(ad);
		
		uniSenai.exibirEstrutura();
		
		
		
		
		

	}

}
