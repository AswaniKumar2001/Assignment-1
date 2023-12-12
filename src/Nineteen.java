import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args){
        Scanner Nineteen = new Scanner(System.in);

        int a=Nineteen.nextInt(); //input

        if(a%2==0){
            System.out.println(1);//if the number is even, print 1
        }
        else{
            System.out.println(0);//if the number is odd, print 0
        }

    }
    
}
