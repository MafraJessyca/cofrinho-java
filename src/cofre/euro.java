package cofre;

//heRanca
public class euro extends moeda {
	
	public euro(double valor) {
		super (valor);
	}
	public double converter() {
		return valor * 6; 
	}

}

