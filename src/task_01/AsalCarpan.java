package task_01;

import java.util.Scanner;

/* 
 * number kullanýcadan alýnan sayi
 * for döngüsünde 2'den büyük sayýlar sýrayla denenerek number%i==0 sorgusuysla tam bölenleri araþtýrýlýr.
 * 
 */


public class AsalCarpan {
   public static void main(String args[]){
      int number;
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      System.out.println("Sayý Giriniz:");
      number = sc.nextInt(); 
      
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.println(i+"  <-- carpan");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.println(number);
      
      }
   }
}
