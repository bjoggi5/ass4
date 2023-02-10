package is.hi.baj24.hbv202g;

import org.apache.commons.numbers.primes.Primes;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(Primes.isPrime(3));
        System.out.println(Primes.nextPrime(123456789));
    }
}
