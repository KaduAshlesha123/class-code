import java.io.*;
public class program7 {
    public static void main(String[] args)throws Exception {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter rows:");
        int num=0,ch;
        ;
        int x=Integer.parseInt(br.readLine());
     
         for(int f=0;f<=x;f++){
           num=num+(x-f);
           
        }
       // System.out.println(num);
        ch=64+num;
        char Alpha=(char)ch;
        //System.out.println(Alpha);
        
       for(int i=x;i>=1;i--){
        for(int j=i;j<=x;j++){
            if(i%2==0){
                System.out.print(num+" ");
            }else{
                System.out.print(Alpha+" ");
            }
            num=--num;
            Alpha=--Alpha;
        }
        System.out.println();
       }
   

}
    }
