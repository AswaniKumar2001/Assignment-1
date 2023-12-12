import java.util.Scanner;

public class Ten {
    public static void main(String[] args){
        Scanner Ten = new Scanner(System.in);

        int a = Ten.nextInt();//input 1st num
        int b = Ten.nextInt();//input 2nd num
        
        if(a>b){
            System.out.println(a+" is largest and "+b+" is smallest");
        }
        else{
            System.out.println(a+" is smallest and "+b+" is largest");
        }
    }
}
