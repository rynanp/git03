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
	 System.out.println("Entre com o lado três");
	 c = in.nextInt();
	 
	 
	 if(a>b+c || b>a+c || c>a+b) {
		 System.out.println("Não e triângulo");
	 }else if (a==b && b==c) {
		 System.out.println("triângulo equilatero");
	 }else if (a !=b && a !=c) {
	      System.out.println("triângulo escaleno");
	 }else {
		 System.out.println("triângulo isoceles");

	 }
	 
	 
}
}
