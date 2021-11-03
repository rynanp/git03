package licoes;
import java.util.Scanner;
public class Faixaetari{
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int aa, an, id;
		System.out.println("Entre com o ano de nascimento");
		an = in.nextInt();
		System.out.println("Entre com o ano atual");
		aa = in.nextInt();
		id = aa-an;
		if (id<10) {
			System.out.println("Sua idade é "+id+" criança");
		} else if (id >= 10 && id < 18) {
		      System.out.println("Sua idade é "+id+" adolescente");
		} else if (id >= 18 && id < 60) {
		     System.out.println("Sua idade é "+id+" adulto");
		} else {
			System.out.println("sua idade é "+id+" idoso");
		
		              }
		    }
		}
              

