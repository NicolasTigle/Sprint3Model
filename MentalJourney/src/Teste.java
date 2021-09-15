import model.Agenda;
import model.Atividade;
import model.Relato;
import model.UsuarioAdmin;
import model.UsuarioComum;

public class Teste {
	public static void main(String[] args) {
		UsuarioComum vc = new UsuarioComum();
		Atividade atv = new Atividade();
		Agenda agen = new Agenda();
		Relato relato = new Relato("Gostei bastante desta página web.");
		UsuarioAdmin adm = new UsuarioAdmin("Nicolas@123", "12345678910");
	
		vc.setNome("Victor");
		vc.setEmail("victor@123");
		vc.setSenha("12345678");
		vc.setDataNasc("14/08/2002");
		vc.setTelefone(996734569);
		vc.setEmailReserva("victorRubem@1234");
		vc.setResultTesteAnsiedadeAtual(1);
		
		atv.setTipo("Exercicio físico");
		atv.setNome("Abdominal");
		atv.setNivelIntensidade(2);
		atv.setDescricao("Esta atividade deve ser feita deitado em uma colchonete.");
		
		agen.setDataInicio("18/05/2021");
		agen.setDataTermino("19/05/2021");
		
		
		System.out.println(vc);
		
		System.out.println(adm);
		
		System.out.println(atv);
		
		System.out.println(agen);
		
		System.out.println(relato);
		
		System.out.println(vc.logar("victor@123", "12345678"));
		
		System.out.println(adm.logar("Nicolas@123", "12345678910"));
		
		
	
	}

}
