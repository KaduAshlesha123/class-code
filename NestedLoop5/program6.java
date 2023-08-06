import java.io.*;
public class program6 {
    public static void main(String[] args)throws Exception {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        char one,two;
        System.out.println("Enter a char");
        one=(char)isr.read();
        br.readLine();
        System.out.println("Enter a char");
        two=(char)isr.read();
         
        if(one==two){
            System.out.println("both char are same");
        }else{
            int ch1,ch2;
            ch1=(int)one;
             ch2=(int)two;
             
            System.out.println("difference between two char : " + (ch2-ch1));
        }
    }
}
