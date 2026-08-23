package cofre;
 // superClasse
abstract class moeda {
	protected double valor;

	public moeda(double valor) {
		this.valor = valor; 
	}
	
	//polimorFismo 
	public abstract double converter();
	public double getValor() {
		return valor;
	}
	
}
