import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args) throws Exception{
       
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
       int num=Integer.parseInt(br.readLine());
        
       int temp,sum=0;
       while(num!=0){
        temp=num%10;
        //System.out.println(temp);
        int fact=1;
      for(int i=1;i<=temp;i++){
        fact=fact*i;
      }
      //System.out.println(fact);
       sum=sum+fact;
        num=num/10;
       }
      System.out.println("addition of factorials  of each digit of 1234 = " +sum);  
    }
}
