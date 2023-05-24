import java.util.Scanner;

public class JavaPatikaE {
	
 public static void main (String[]arg) {
	 
	 Scanner input = new Scanner(System.in);
	 
	 int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
	 
	 System.out.print("Matematik:");
	 Matematik=input.nextInt();
	 
	 
	 
	 System.out.print("Fizik:");
	 Fizik=input.nextInt();
	 
	
	 
	 System.out.print("Kimya:");
	 Kimya=input.nextInt();
	 
	 
	 
	 System.out.print("Türkçe:");
	 Turkce=input.nextInt();
	 
	 
	 
	 System.out.print("Tarih:");
	 Tarih=input.nextInt();
	 
	 
	 
	 System.out.print("Muzik:");
	 Muzik=input.nextInt();
	 
	 int toplam=(Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);
	 
	 double sonuc =toplam /6.0 ;
	
	 	 
	 System.out.println(sonuc); 
	 
	 boolean sinifiGecti = sonuc >= 60;
     boolean siniftaKaldi = sonuc < 60;

     String durum = (sinifiGecti && siniftaKaldi) ? "Geçti" : "Kaldı";
     
     
     System.out.println("Sınıfı " + durum);
	 
	 
 }
}
