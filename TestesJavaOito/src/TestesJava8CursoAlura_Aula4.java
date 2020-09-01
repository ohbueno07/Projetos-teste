import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.br.octavio.estudo.model.Curso;

public class TestesJava8CursoAlura_Aula4 {
	
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Phython", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// ordena de acordo com a quantidade de alunos do curso
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		// imprime a quantidade de alunos
		//cursos.forEach(c -> System.out.println(c.getAlunos()));
		
		// filtra usando stream e imprime apenas valores maiores que 100
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.forEach(c -> System.out.println(c.getAlunos()));
		
		// agora salva em uma variavel: filtra apenas valores maiores que 100 e retorna o nome do curso
		Stream<String> s = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.map(Curso::getNome);
		
		s.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("----");
		System.out.println("");
		
		// filtra usando stream e imprime apenas valores maiores que 50: imprime o que esta no map
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
	}
	

}
