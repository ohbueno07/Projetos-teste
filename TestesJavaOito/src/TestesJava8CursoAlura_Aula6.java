import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestesJava8CursoAlura_Aula6 {
	
	public static void main(String[] args) {
		
		// data atual
		LocalDate now = LocalDate.now();
		System.out.println("now = " + now);
		
		// data colocada 'na mao'
		LocalDate finalSeculo = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println("finalSeculo = " + finalSeculo);
		
		// classe Period: calcula diferenca entre datas
		Period diferencaEntreDatas = Period.between(now, finalSeculo);
		System.out.println(diferencaEntreDatas.getYears());
		
		// formatar datas
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("now formatted = " + now.format(formatador));
		
		// TESTES OCTAVIO
		//DateTimeFormatter formatadorSemBarra = DateTimeFormatter.ofPattern("yyyyMMdd");
		//System.out.println("now formatted = " + now.format(formatadorSemBarra));
		
		//String dataString = "11/11/2019";
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		//LocalDate dt = dtf.parseLocalDate(dataString);
		
		//String date = "11/11/2019";

        //default, ISO_LOCAL_DATE
        //LocalDate localDate = LocalDate.parse(date);

        //System.out.println(localDate);
        
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        //String dateNew = "16/08/2016";
		
		LocalDate nowMesAno = LocalDate.now();
		DateTimeFormatter formatterMesAno = DateTimeFormatter.ofPattern("MM/yyyy");
		System.out.println("now formatted mes/ano = " + nowMesAno.format(formatterMesAno));
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateNew = "11/11/2019";
        
        

        //convert String to LocalDate
        LocalDate localDateNew = LocalDate.parse(dateNew, formatter);
        System.out.println("localDateNew = " + localDateNew);
        
        //DateTimeFormatter formatadorSemBarra = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter formatadorSemBarra = DateTimeFormatter.ofPattern("yyMMdd");
        System.out.println("now formatted = " + localDateNew.format(formatadorSemBarra));
        
        // HOUR
        LocalTime hourNow = LocalTime.now();
        System.out.println(hourNow);
        
        System.out.printf("Hour: %s%n", hourNow.getHour());
        System.out.printf("Minute: %s%n", hourNow.getMinute());
        System.out.printf("Second: %s%n", hourNow.getSecond());
        
        //DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
        //System.out.println(now.format(dtf2));
        
	}

}
