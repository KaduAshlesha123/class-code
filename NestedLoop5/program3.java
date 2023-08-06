import java.io.BufferedReader;
import java.io.InputStreamReader;
public class program3 {
    public static void main(String[] args)throws Exception {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int row=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=row;i++){     
            int x=row-i+1;    
            for(int j=row; j>=i;j--){
            
                System.out.print((i*x)+ " ");
                x--;
            }
            
            System.out.println();
        }
    }
}
