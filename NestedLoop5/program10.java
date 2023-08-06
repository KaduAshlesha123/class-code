import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args) throws Exception{
          InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
       int start=Integer.parseInt(br.readLine());
         int end=Integer.parseInt(br.readLine());
        
         for(int i=start;i<=end;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count=count+2;
                }
                if(count>=2){
                    break;
                }
            }
            if(count==0)
            System.out.println(i);

         }
    }
}

