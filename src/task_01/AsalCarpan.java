package task_01;

import java.util.Scanner;

/* 
 * number kullan�cadan al�nan sayi
 * for d�ng�s�nde 2'den b�y�k say�lar s�rayla denenerek number%i==0 sorgusuysla tam b�lenleri ara�t�r�l�r.
 * 
 */


public class AsalCarpan {
   public static void main(String args[]){
      int number;
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      System.out.println("Say� Giriniz:");
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
