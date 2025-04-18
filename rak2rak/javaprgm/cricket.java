class NotEligibleException extends Exception
{
public NotEligibleException(String msg)
{
super(msg);
}
}
public class cricket
{
public static void check(int age)throws NotEligibleException
{
if(age<12)
{
throw new NotEligibleException("sorry you are not eligible to play cricket");
}
else 
{
System.out.println("congratulation!! you are eligible to play cricket");
}
}
public static void main(String[] args)
{
try
{
check(19);
}
catch(NotEligibleException e)
{
System.out.println("NotEligibleException caught :" +e);
}
}
}