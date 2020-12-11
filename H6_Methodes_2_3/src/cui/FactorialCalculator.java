package cui;

public class FactorialCalculator
{
    public static void main(String args[])
    {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        factorialCalculator.displayFactorials();
    } // einde main
    
    private void displayFactorials()
    {
            System.out.printf("%d! = %d%n", 5, factorial(5));
    } // einde displayFactorials

    private long factorial(long number)
    {
        if (number == 0 || number == 1) //basis cases
            return 1;
        else
            return number * factorial(number - 1);
    }  // einde factorial
}









