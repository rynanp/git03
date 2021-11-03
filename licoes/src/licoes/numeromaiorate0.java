package licoes;
import java.util.Scanner;
public class numeromaiorate0 {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int i=0, qt, n, o=0;
		
	do {
		
		
		System.out.println("Digite a quantidade de numeros");
		qt = in.nextInt();
		if (qt == 0) {
		  System.out.println("fim do programa");
	   }else {
		 
		do {
			System.out.println("Digite o numero");
			n = in.nextInt();
			i = 0;
			if (n>o) {
				o = n;
			}else {
				o = o;
			}
			i++;
			}while (i < qt);
		 System.out.println("O numero maior é "+o);
		}
		in.close();
	    
	}while (qt != 0);
	in.close();
}
}
	