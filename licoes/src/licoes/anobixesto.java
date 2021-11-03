package licoes;
import java.util.Scanner;
public class anobixesto {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
       
		int aC = 0, aF, anob = 0; 	
		
		System.out.println("Digite o ano Inicial");
		aC=in.nextInt();
		System.out.println("Digite o ano Final");
		aF=in.nextInt();
		
		do {
			if ((aC % 4 == 0) && (aC % 100 != 0) || (aC % 400 == 0)) {
				System.out.println("O ano " +aC+ " é bixessto");	
				anob++;
			}else {
				System.out.println(aC);
			}
			aC++;
		}while(aC<=aF);
		System.out.println("A quantidade de anos bixesstos é "+anob);
		in.close();
	}
}
