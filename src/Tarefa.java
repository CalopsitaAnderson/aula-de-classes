import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Tarefa {
	
/* esses sao os campos do banco de dados */
	
	public Long id;
	public String titulo;
	public String descricao;
	public Date dataPrevista;
	
	
	public String  toString() {
		return String.format("titulo: %s /n - descri��o: %s /n -  data de lana�amento:  %s /n - dias faltantes %s  " , titulo , descricao , dataPrevista, getDias());
		
		
	} 
	
	public long getDias() {
		LocalDate localDataPrevista = dataPrevista.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return LocalDate.now().until(localDataPrevista, ChronoUnit.DAYS);
		
		
		
		
		
	}
	
}
