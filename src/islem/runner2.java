package islem;

import java.util.Scanner;


public class runner2 {

	public static void main(String[] args) {
		
		int ogrencisayisi =2;
		
		String[] bilgiler = new String[3*5];
		Scanner sc = new Scanner(System.in);
		 
		
		for (int i = 0; i < ogrencisayisi; i++) {
			
			System.out.println("��renci ad�n� giriniz..:");
			bilgiler[i*5] =sc.next();
			System.out.println("��renci soyad�n� giriniz..:");
			bilgiler[i*5+1] =sc.next();
			System.out.println("��renci vize1 giriniz..:");
			bilgiler[i*5+2] =sc.next();
			System.out.println("��renci vize2 giriniz..:");
			bilgiler[i*5+3] =sc.next();
			System.out.println("��renci final giriniz..:");
			bilgiler[i*5+4] =sc.next();
			
		}
		
		
		for (int i = 0; i < ogrencisayisi; i++) {
		
			System.out.println(bilgiler[i*5]+" "+bilgiler[i*5+1]);
			System.out.println("Not Ortalamas�");
			int ortalama = (
					Integer.parseInt(bilgiler[i*5+2])+
					Integer.parseInt(bilgiler[i*5+3])+
					Integer.parseInt(bilgiler[i*5+4])
															
							)/3; 
			System.out.println(ortalama);
		}
		

	}

}
