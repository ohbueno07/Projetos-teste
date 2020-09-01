import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaTestes {
	
	public static void main(String[] args) {
		Usuario usuarioQuarenta = new Usuario(40);
		Usuario usuarioCinquenta = new Usuario(50);
		Usuario usuarioSessenta = new Usuario(60);
		Usuario usuarioDez = new Usuario(10);
		Usuario usuarioVinte = new Usuario(20);
		Usuario usuarioTrinta = new Usuario(30);
		
		List<Usuario> usuarios = Arrays.asList(usuarioQuarenta, usuarioCinquenta, usuarioSessenta, usuarioDez, usuarioVinte, usuarioTrinta);
		
		for(Usuario u : usuarios) {
			System.out.println("Usuario.pontos = " + u.getPontos());
		}
		
		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		
		
		System.out.println(" ");
		for(Usuario u : usuarios) {
			System.out.println("Usuario.pontos = " + u.getPontos());
			System.out.println("Usuario.moderador = " + u.isModerador());
		}
		
		usuarios.subList(0, 2).forEach(Usuario::tornaModerador);
		
		System.out.println(" ");
		for(Usuario u : usuarios) {
			System.out.println("Usuario.pontos = " + u.getPontos());
			System.out.println("Usuario.moderador = " + u.isModerador());
		}
		
		/*
		System.out.println("");
		// filtrei apenas usuarios com pontos maior que 30
		Stream<Usuario> stream = usuarios.stream().filter(u -> u.getPontos() > 30);
		stream.forEach(System.out::println);
		*/
		
		//System.out.println("");
		//System.out.println(usuarios.stream().filter(u -> u.isModerador()));
		
		
		System.out.println("");
		// filtrei apenas usuarios com pontos maior que 30
		// no final, foi o usado o metodo collect(Collectors.toList()), para converter stream para lista
		List<Usuario> usuarioFiltro = usuarios.stream().filter(u -> u.getPontos() > 30).collect(Collectors.toList());
		usuarioFiltro.forEach(System.out::println);
		
		String data = "2017/11/11";
		
		int sizeRegisters = 16;
		String qtdeRegistrosComZeros = "";
		
		int length = String.valueOf(sizeRegisters).length();
		
		System.out.println("length = " + length);
		
		switch(length) {
		  case 0:
			  qtdeRegistrosComZeros = "000000";
		    break;
		  case 1:
			  qtdeRegistrosComZeros = "00000" + sizeRegisters;
		    break;
		  case 2:
			  qtdeRegistrosComZeros = "0000" + sizeRegisters;
		    break;
		  case 3:
			  qtdeRegistrosComZeros = "000" + sizeRegisters;
		  case 4:
			  qtdeRegistrosComZeros = "00" + sizeRegisters;
		    break;
		  case 5:
			  qtdeRegistrosComZeros = "0" + sizeRegisters;
		    break;
		  case 6:
			  qtdeRegistrosComZeros = "" + sizeRegisters;
		    break;
		  default:
			  
		}
		
		
		
		// VER SE HORA TEM UM DIGITO
		LocalTime time = LocalTime.parse("09:59:59");
		
		System.out.println("hour = " + time.getHour());
		
		int lengthHour = String.valueOf(time.getHour()).length();
		
		if(lengthHour == 1) {
			System.out.println("lengthHour = " + lengthHour);
		}
		
		/*
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME; 

		// apply format 
		String value = time.format(formatter); 

		// print result 
		System.out.println("value : " + value); 
		
		//LocalDateTime todayAt6 = LocalDate.now().atTime(6, 0);
		*/
		
	}

}
