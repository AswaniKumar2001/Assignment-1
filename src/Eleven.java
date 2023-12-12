
public class Eleven {
    public static void main(String[] args){
        String x = "Sha ruk 12 @x";
        int l=0, d=0, s=0, o=0;

        for (int i=0;i<x.length();i++){
            if(Character.isLetter(x.charAt(i))){ //counting letters
                l=l+1;
            }
            else if(Character.isDigit(x.charAt(i))){//counting digits
                d=+1;
            }
            else if(Character.isSpaceChar(x.charAt(i))){//counting spaces
                s=s+1;
            }
            else{//counting other characters
                o=o+1;
            }
        }
        System.out.println("letters: "+l);
        System.out.println("digits: "+d);
        System.out.println("spaces: "+s);
        System.out.println("others: "+o);
        
    }    
}
