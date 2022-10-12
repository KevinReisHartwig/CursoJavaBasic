package construtores.encapsulamento;


public class ex1 {
	
	private String modelo;
	private String tensao;
	private int garantia;
	private String cor;
	private int potencia;
	private String tipoLuz;
	private boolean ligada;
	
	
	
	public boolean isLigada() {
		return ligada;
		}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
			
	
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	private boolean tipoAbajur;
	private String[] tipos;
	
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
		
	}
	
	public void mostrarEstado() {
		if(isLigada()) {
			System.out.println("lampada ligada");
		}else {
			System.out.println("lampada desligada");
		}
	
	}
	public void mudarEstado() {
		if(isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}
	

}
