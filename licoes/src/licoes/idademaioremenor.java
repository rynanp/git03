package licoes;
import java.util.Scanner;
public class idademaioremenor {
	public static void main (String args[]) {
		Scanner in=new Scanner (System.in);
		String nomeMaior, nomeMenor, nome;
		int idadeMaior, idadeMenor, idade;
		System.out.println("Entre com o primeiro nome");
		nome = in.next();
		System.out.println("Entre com a primeira idade");
		idade = in.nextInt();
		
		nomeMaior = nome;
		idadeMaior = idade;
		nomeMenor = nome;
		idadeMenor = idade;
		
		
		System.out.println("Entre com o segundo nome");
		nome = in.next();
		System.out.println("Entre com a segunda idade");
		idade = in.nextInt();
		
		if (idade>idadeMaior) {
			nomeMaior=nome;
			idadeMaior = idade;
		}else if (idade<idadeMaior) {
			nomeMaior = nome;
			idadeMaior = idade;
			
		}
			System.out.println("Entre com o terceiro nome");
			nome = in.next();
			System.out.println("Entre com a terceira idade");
			idade = in.nextInt();
			
			
			if (idade>idadeMenor) {
				nomeMenor = nome;
				idadeMenor = idade;
			}else if (idade<idadeMaior) {
				nomeMaior = nome;
				idadeMenor = idade;
				
			}
				System.out.println("Entre com o quarto nome");
				nome = in.next();
				System.out.println("Entre com a quarta idade");
				idade = in.nextInt();
				
				if (idade>idadeMaior) {
					nomeMaior=nome;
					idadeMaior = idade;
				}else if (idade<idadeMaior) {
					nomeMaior = nome;
					idadeMaior = idade;
					
				}
					System.out.println("Entre com o quinto nome");
					nome = in.next();
					System.out.println("Entre com a quinta idade");
					idade = in.nextInt();
					
					
					if (idade<idadeMaior) {
						nomeMenor=nome;
						idadeMenor = idade;
					}else if (idade>idadeMaior) {
						nomeMaior = nome;
						idadeMaior = idade;
						
						
	
			}
					
					
					System.out.println("o usuario mais velho possui"+idadeMaior);
					System.out.println("o nome do(a) usuario(a) mais velho(a) é:"+nomeMaior);
					System.out.println("o usuario mais novo possui"+idadeMenor);
					System.out.println("o nome do(a) usuario(a) mais novo(a) é:"+nomeMenor);
			
           
		
      
	}
	}
  
  
 

