import java.util.*;

public class Micro {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        while(true){
            System.out.println("1: Veg \n2: Non - Veg \n3: Beverages 4: order end \nSelect any Number:");

            Scanner Micro = new Scanner(System.in);
            int x = Micro.nextInt();

            if (x==1){
                System.out.println("1: Panner Biryani \n2: Panner Masala \n3: Kaju biryani \nSAelect any Number:");
                String[] vegArr ={"Panner Biryani","Panner Masala","kaju Biryani"};
                while(true){
                    System.out.println("select 0 to navigate back");
                    int a=Micro.nextInt();
                    if(a==0){
                        break;
                    }
                    arr.add(vegArr[a-1]);
                }
            }
            if (x==2){
                System.out.println("1: Chicken Biryani \n2: Chicken Masala \n3: Mutton biryani \nSelect any Number:");
                String[] NonvegArr ={"Chicken Biryani","Chicken Masala","Mutton Biryani"};
                while(true){
                    System.out.println("select 0 to navigate back");
                    int a=Micro.nextInt();
                    if(a==0){
                        break;
                    }
                    arr.add(NonvegArr[a-1]);
                }
            }
            if (x==3){
                System.out.println("1: coke \n2: Butter milk \n3: Thumsup \nSelect any Number:");
                String[] BeverageArr ={"coke","Butter milk","Thumsupo"};
                while(true){
                    System.out.println("select 0 to navigate back");
                    int a=Micro.nextInt();
                    if(a==0){
                        break;
                    }
                    arr.add(BeverageArr[a-1]);
                }
            }
            if(x==4){
                System.out.println("here is your order :" +arr);
                break;
            }
        }
    }
}
        
        
        
        
        
        
        
        
        
