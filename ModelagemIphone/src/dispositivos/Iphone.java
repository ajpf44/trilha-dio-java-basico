package dispositivos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorDaInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDaInternet, ReprodutorMusical{
	private boolean ligado;
	private String[] emails;
	private void irParaHome() {
		System.out.println("indo para home");
	}
	
	public void novoPapelDeParede(String foto) {
		System.out.println("adicionanndo " + foto+ " como papel de parede");
	}
	
	public void ligarAparelho() {
		this.ligado = true;
	}
	
	public void desligarAparelho() {
		this.ligado = false;
	}
	
	public void lerEmails() {
		System.out.println("lendo os emails");
		for(String email: this.emails) {
			System.out.println(email);
		}
	}
	
	public void enviarEmail(String conteudo, String emailTo) {
		System.out.println("Enviando email para "+ emailTo);
	}
	
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("TOCANDO MÚSICA NO IPHONE");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSANDO MÚSICA NO IPHONE");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("SELECIONANDO MÚSICA NO IPHONE");
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("exibindo páginad de url: "+ url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("adicionando nova aba no iphone");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("atualizando a página no iphone");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("ligando para " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("atendendo ligação recebida");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		// TODO Auto-generated method stub
		System.out.println("iniciando correio de voz");
	}

}
