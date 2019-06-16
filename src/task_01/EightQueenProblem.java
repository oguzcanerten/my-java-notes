package task_01; 

public class EightQueenProblem {
	/** Main method */
	public static void main(String[] args) {
        int[] vezir = new int[64]; // satranc tahtamýz 8x8=64 olduðu için
        int i=0,x; // i yerleþen vezir sasyýsý, x yerleþtirilen index
        
        while(i!=8 ){ // içerdeki while döngüsü dizi tamamen dolduðunda kýrýldýðýnda yerleþen vezir deðerini kontrol eder
            i=0;
            for(int j=0;j<64;j++)//dizinin bütün elemanlarýný 0'a eþitliyoruz.
                vezir[j]=0;     // 0 dizinin boþ olduðu anlamýna geliyor.
           
        while(i!=8){// toplam 8 tane vezir yerleþene kadar devam edecek
            x = getRandom(); // yerleþtirmye rastgele bir sýradan baþlýyoruz
            if(vezir[x]==0){//dizinin x. indexi boþ ise buraya vezir yerleþtirebiliriz
            yerlestirme(vezir, x); // yerleþtirme iþlemiyle beraber dizinin satýrýný sütununu ve çaprazýný 1 e eþitliyoruz.
            i++; // yerleþtirilen vezir sayýsý
            }
            if(diziFullDolu(vezir)) // eðer dizi tamamen dolu ise sonzuz dögüyü engellemek için döngüyü kýrýyoruz
                break;
        }   
        }
        for(int j=7;j>=0;j--){ 
            for(i=j;i<64;i+=8){
            if(vezir[i]==-1)
                System.out.print("|Q");
            else
                    System.out.print("| ");
        }
            System.out.print("|\n");
        }
        }
        // 0<=x<64 arasý bir integer üretiyoruz
        public static int getRandom(){
            return (int) (Math.random()*64);
        }
        // vezir yerleþtirme iþlemi burada gerçekleþiyor.
        public static void yerlestirme(int[] vezir,int x){ //diziyi ve index i alýyoruz
            int sutun = x/8;
            sutun = sutun*8;
            int satir = x%8;
            int capraz_1 = x;
            int capraz_2 = x;
            while(capraz_1%8!=0 && capraz_1>=9){
            
            capraz_1-=9;
         }
           
            while(capraz_2%8!=0 && capraz_2<57){
                
                capraz_2+=7;
            }
            
            for(int i=sutun;i<sutun+8;i++)
                vezir[i]=1;
            for(int i=satir;i<64;i+=8)
                vezir[i]=1;
            for(int i=capraz_1;i%8!=7 && i<64;i+=9)
                vezir[i]=1;
            for(int i=capraz_2;i>=0 && i%8!=7;i-=7)
                vezir[i]=1;
           vezir[x]=-1;
        }
        // dizinin tamamen dolu olup olmadýðýný kontrol eder.
        public static boolean diziFullDolu(int[] vezir){
            for(int i=0;i<64;i++)
                if(vezir[i]==0)
                    return false;
            return true;
        }
}