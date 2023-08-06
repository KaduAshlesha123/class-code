import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {
        int start;
        int end;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        start=Integer.parseInt(br.readLine());
        end=Integer.parseInt(br.readLine());
        System.out.println("composite numbers betweeen "+start+"to "+end);
        for(int i=start;i<=end;i++){
            int count=0;
            for(int j=1;j<end;j++){
                if(i%j==0){
                count++;
                }
                
            }
            if(count>=3){
                System.out.println(i);
            }
            }
            
        

    }
}
