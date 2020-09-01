import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestesJava8CursoAlura_Aula2_1 {
	
	/*
     * Tentando fazer a mesma coisa da aula 1, soh que de um jeito mais facil 
     */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort(new Comparator<String>() {
			
			@Override
			public int compare(String palavra1, String palavra2) {
				
				// quando for maior, retorna um numero positivo
				if(palavra1.length() > palavra2.length()) {
					return 1;
				}
				
				// quando for menor, retorna um numero negativo
				if(palavra1.length() < palavra2.length()) {
					return -1;
				}
				
				// quando for empate, retorna 0
				return 0;
			}
		});
		
		palavras.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String palavra) {
				System.out.println("palavra = " + palavra);
			}
		});
		
	}
	
	
		

}





