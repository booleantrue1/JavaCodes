import java.util.*;
class primes2 
{   
private static Scanner streamReader = new Scanner(System.in);
public static void main(String[] args)
{
int xrange = streamReader.nextInt(); 
int zrange = streamReader.nextInt();
int counter=0;
boolean[] checkForPrime = Primes(1000000);
for (int checks = xrange; checks <= zrange; checks++)
{
if (checkForPrime[checks])
{
counter++;
}
}
System.out.println(counter);
}
public static boolean[] Primes(int n)
{
boolean[] isPrime = new boolean[n + 1];
if (n >= 2)
isPrime[2] = true;
for (int i = 3; i <= n; i += 2)
            isPrime[i] = true;
        for (int i = 3, end = sqrt(n); i <= end; i += 2)
        {
            if (isPrime[i]) 
            {
                for (int j = i * 3; j <= n; j += i << 1)
                    isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static int sqrt(int x)
    {
        int y = 0;
        for (int i = 15; i >= 0; i--) 
        {
            y |= 1 << i;
            if (y > 46340 || y * y > x)
                y ^= 1 << i;
        }
        return y;
        }
}