
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {
        int start;
        int end;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        start=Integer.parseInt(br.readLine());
        end=Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            int sum=0;
            if(i==1){
                sum=1;
               // System.out.println(i);
            }else{
            for(int j=1;j<=(i/2);j++){
                if(i%j==0){
                    sum=sum+j;
                }
                 

            }
        }
            
            if(sum==i){
                System.out.println(sum+ " is a perfecr number");
            }
            
        }
    }
}
