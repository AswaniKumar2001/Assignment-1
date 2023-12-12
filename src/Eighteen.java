import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args){
        Scanner Eighteen = new Scanner(System.in);

        int a=Eighteen.nextInt();//input a
        int b=Eighteen.nextInt();//input b
        if(a>b){// if a & b are different print largest
            System.out.println(a);
        }
        else if(b>a){
            System.out.println(b);
        }
        if(a==b){//if a and b are equal print zero
            System.out.println(0);
        }
        else if(a%6==b%6){//if a and b divided by 6, having same remainder, print lowest
            System.out.println((a>b)?b:a);
        }
    }
}
