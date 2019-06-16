package task_01; 

public class EightQueenProblem {
	/** Main method */
	public static void main(String[] args) {
        int[] vezir = new int[64]; // satranc tahtam�z 8x8=64 oldu�u i�in
        int i=0,x; // i yerle�en vezir sasy�s�, x yerle�tirilen index
        
        while(i!=8 ){ // i�erdeki while d�ng�s� dizi tamamen doldu�unda k�r�ld���nda yerle�en vezir de�erini kontrol eder
            i=0;
            for(int j=0;j<64;j++)//dizinin b�t�n elemanlar�n� 0'a e�itliyoruz.
                vezir[j]=0;     // 0 dizinin bo� oldu�u anlam�na geliyor.
           
        while(i!=8){// toplam 8 tane vezir yerle�ene kadar devam edecek
            x = getRandom(); // yerle�tirmye rastgele bir s�radan ba�l�yoruz
            if(vezir[x]==0){//dizinin x. indexi bo� ise buraya vezir yerle�tirebiliriz
            yerlestirme(vezir, x); // yerle�tirme i�lemiyle beraber dizinin sat�r�n� s�tununu ve �apraz�n� 1 e e�itliyoruz.
            i++; // yerle�tirilen vezir say�s�
            }
            if(diziFullDolu(vezir)) // e�er dizi tamamen dolu ise sonzuz d�g�y� engellemek i�in d�ng�y� k�r�yoruz
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
        // 0<=x<64 aras� bir integer �retiyoruz
        public static int getRandom(){
            return (int) (Math.random()*64);
        }
        // vezir yerle�tirme i�lemi burada ger�ekle�iyor.
        public static void yerlestirme(int[] vezir,int x){ //diziyi ve index i al�yoruz
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
        // dizinin tamamen dolu olup olmad���n� kontrol eder.
        public static boolean diziFullDolu(int[] vezir){
            for(int i=0;i<64;i++)
                if(vezir[i]==0)
                    return false;
            return true;
        }
}