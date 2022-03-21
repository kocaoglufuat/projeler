package FuatJava;

public class Variables {

	public static void main(String[] args) {
		int sayı;
		sayı=27;
		
       System.out.print(sayı); //=>eger println degılde prınt yazarsak yazdırma ıslemınden sonra alt satıra gecmez
       
       char ilkHarf='C';
       System.out.println(ilkHarf);
       
       double sayıDouble=2.546;
       System.out.println(sayıDouble);
       
       System.out.println(sayıDouble + sayı);// 29.546
       
       System.out.println(sayıDouble + ilkHarf); //bir toplama ıslemınde char karakteri kullanılarsa onun ASCİİ degerını alır
       
	}

}
