package licoes;
import java.util.Scanner;
public class imc {


	public static void main (String args[]) {
	    Scanner in = new Scanner (System.in);
	     double peso, altura, imc;
	     System.out.println("entre com o seu peso");
	     peso = in.nextDouble();
	     System.out.println("Entre com a altura");
	     altura = in.nextDouble();
	     imc = peso/(altura*altura);
	     System.out.println("Seu IMC é:"+imc);	 
	     if (imc<18.5){
	    	 System.out.println("excesso de magreza");
	     }else if  (imc<25){
	    	 System.out.println("peso normal");
	     }else if (imc<30) {
	    	 System.out.println("Excesso de peso");
	     }else if (imc<35) {
	    	 System.out.println("obesidade I");
	     }else if (imc<40) {
	    	 System.out.println("Obesidade II");
	     }else if (imc>=40) {
	    	 System.out.println("obesidade III");
	    	 
	     
	     }
	}

}
