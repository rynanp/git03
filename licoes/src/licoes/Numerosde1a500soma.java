package licoes;
import java.util.Scanner;
public class Numerosde1a500soma {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int soma=1, i;
		
		for(i=1; i<501; i++) {
			
		if ((i % 2 !=0) && (i % 3 == 0)){
			soma = soma + i;
					   
		    }
		System.out.println(soma);
}
}
}