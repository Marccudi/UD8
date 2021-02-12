package Ej4;

public class Serie {
	private String titulo="";
	private int numTemporadas;
	private boolean entregado;
	private String genero="";
	private String creador="";
	
	private final int NUMTEMPORADAS_DEF=3;
	private final boolean ENTREGADO_DEF=false;
	
	//constructor por defecto
	public Serie() {
		this.numTemporadas=this.NUMTEMPORADAS_DEF;
		this.entregado=this.ENTREGADO_DEF;
	}


	//constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.numTemporadas=this.NUMTEMPORADAS_DEF;
		this.entregado=this.ENTREGADO_DEF;
		this.titulo = titulo;
		this.creador = creador;
	}

	//constructor con todos los atributos
	public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}


	//metodo toString
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}	

	
	
}
