package licoes;
import java.util.Scanner;
public class Cacularmaioridade {
	 static Scanner in = new Scanner (System.in);
	public static void main (String args[]) {
		int i=1;
		double idade;
		
		while (i<=10) {
		System.out.println("Entre com a idade do "+i+" aluno");
		idade =in.nextDouble();
		if (idade<18) {
			System.out.println("O aluno é menor de idade");
		}else {
			System.out.println("O aluno é maior de idade");
			
		}
		i++;
	}

}
}
