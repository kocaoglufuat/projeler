package FuatJava;

import java.util.Scanner;

public class ScannerPractice {

	
	  public static void main(String[] args) {
		/*
		Scanner scan= new Scanner(System.in);		
			System.out.println("bir kenarýn kenar uzunlugu giriniz");
		
		int kenar=scan.nextInt();
		System.out.println(kenar  + " "+ "Gýrdýnýz");
		*/
 
		  Scanner scan= new Scanner(System.in);
		  
		  System.out.println("dikdortgenýn alanýný hesaplayýnýz");
		  
		  System.out.println("Sýmdý kýsa kenarý gýrýnýz");
		  int kýsaKenar = scan.nextInt();
		  
		  System.out.println("Sýmdý uzun kenarý gýrýnýz");
		  int uzunKenar = scan.nextInt();
		 int alan=kýsaKenar*uzunKenar;
		 System.out.println("dikdortgenýn alanýný " + alan + " olarak hesapladýnýz." );

	}

}
