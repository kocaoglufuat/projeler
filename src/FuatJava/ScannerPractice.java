package FuatJava;

import java.util.Scanner;

public class ScannerPractice {

	
	  public static void main(String[] args) {
		/*
		Scanner scan= new Scanner(System.in);		
			System.out.println("bir kenar�n kenar uzunlugu giriniz");
		
		int kenar=scan.nextInt();
		System.out.println(kenar  + " "+ "G�rd�n�z");
		*/
 
		  Scanner scan= new Scanner(System.in);
		  
		  System.out.println("dikdortgen�n alan�n� hesaplay�n�z");
		  
		  System.out.println("S�md� k�sa kenar� g�r�n�z");
		  int k�saKenar = scan.nextInt();
		  
		  System.out.println("S�md� uzun kenar� g�r�n�z");
		  int uzunKenar = scan.nextInt();
		 int alan=k�saKenar*uzunKenar;
		 System.out.println("dikdortgen�n alan�n� " + alan + " olarak hesaplad�n�z." );

	}

}
