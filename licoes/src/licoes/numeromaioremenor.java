package licoes;
import java.util.Scanner;
public class numeromaioremenor {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		  
		 int  a, b, c;
		 
		 
		 System.out.println("Entre com o numero um");
		 a = in.nextInt();
		 System.out.println("Entre com o numero dois");
		 b = in.nextInt();
		 System.out.println("Entre com o numero três");
		 c = in.nextInt();
		  
		 
		 if(a<b && b<c) {
			 System.out.println("a ordem é : "+a+","+b+","+c);
		 }else if(a<c && c<b) {
				 System.out.println("a ordem é : "+a+","+c+","+b);
		 }else if(b<a && a<c) {
			 System.out.println("a ordem é : "+b+","+a+","+c);
		 }else if(c<a && a<b) {
			 System.out.println("a ordem é : "+c+","+a+","+b);
		 }else if(b<c && c<a) {
			 System.out.println("a ordem é : "+b+","+c+","+a);
		 }else {
			 System.out.println("a ordem é : "+c+","+b+","+a);
		 }
		 
	
		 }
}
