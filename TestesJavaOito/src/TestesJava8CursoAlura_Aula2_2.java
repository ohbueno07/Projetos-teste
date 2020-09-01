import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestesJava8CursoAlura_Aula2_2 {
	
	/*
     * Tentando fazer a mesma coisa do comeco da aula 2, soh que usando lambda 
     */
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		// SORT 
		
		// primeira forma
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length());
		});
		
		// forma mais simples
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// method reference: forma mais simples ainda
		palavras.sort(Comparator.comparing(String::length));
		//palavras.sort(String.CASE_INSENSITIVE_ORDER);		
		
		
		// FOR EACH
		
		// com tipagem, parenteses e colchetes
		palavras.forEach((String s) -> {
			//System.out.println(s);
		});
		
		// ou
		// sem tipagem, sem parenteses e sem colchetes
		palavras.forEach(s -> System.out.println(s));
		System.out.println("");
		
		// method reference
		palavras.forEach(System.out::println);
		
		//new Thread(() -> System.out.println("Executando um Runnable")).start();	
		
	}
	
	

}
