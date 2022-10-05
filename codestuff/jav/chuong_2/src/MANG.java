import java.util.Scanner;

public class MANG {
  private int n;
  private int[] a = new int[100];
  Scanner sc=  new Scanner(System.in);
  public static void main(String[] args) {
    
  }
  public void input()
  {
    System.out.println("Please enter length of array: ");
    this.n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
  }
  public void printArrayAndSum()
  {
    int sum =0;
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(a[i]);
      sum += a[i];
    }
    System.out.println("Sum: "+sum);
  }
  public void evenNumberAndSum()
  {
    int sum =0;
    for(int i = 0; i<this.n;i++)
    {
      if(a[i] % 2== 0)
      {
        System.out.print(a[i]);
        sum += a[i];
      }
    }
    System.out.println("Sum: "+sum);
  }
  public void oddNumberAndSum()
  {
    int sum =0;
    for(int i = 0; i<this.n;i++)
    {
      if(a[i] % 2 != 0)
      {
        System.out.print(a[i]);
        sum += a[i];
      }
    }
    System.out.println("Sum: "+sum);
  }


  public void addArray()
  {
    System.out.println("Enter number want to add into array: ");;
    int a = sc.nextInt();
    this.a[n++] = a;
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(this.a[i]+ " ");
    }
  }
  public void addArray(int a)
  {
    this.a[n++] = a;
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(this.a[i]+ " ");
    }
  }

  public void deleteArrayAtK()
  {
    System.out.println("Enter k: ");
    int k = sc.nextInt();
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(this.a[i]+ " ");
    }
    for(int i = k; i<this.n;i++)
    {
      a[i] =  a[i+1];
    }
    n=n-1;
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(this.a[i]+ " ");
    }
  }
  public void deleteArrayAtK(int k)
  {
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(this.a[i]+ " ");
    }
    for(int i = k; i<this.n;i++)
    {
      a[i] =  a[i+1];
    }
    n=n-1;
    for(int i = 0; i<this.n;i++)
    {
      System.out.print(this.a[i]+ " ");
    }
  }

  public void findAndReturnPosOfX()
  {
    System.out.println("Enter x: ");
    int x = sc.nextInt();
    for(int i =0;i<this.n;i++)
    {
      if(a[i] == x)
      {
        System.out.println("Found X at: " + i);
        break;
      }
    }
  }

  public void findAndReturnPosOfX(int x)
  {
    for(int i =0;i<this.n;i++)
    {
      if(a[i] == x)
      {
        System.out.println("Found X at: " + i);
        break;
      }
    }
  }
}
