package questao7prova;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		String login1;
		String senha1;
		boolean logou = false;
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minuto = calendar.get(Calendar.MINUTE);
		
		
		System.out.println("Digite o seu login.");
		login1 = entrada.nextLine();
		
		System.out.println("Digite a sua senha.");
		senha1 = entrada.nextLine();
		
		
		
		for(int i = 0; i < usuario.getLogin().length ; i++) {
			if(usuario.getLogin()[i].equals(login1) && usuario.getSenha()[i].equals(senha1)) {
				logou = true;
			
			}else {

			}
		}
		
		if(logou == true){
			System.out.println("Usuario logado com sucesso às " + hora + ":" + minuto);
		}else{
			System.out.println("Usuario e/ou senha incorretos.");
		}
		
		switch((6 <= hora && hora < 12) ? 0 :
			(12 <= hora && hora < 18) ? 1 :
				(18 <= hora && hora < 24) ? 2 :
					(00 <= hora && hora < 6 ? 3 : 4)) {
		case 0:
			System.out.println("Bom dia, você se logou ao nosso sistema.");
			break;
		case 1:
			System.out.println("Boa tarde, você se logou ao nosso sistema.");
			break;
		case 2:
			System.out.println("Boa noite, você se logou ao nosso sistema.");
			break;
		case 3:
			System.out.println("Boa madrugada, você se logou ao nosso sistema.");
			break;
		case 4:
			System.out.println("Erro no sistema.");
			break;
		}
	}
}
