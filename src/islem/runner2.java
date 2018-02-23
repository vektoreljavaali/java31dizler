package islem;

import java.util.Scanner;


public class runner2 {

	public static void main(String[] args) {
		
		int ogrencisayisi =2;
		
		String[] bilgiler = new String[3*5];
		Scanner sc = new Scanner(System.in);
		 
		
		for (int i = 0; i < ogrencisayisi; i++) {
			
			System.out.println("Öðrenci adýný giriniz..:");
			bilgiler[i*5] =sc.next();
			System.out.println("Öðrenci soyadýný giriniz..:");
			bilgiler[i*5+1] =sc.next();
			System.out.println("Öðrenci vize1 giriniz..:");
			bilgiler[i*5+2] =sc.next();
			System.out.println("Öðrenci vize2 giriniz..:");
			bilgiler[i*5+3] =sc.next();
			System.out.println("Öðrenci final giriniz..:");
			bilgiler[i*5+4] =sc.next();
			
		}
		
		
		for (int i = 0; i < ogrencisayisi; i++) {
		
			System.out.println(bilgiler[i*5]+" "+bilgiler[i*5+1]);
			System.out.println("Not Ortalamasý");
			int ortalama = (
					Integer.parseInt(bilgiler[i*5+2])+
					Integer.parseInt(bilgiler[i*5+3])+
					Integer.parseInt(bilgiler[i*5+4])
															
							)/3; 
			System.out.println(ortalama);
		}
		

	}

}
