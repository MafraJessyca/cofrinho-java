package cofre;
import java.util.ArrayList;

public class listaMoeda {
    private ArrayList<moeda> moedas = new ArrayList<>();
    		
	public void adicionar(moeda moeda) {
		moedas.add(moeda);
	}
	
	public void listaMoedas() {
		if (moedas.isEmpty()) {
			System.out.println("Lista de moedas vazia");
			 return;
		}

		System.out.println("Lista de moedas");
		
		for (moeda moeda: moedas) {
			String tipo = moeda.getClass().getSimpleName();
			       System.out.println(tipo +":" + moeda.getValor());
					
		}
	}
		public void remover(moeda moedarem) {

		    for (int r = 0; r < moedas.size(); r++) {

		        if (moedas.get(r).getValor() == moedarem.getValor() &&
		            moedas.get(r).getClass() == moedarem.getClass()) {

		            moedas.remove(r);
		            System.out.println("Moeda removida!");
		            return;
		        }
		    }

		    System.out.println("Moeda não encontrada!");
	}

		
		
		public double totalConvertido() {
		    double total = 0;

		    for (moeda moeda : moedas) {
		        total += moeda.converter();
		    }

		    return total;
		}
	
}
