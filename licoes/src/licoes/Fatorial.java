package licoes;
import java.util.Scanner;
public class Fatorial {
	 static Scanner in = new Scanner (System.in);
	public static void main (String args[]) {
	int n, f = 1, i = 0;
	System.out.println("digite um numero");
	n = in.nextInt();
	
	while 	(i<=n) {
		f = f*i;
		i++;
		
	     }
	System.out.println(f);
	in.close();
	}

	}