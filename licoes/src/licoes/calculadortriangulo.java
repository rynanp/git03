package licoes;
import java.util.Scanner;
public class calculadortriangulo {
public static void main (String args[]) {
	Scanner in=new Scanner (System.in);
	  
	 int  a, b, c;
	 
	 System.out.println("Entre com o lado um");
	 a = in.nextInt();
	 System.out.println("Entre com o lado dois");
	 b = in.nextInt();
	 System.out.println("Entre com o lado tr�s");
	 c = in.nextInt();
	 
	 
	 if(a>b+c || b>a+c || c>a+b) {
		 System.out.println("N�o e tri�ngulo");
	 }else if (a==b && b==c) {
		 System.out.println("tri�ngulo equilatero");
	 }else if (a !=b && a !=c) {
	      System.out.println("tri�ngulo escaleno");
	 }else {
		 System.out.println("tri�ngulo isoceles");

	 }
	 
	 
}
}
