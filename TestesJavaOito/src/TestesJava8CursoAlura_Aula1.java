import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestesJava8CursoAlura_Aula1 {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumer = new ImprimirConsumer();
		Comparator<String> comparatorString = new OrdenarStringPeloTamanho();
		
		palavras.sort(comparatorString);
		
		palavras.forEach(consumer);
	}
}

class ImprimirConsumer implements Consumer<String>{

	@Override
	public void accept(String palavra) {
		System.out.println("palavra = " + palavra);
	}
}

class OrdenarStringPeloTamanho implements Comparator<String>{

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
	
}
