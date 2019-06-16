package task_01;

public class Obeb_okek {

	
	public static void main(String[] args) {
		bulOkek(3,6);
		bulObeb(3,1);
	}
	
	public static int bulOkek(int pSayi1, int pSayi2)
    {
        int say = 2;
        int sonuc;
        while(true)
        {
            if((say % pSayi1 == 0)&&(say % pSayi2 == 0))
            {
                sonuc = say;
                break;
            }
            say++;
        }
        System.out.println(sonuc);
        return sonuc;
    }
     
    public static int bulObeb(int pSayi1, int pSayi2)
    {
        int say;
        int sonuc;
        if(pSayi1>pSayi2)
            say=pSayi1;
            else
            say=pSayi2;
        while(true)
        {
            if((pSayi1 % say == 0)&&(pSayi2 % say == 0))
            {
                sonuc = say;
                break;
            }
            say--;
        }
        System.out.println(sonuc);
        return sonuc;
    }
	
}
