import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args){
        Scanner Fifteen = new Scanner(System.in);
        
        System.out.println("Enter P1_Age:");//1st person age
        int P1=Fifteen.nextInt();
        System.out.println("Enter P2_Age:");//2nd person age
        int P2=Fifteen.nextInt();
        System.out.println("Enter P3_Age:");//3rd person age
        int P3=Fifteen.nextInt();

        if (P1>P2) 
        {
           if(P2>P3){
            System.out.println("P1 is oldest and P3 is youngest");
           } 
           else if (P2<P3) {
            if (P1<P3){
                System.out.println("P3 is oldest and P2 is youngest");
            }
            else{
                System.out.println("P1 is oldest and P2 is youngest");
            }
           }
        }
        if (P1<P2) 
        {
           if(P2<P3){
            System.out.println("P3 is oldest and P1 is youngest");
           } 
           else if (P2>P3) {
            if (P1>P3){
                System.out.println("P2 is oldest and P3 is youngest");
            }
            else{
                System.out.println("P2 is oldest and P1 is youngest");
            }
           }
        }
    }
}