import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.br.octavio.estudo.model.Curso;

public class TestesJava8CursoAlura_Aula5 {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Phython", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// filtra cursos que tenham mais que 50 alunos 
		// e busca o primeiro elemento (curso).
		// Porem, nao recebo esse primeiro elemento, porque nao criei uma variavel pra receber esse valor
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .findFirst();
		
		// calcula a media de alunos que tem em todos os cursos
		OptionalDouble media = cursos.stream()
		    .mapToInt(c -> c.getAlunos())
		    .average();
		
		System.out.println("media = " + media);
		
		// consegue devolver um list, em vez de stream
		cursos = cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .collect(Collectors.toList());
		
		//cursos.forEach(System.out::println);
		
		// imprime os novos cursos com o filtro anterior: somente o que possui mais de 50 alunos 
		cursos.stream()
		.forEach(c -> System.out.println(c.getAlunos()));
		
		
		
	}

}
