import java.util.Scanner;

public class Six {
    public static void main(String[] args){
        Scanner Six = new Scanner(System.in);

        int a=Six.nextInt();//input a
        int b=Six.nextInt();//input b

        a=a+b;//adding to swap the numbers
        b=a-b;
        a=a-b;
            //printing values after swapping
        System.out.println(a);
        System.out.println(b);
    }
    
}
