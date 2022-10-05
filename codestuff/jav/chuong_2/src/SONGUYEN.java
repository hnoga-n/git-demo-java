import java.util.Scanner;
import java.lang.Math;

public class SONGUYEN {
  private long n;
  public static void main(String[] args) {
    
  }
  public SONGUYEN()
  {
    this.n = 0;
  }

  public SONGUYEN(long n)
  {
    this.n = n;
  }

  public SONGUYEN(SONGUYEN sn)
  {
    this.n = sn.n;
  }
  public boolean isPrime(long n)
  {
    if(n <2) return false;
    for(int i=2; i< Math.sqrt((double)n);i++)
    {
      if(i % n ==0) return false;
    }
    return true;
  }

  public boolean isSquareNum()
  {
    return (Math.sqrt((double)n) == (int) Math.sqrt((double)n) );
  }

  public boolean isPerfectNum(int n)
  {
    int sum=0;
    for(int i=0;i<n;i++)
    {
      if(n%i==0)
      {
        sum+=i;
      }
    }
    if(sum==n) return true;
    return false;
  }

}
