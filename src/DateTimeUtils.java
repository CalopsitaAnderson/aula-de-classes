import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeUtils {

	public static Date toDate(int dia , int mes , int ano) {
		LocalDate Id = LocalDate.of(ano, mes, dia);
		
		return Date.from(Id.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
}
