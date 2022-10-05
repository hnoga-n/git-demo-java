import java.util.Scanner;

public class CHECK {
  Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
  }
  public String checkMasv()
  {
    String maSv;
    System.out.println("moi nhap ma sinh vien: ");
    while(true)
    {
      
      maSv = sc.nextLine();
      if(maSv.matches("sv"+"[0-9]{1,2}"))
      {
        return maSv;
      }
      else 
      {
        System.out.println("Sai cu phap, VD: sv01");
      }
      System.out.println("Moi nhap lai: ");
    }
  }

  public String checkLop()
  {
    String lop;
    System.out.println("moi nhap lop: ");
    while(true)
    {
      
      lop = sc.nextLine();
      if(lop.matches("[a-z]{3}"+"[0-9]{4}"))
      {
        return lop;
      }
      else 
      {
        System.out.println("Sai cu phap, VD: dct1213");
      }
      System.out.println("Moi nhap lai: ");
    }
  }
  
}
