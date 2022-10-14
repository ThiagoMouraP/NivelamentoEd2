package ed2;

public class Cabo {
	private String modelo;
	private String marca;
	private int comprimento; //em cm
	
	public Cabo(String modelo, int comprimento) {
		this.modelo = modelo;
		this.comprimento = comprimento;
	}

	public String getModelo() {
		return modelo;
	}

	public int getComprimento() {
		return comprimento;
	}
	
	
}
