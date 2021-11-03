package licoes;
import java.util.Scanner;
public class Calculoeconomico {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int ct, Kmandados, Kml;
		System.out.println("Entre com a capacidade do tanque");
		ct = in.nextInt();
		System.out.println("Entre com a quantidade de KM andados");
		Kmandados = in.nextInt();
		Kml = Kmandados/ct;
		if (Kml<10) {
			System.out.println("não Ecônomico");
		}else if (Kml>=10) {
			System.out.println("Ecônomico");
		}
			
			
				
				
				
		
		
		
	
		
	}
}
