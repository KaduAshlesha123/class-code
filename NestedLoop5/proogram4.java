import java.io.*;
public class proogram4 {
        public static void main(String[] args)throws Exception {
            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);

            System.out.println("Enter start");
            int start=Integer.parseInt(br.readLine());

            System.out.println("Enter end");
            int end=Integer.parseInt(br.readLine());
            
            System.out.println("odd no. :");
            for(int i=start;i<=end;i++){
                if((i%2)!=0){
                    System.out.print(i+" ");
                }
            }

             System.out.println("\n even no. :");
             for(int i=end;i>=start;i--){
                if((i%2)==0){
                    System.out.print(i+" ");
                }
            }
            
        }   
}
