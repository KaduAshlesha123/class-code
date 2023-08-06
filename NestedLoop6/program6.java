import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args) throws Exception{
         InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int num=Integer.parseInt(br.readLine());
        int count=0;
        int temp=0, num2=0;
        while(num!=0){
            temp=num%10;
            count++;
            num=num/10;
            num2=num2*10+temp;
        }
        System.out.println("number is "+num2);
        System.out.println("count of digits in number = "+count);

    }
}
