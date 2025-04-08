import java.util.Scanner;

class Calculator {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 'a': ");
       double a=sc.nextDouble();
        System.out.print("Enter number 'b':");
       double b=sc.nextDouble();
        System.out.print("Select a operator(+,-,*,%,/): ");
        char operator =sc.next().charAt(0);

        switch(operator){
            case '+'-> System.out.print("addition: "+(a+b));
            case '-'-> System.out.print("Subtraction:"+(a - b));
            case '*'-> System.out.print("Multiplication: "+ (a*b));
            case '%'-> System.out.print("Modulo : "+ (a%b));
            case '/'-> System.out.print("Division: " +(a/b));
            default -> System.out.print("not a operator!

}
}
}