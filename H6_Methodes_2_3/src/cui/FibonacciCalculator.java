package cui;

public class FibonacciCalculator
{
	public static void main( String args[] )
    {
		FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
		fibonacciCalculator.displayFibonacci();
    } // end main
    
	
	// recursive declaration of method fibonacci
    private long fibonacci( long number )
    {
    	// base cases
    	if ( number == 0  ||  number == 1 ) 
    		return number;
    	// recursion step
    	else 
    		return fibonacci( number - 1 ) + fibonacci( number - 2 );
    } // end method fibonacci
    
    
    
    
    private void displayFibonacci()
    {
    	for ( int counter = 0; counter <= 10; counter++ )
    		System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci( counter ));
    } // end method displayFibonacci  
}
