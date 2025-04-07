
import java.util.Scanner;

class Age {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        System.out.print("Enetr age: ");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("Adult!");
            System.out.println("Thankyou!....");
        }
        else if(age >=13 && age<=18){
            System.out.println("Teenager !");
            System.out.println("Thankyou!......");
        }else{
            System.out.println("Child !");
            System.out.println("Thankyou!!....");
        }

    }
}