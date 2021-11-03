package licoes;
import java.util.Scanner;
public class Mediaaluno {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		double n1, n2, media, notaexame, notaexame2, mediaexame;
		System.out.println("Entre com a primeira nota");
		n1 = in.nextDouble();
		System.out.println("Entre com a segunda nota");
		n2 = in.nextDouble();
		media = (n1+n2)/2;	
		System.out.println("A media do aluno é:" +media);
		
		if (media<3) {
			System.out.println("Reprovado");
		}else if (media>=6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Exame");
			System.out.println("Entre com a nova primeira pontuação");
			notaexame = in.nextDouble();
			System.out.println("Entre com a nova segunda pontuação");
			notaexame2 = in.nextDouble();
			mediaexame = (notaexame+notaexame2)/2;
			System.out.println("A nova media do aluno é:" +mediaexame);
            if (mediaexame<3) {
            	System.out.println("Reprovado");
    		}else if (mediaexame>=6) {
    			System.out.println("Aprovado");
            }
		}
		}
}
