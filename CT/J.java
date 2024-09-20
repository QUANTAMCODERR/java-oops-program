public class J 
{
    public static void main(String args[]) 
    {
        try 
        {
            // Code that may raise exception
            int data = 100 / 0;
            System.out.println("It will not be displayed");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e);
            System.out.println("Division by zero not allowed");
        }
        // Rest code of the program
        System.out.println("Will get executed...");
    }
}
