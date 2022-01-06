import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a data de nascimento no exato formato ou não vai funcionar fdpa: *dd/MM/aaaa* ");
		String auxData = sc.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2016/11/16
		
		
		try {
		    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		    Date format = f.parse(auxData);
		    System.out.println(auxData);
		} catch ( ParseException exc ) {
		    System.out.println( "O QUE EU DISSE PORRA!" );
		}
		
	}

}
