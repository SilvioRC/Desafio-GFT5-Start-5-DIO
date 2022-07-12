import java.util.Scanner;
// GFT Start
public class PrimeiroDesafio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    double nota1 = input.nextDouble();

	    double nota2 = input.nextDouble();

	    double nota3 = input.nextDouble();

	    double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
	    System.out.printf(" MEDIA = %.1f " , media);
	    
	    
		/* Meu
		   Scanner input = new Scanner(System.in);
		   System.out.println(" Digite a primeiro  nota do aluno ");
		    double notaA = input.nextDouble();
		    System.out.println(" Digite a segunda  nota do aluno ");
		    double notaB = input.nextDouble();
		    System.out.println(" Digite a terceira  nota do aluno ");
		    double notaC = input.nextDouble();
		    double media = (notaA + notaB + notaC ) /  3 ;
		    media = (notaA * 0.2) + (notaB * 0.3) + (notaC * 0.5) ;
		    System.out.printf("MEDIA  = %.1f " ,  media);
		    
		    */

	}

}
