

import java.io.*;
import java.io.InputStreamReader;
public class program2 {
    public static void main(String[] args)throws Exception {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int row=Integer.parseInt(br.readLine());
        for(int i=0;i<row;i++){
             for(int j=0;j<row;j++){
                if(i==j){
                    System.out.print("#"+" ");
                }
                else{
                    System.out.print("=" + " ");
                }
             }
             System.out.println();    
        }
    }    
}
