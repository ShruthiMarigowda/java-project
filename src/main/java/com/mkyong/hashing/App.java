package com.mkyong.hashing;

/**
 * Hello Jenkins...!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EvenOdd ob = new EvenOdd();
	System.out.println(ob.checkEvenOdd(Integer.parseInt(args[0])));
    }
}
