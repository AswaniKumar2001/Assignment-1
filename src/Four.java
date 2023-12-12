import java.util.Scanner;

public class Four {
    public static void main(String[] args){

        Scanner Four = new Scanner(System.in);

        int l=Four.nextInt();//input length
        int b=Four.nextInt();//input breadth
        int a = l*b;//area
        int p = 2*(l+b);//perimeter

        System.out.println("area of rectangle:"+a);
        System.out.println("perimeter of rectangle:"+p);

    }
}
