package javapackages;
import java.util.ArrayList;

public class fibonacciGen {

	//The main class
	public static void main(String[] args) 
	{
		fibonacciGen f = new fibonacciGen();
		f.Fibonacci();
	}
		// The counter for the loop and the array index
		private int n;
	    //The variable to store the sum of the two array positions
		private int sum;
	    //Declaring the ArrayList
		private ArrayList<Integer> fib;
	    
	    /**
	     * Constructor for objects of class fibonacciGen
	     */
	    public fibonacciGen()
	    {
	        // initialise instance variables
	        n = 0;
	        fib = new ArrayList<Integer>();
	        fib.add(0);
	        fib.add(1);
	    }

	    /**
	     * An example of a method - replace this comment with your own
	     *
	     * @param  y  a sample parameter for a method
	     * @return    the sum of x and y
	     */
	    public void Fibonacci()
	    {
	        for(n=0; n<=20; n++)
	        {
	            if(n > 1)
	            {
	                sum = fib.get(n-1) + fib.get(n-2);
	                fib.add(sum);
	                System.out.println(sum);
	            }
	            else if(n == 0 || n == 1)
	            {
	                System.out.println(n);
	            }
	        }
	    }
	}