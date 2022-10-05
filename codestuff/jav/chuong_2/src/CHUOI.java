import java.util.Scanner;

public class CHUOI {
  private String str;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    CHUOI str = new CHUOI("dit cu may!");
    str.deleteCharAtK(2);
  }
  public CHUOI()
  {
    this.str = null;
  }

  public CHUOI(String str)
  {
    this.str  = str;
  }

  public CHUOI(CHUOI str)
  {
    this.str = str.str;
  }

  public void input()
  {
    System.out.println("Enter string: ");
    str = sc.nextLine();
  }
  public void output()
  {
    System.out.println(this.str);
  }

  public void lengthOfS()
  {
    System.out.println("Length of string is: " + str.length());
  }

  public void delRedundantSpace()
  {
    this.str = this.str.replaceAll("\\s+", " ").trim();
    output();
  }
  public void countWord()
  {
    int word=0;
    /* System.out.println(this.str.split("\\w+").length); */
    for(int i=0;i<str.length();i++)
    {
      System.out.print(str.charAt(i));
      if(str.charAt(i)==' ')
      {
        System.out.println(" ");
        word++;
      }
    }
    System.out.println("\nWord(s): " + ++word);
  }
  
  public void printCharFromK()
  {
    int k;
    System.out.println("Enter k: ");
    k = sc.nextInt();
    for(int i=0;i<k;i++)
    {
      System.out.print(str.charAt(i));
    }
    for(int i=str.length()-1;i>k;i--)
    {
      System.out.print(str.charAt(i));
    }
    System.out.println("\n");
  }

  public void printCharFromK(int k)
  {
    for(int i=0;i<k;i++)
    {
      System.out.print(str.charAt(i));
    }
    System.out.print("\n");
    for(int i=str.length()-1;i>k;i--)
    {
      System.out.print(str.charAt(i));
    }
  }

  public void deleteCharAtK(int k)
  {
    StringBuilder sb = new StringBuilder(str);
    sb.deleteCharAt(k);
    this.str = sb.toString();
    System.out.println(str);
  }
}
