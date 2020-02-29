import java.util.Date;

public class FeriadoTest {
	public static void main(String[] args) {
		 /* aqui ficam instanciadas os objetos da classe Feriado criada anteriormente que foram nomeadas com o ponteriro de nome obj*/
		Feriado obj = new Feriado();
		obj.tipoFeriado = " natal";
		obj.descricao = "natal";
		obj.data = new Date();
		
		
		
		obj.data = DateTimeUtils.toDate(25, 12, 2020);
		
		/*Date dataFeriado = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());*/
		
		System.out.println("tipo de feriado :" + obj.tipoFeriado);
		System.out.println("descrição :" + obj.descricao);
		System.out.println("data de lançamento : "+ obj.data);
		System.out.println(obj.toString());
		
		
		
		
		
	}

}
