import java.util.Scanner;
public class segment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number between 1 to 100:");
        int num=sc.nextInt();
        if(num>=0 && num<=10){
            System.out.println(num+"comes in 0-10");
        }
        else if(num>10 && num<=20){
            System.out.println(num+" comes in 10-20");
        }
        else if(num>20 && num<=30){
            System.out.println(num+" comes in 20-30");}
        else if(num>30 && num<=40){
            System.out.println(num+" comes in 30-40");}
        else if(num>40 && num<=50){
            System.out.println(num+" comes in 40-50");}
        else if(num>50 && num<=60){
            System.out.println(num+" comes in 50-60");}
        else if(num>60 && num<=70){
            System.out.println(num+" comes in 60-70");}
        else if(num>70 && num<=80){
            System.out.println(num+" comes in 70-80");}
        else if(num>80 && num<=90){
            System.out.println(num+" comes in 80-90");}
        else if(num>90 && num<=100){
            System.out.println(num+" comes in 90-100");}
        else{
            System.out.println(num+ "the number is does not exist");
        }

        }
    }

