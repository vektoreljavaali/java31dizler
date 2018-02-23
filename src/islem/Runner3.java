package islem;

import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
		
		String[][] bilgiler = new String[2][4];
		Scanner sc  = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 4; j++) {
				if(j==0)
					System.out.print("Ýsim giriniz...:");
				else
					System.out.println(j+". Notu giriniz...:");
			
				
				bilgiler[i][j]= sc.next();
				
			}// ikinci for
			
			
		}//ilk for
		
		
		System.out.println("-----------------------------");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if(j==0)
					System.out.print("Ýsim...:");
				else
					System.out.print(j+".Not...:");
				System.out.println(bilgiler[i][j]);
			}
		}
		
		
		
		
	}
}
