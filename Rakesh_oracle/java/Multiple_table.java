import java.util.Scanner;
class Multiple_table{
    public static void main(String[] args){

       Scanner sc =new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Multiple of "+n+ " is: ");

        for(int i =1;i <= 10 ;i++){
            System.out.print(n+"*"+i+"=");
            System.out.println(n*i);
        }


    }
}