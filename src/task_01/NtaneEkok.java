package task_01;

public class NtaneEkok {

    public static void main(String[] args) {
        
        
    	int arr[]={8,16,80,22,1,2,4,2};
        int temp=0;
        for(int i =0;i<arr.length;i++)
        {
            if(i==0)
            {
                temp=ekokBul(arr[i+1], arr[i]);
                i++;
            }
            else
            {
                temp=ekokBul(temp, arr[i]);
            }
        }
        System.out.println("ekok = " + temp);
        
        
   ////////////////////////////////////////////////////////////
        
        for(int i =0;i<arr.length;i++)
        {
            if(i==0)
            {
                temp=ebobBul(arr[i+1], arr[i]);
                i++;
            }
            else
            {
                temp=ebobBul(temp, arr[i]);
            }
        }
        System.out.println("ebob = " + temp);


    }

    public static int ekokBul(int a,int b)
    {
        int ekok=0;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                ekok=i;
            }

        }

        return ekok;

    }
    
    public static int ebobBul(int a,int b) {
    	
    	int ebob=0;
    	for(int i=1;i<=a && i <=b;i++) {
    		
    		if(i%a == 0 && i%b==0 ) {
    			
    			ebob=i;
    		}
    	}
    	
    	
    	return ebob;
    	
    }

}