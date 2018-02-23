package islem;

import java.util.Date;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		
		int ogrencisayisi=3;
		
		
		String[] ogrenci = new String[ogrencisayisi];
		int[] not = new int[ogrencisayisi*2];
		
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ogrencisayisi; i++) {
		
		System.out.print("Öðrenci Adýný giriniz...: ");
		ogrenci[i]= sc.next();
		System.out.print("Öðrenci Vize notunu giriniz...: ");
		not[i*2]= sc.nextInt();
		System.out.print("Öðrenci final notunu giriniz...: ");
		not[i*2+1]= sc.nextInt();			
		
		}
		
		
		for (int i = 0; i < ogrencisayisi; i++) {
			System.out.println("-----------------------------------");
			System.out.print("Öðrencinin Adý..:");
			System.out.print(ogrenci[i]);
			System.out.print(" Not ortalamasý...:");
			System.out.println((not[i*2]+not[i*2+1])/2);
			System.out.println("-----------------------------------");
			
		}
		
	
	}

}
