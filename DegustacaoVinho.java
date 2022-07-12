package basicoGFT_Start5;

import java.util.Scanner; 
public class DegustacaoVinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.nextLine();
	
		String R = scan.nextLine();
		String[] s = R.split(" ");
		int count =  0  ;
		for(int i =0; i < s.length;i++){
			
			if(s[i].equals(T)) {
				count++;		
	}
			
		}
		System.out.println(  count );
	}
}


//System.out.println("Campo "+i+": "+s[i].replaceFirst(" ", ""));

/* feito pelo Richard
 * import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.ObjectInputStream.GetField;
 * Scanner scan = new Scanner(System.in);
				 int T = Integer.parseInt(JOptionPane.showInputDialog(" "));
				 String R = JOptionPane.showInputDialog(" ");
				 String[] s = R.split(" ");
				 int count = 0;
				 for ( int i = 0 ; i < s.length ; i++ ) {
					
					int a = Integer.parseInt(s[i]); 
					 if (a == T ) {
						 count++;
				 }
				
				 }
				 System.out.println(count);
			}	
	}
 * 
 */

