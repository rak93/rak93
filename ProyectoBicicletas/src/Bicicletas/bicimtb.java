package Bicicletas;

public class bicimtb {
	private String marca;
	private String modelo;
	private suspensiones suspension;
	private byte numPlatos;
	private boolean esNueva;
	private float precio;
	private short velocidad;
	private boolean averiada;
//prueba
	public bicimtb() {
		super();
		this.marca = "";
		this.modelo = "";
		this.suspension = suspension.RIGIDA;
		this.numPlatos = 1;
		this.esNueva = true;
		this.precio = 0f;
		this.velocidad = 0;
		this.averiada = false;
	}

	public bicimtb(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.suspension = suspension;
		this.numPlatos = numPlatos;
		this.esNueva = esNueva;
		this.precio = precio;
		this.velocidad = velocidad;
		this.averiada = averiada;
	}

	public bicimtb(String marca, String modelo, Bicicletas.suspensiones suspension, byte numPlatos, boolean esNueva,
			float precio, short velocidad, boolean averiada) {
		// contructor con todos los valores
		this.marca = marca;
		this.modelo = modelo;
		this.suspension = suspension;
		this.numPlatos = numPlatos;
		this.esNueva = esNueva;
		this.precio = precio;
		this.velocidad = velocidad;
		this.averiada = averiada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public suspensiones getSuspension() {
		return suspension;
	}

	public void setSuspension(suspensiones suspension) {
		this.suspension = suspension;
	}

	public byte getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(byte numPlatos) {
		this.numPlatos = numPlatos;
	}

	public boolean isEsNueva() {
		return esNueva;
	}

	public void setEsNueva(boolean esNueva) {
		this.esNueva = esNueva;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public short getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(short velocidad) {
		this.velocidad = velocidad;
	}

	public void estropear() {

		this.averiada = true;
	}

	public void reparar() {
		
		if (this.averiada) {
			System.out.println("Estamos reparando");
			this.averiada = false;
		}
		else {
			System.out.println("No puede reparar una bici en buen estado");
		}
	}
	public void acelerar() {
		if(this.averiada) {
			System.out.println("No podemos acelerar su bici esta estropeado");
		}
		else {
		this.velocidad+=10;
		System.out.println("Acelerando mi velocidad es "+this.velocidad);
		}
	}
	@Override
	public String toString() {
		return "bicimtb [marca=" + marca + ", modelo=" + modelo + ", suspension=" + suspension + ", numPlatos="
				+ numPlatos + ", esNueva=" + esNueva + ", precio=" + precio + ", velocidad=" + velocidad + ", averiada="
				+ averiada + "]";
		
	}

}
