import java.util.Date;

public class Feriado {

	public Long id;
	public String tipoFeriado;
	public String descricao;
	public Date data;
	
	public String toString() {
		return String.format("tipo : %s \n  - descrição: %s \n   -  data :  %s \n -dias faltantes : ", tipoFeriado, descricao , data);
	
	}
	
}
