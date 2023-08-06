import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class nestedLoop5{
    public static void main(String[] args)throws IOException {
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        int row=Integer.parseInt(br.readLine());
       

        for(int i=0;i<row;i++){
             char ch1='A',ch2='D';
             int num1=1,num2=4;
              for(int j=0;j<row;j++){   
                if(i%2!=0){
                System.out.print(ch1+""+num1+" " );
                ch1++;
                num1++;
                }
                else{
                    System.out.print(ch2+""+num2+ " " );
                    ch2--;
                    num2--;
                }
            }
            System.out.println();
    }
    }
}
