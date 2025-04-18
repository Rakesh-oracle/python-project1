

class NotEligibliExceptoin extends Exception {
    public NotEligibliExceptoin(String msg){
        super(msg);
    }
}
public class Cricket{
    public static void check(int age)throws NotEligibliExceptoin
    {
        if(age<12){
            throw new NotEligibliExceptoin("sorry you are not eligible to play cricket");
        }else{
            System.out.println("Congratulation!! you are eligible");
        }
    }
    public static void main(String[] args){
        try{

	int a1 = Integer.parseInt(args[0]);//convert the string to integer 
	System.out.print(a1);
            check(a1);
            
        }
        catch(NotEligibliExceptoin e){
            System.out.println("NotEligibliExceptoin caught:"+e);
        }
        
    }
}