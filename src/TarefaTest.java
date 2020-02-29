import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class TarefaTest {
	
	public static void main(String[] args) {
		
		Tarefa obj = new Tarefa();
		obj.titulo ="EUA";
		obj.descricao ="fic��o ci�ntifica";
		obj.dataPrevista = new Date();
		
		LocalDate date = LocalDate.of(2021, 12 , 10);
		obj.dataPrevista = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		
		
		System.out.println("descri��o : "+ obj.descricao);
		System.out.println("titulo :"+ obj.titulo);
		System.out.println("data prevista :" +obj.dataPrevista);
		
		System.out.println(obj.toString());/* toString � um metodo criado na classe Tarefa */
		
		
	}

}
