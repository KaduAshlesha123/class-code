import java.io.*;
public class program5 {
    public static void main(String[] args)throws Exception {
        int row,num1,num2;
        num1=0;
        num2=1;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        row=Integer.parseInt(br.readLine());
        int sum=1;
       
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
            if(i==1){
                  System.out.print(num1);
                  num1++;
            }
            else if(i==2){
                System.out.print(num2+" ");
            }else{
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.print(sum + " ");
            }
        }
        System.out.println();
        }
       }   
}
