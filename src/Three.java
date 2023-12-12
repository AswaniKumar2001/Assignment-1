import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner Three=new Scanner(System.in);

        int a=Three.nextInt(); //input

        for (int i=1;i<11;i++){//for loop to use till 10
            int j=a*i;
            System.out.println(a+"*"+i+"="+j);//table
        }
    }
}
