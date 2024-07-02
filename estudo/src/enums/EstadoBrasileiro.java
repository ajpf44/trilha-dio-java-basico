package enums;

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo"),
	RIO_JANEIRO("RJ", "Rio de Janeiro"),
	CEARA("CE", "Ceará"),
	BAHIA("BH", "Bahia");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getNomeMaisculo() {
		return this.nome.toUpperCase();
	}
	
	public String getNomeMinusculo() {
		return this.nome.toLowerCase();
	}
}
