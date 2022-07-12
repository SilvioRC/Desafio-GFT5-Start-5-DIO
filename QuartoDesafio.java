import java.util.*;
// GFT Start 


public class QuartoDesafio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		    List<Integer> numeros = new ArrayList<>();
		    for(int i = 0; i < 100; i++){ // Preciso entrar com 100 números 
		      int numero = scan.nextInt();
		      numeros.add(numero);
		    }

		    Integer max = Collections.max(numeros);
		    System.out.println(max); // pega o maior número
		    int position  = numeros.indexOf(max) +1;
		    System.out.println(  position);  // E aqui a posição do maior número digitado
		
		
		}

	}
	


