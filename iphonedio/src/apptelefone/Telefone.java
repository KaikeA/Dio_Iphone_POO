package apptelefone;

public class Telefone implements TelefoneService {
	public void ligar() {
		System.out.println("Ligando para: ");
		
	}
	public void atender() {
		System.out.println("Atendeu telefone");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio Voz");
	}

}
