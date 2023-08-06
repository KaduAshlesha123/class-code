import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args) throws Exception{
         InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
      int count=0;
        for(int i=1;i<=50;i++){
            if(i%5==0 && i%2==0){  
                count++;
                 System.out.println(i);
            }
             
        }
         System.out.println("total count fo numbers = "+count);
        }    
}
