
import java.util.Scanner;

class Check_U&L_case{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch =sc.next().charAt(0);
        if(ch >= 'A' && ch<='Z'){
            System.out.println("Upper case latter!");
            System.out.println("Thankyou for use my program");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case latter!");
            System.out.println("Thankyou for use my program");
        }else{
            System.out.println("invalid Enter:........");
            System.out.println("please enter correct character......Thankyou!!");
        }

    }
}