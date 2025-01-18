import java.util.*;

class Palindrome{

    String text;

    Palindrome(String text){
        this.text = text;
    }

    public boolean isPalindrom(){
        int left=0;
        int right=0;

        while(left<right){
            if(text.charAt(left) != text.charAt(right)){
                return false;
            }
        }
        return true;
    }

    public void display(){

        System.out.println(isPalindrom());
    }


}
class Main{
    public static void main(String args[]){

        Palindrome text1 = new Palindrome("oyeyo");

        text1.display();

    }
}