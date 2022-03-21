package FuatJava;

import java.util.Scanner;

public class IfStatent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("lütfen tam sayý giriniz");
        int number = sc.nextInt();
        if(number%2==0) {
        	System.out.println("sayý cifttir");
        	
        }else {
        	
        	System.out.println("sayý tektir");
        }
        	
        }

	}


