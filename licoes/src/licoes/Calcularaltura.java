package licoes;
import java.util.Scanner;
public class Calcularaltura {
	public static void main (String args[]) {
	Scanner in = new Scanner (System.in);
    double i=0, alturaj, alturap;
    alturaj = 134;
    alturap = 145;
    while (alturaj<=alturap) {
   	 alturaj =  alturaj+2.5;
   	 alturap = alturap+2;
   	 
   	 
   	 i++;
    }
    System.out.println("Demoram "+i+" ate João ficar mais alto que Pedro");
	
	

	
   }
}
