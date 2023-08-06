
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {
        int start;
        int end;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        start=Integer.parseInt(br.readLine());
        end=Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            int num=i*i*i;
            if(num<=end){
                System.out.println(num);
            };
        }

    }
}