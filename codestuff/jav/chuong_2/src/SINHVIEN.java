import java.util.Scanner;

public class SINHVIEN {
  private String mssv;
  private String hoten;
  private String lop;
  private double dm1;
  private double dm2;
  private double dm3;
  Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    SINHVIEN a = new SINHVIEN();
    a.nhapSv();
    a.xuatSv();
  }
  public SINHVIEN()
  {
    this.mssv = null;
    this.hoten = null;
    this.lop = null;
    this.dm1 = 0;
    this.dm2 = 0;
    this.dm3 = 0;
  }
  public SINHVIEN(String mssv, String hoten, String lop, double dm1, double dm2, double dm3)
  {
    this.mssv = mssv;
    this.hoten = hoten;
    this.lop = lop;
    this.dm1 = dm1;
    this.dm2 = dm2;
    this.dm3 = dm3;
  }

  public SINHVIEN(SINHVIEN sv)
  {
    this.mssv = sv.mssv;
    this.hoten = sv.hoten;
    this.lop = sv.lop;
    this.dm1 = sv.dm1;
    this.dm2 = sv.dm2;
    this.dm3 = sv.dm3;
  }

  public void nhapSv()
  {
    String input;
    CHECK check = new CHECK();
    System.out.println("enter mssv: ");
    this.mssv = check.checkMasv();
    System.out.println("enter hoten: ");
    this.hoten = sc.next();
    System.out.println("enter lop: ");
    this.lop = check.checkLop();
    /* System.out.println("enter dm1: ");
    input = sc.next();
    this.dm1 = Double.parseDouble(input);
    System.out.println("enter dm2: ");
    input = sc.next();
    this.dm2 = Double.parseDouble(input);
    System.out.println("enter dm3: ");
    input = sc.next();
    this.dm3 = Double.parseDouble(input); */
  }

  public void xuatSv()
  {
    System.out.printf("%-12s%-20s%-12s%-25s%-12s%-12s\n",this.mssv,this.hoten,this.lop,this.dm1,this.dm2,this.dm3);

  }

  public void setMssv()
  {
    System.out.println("enter mssv: ");
    this.mssv = sc.next();
  }

  public String getMssv()
  {
    return this.mssv;
  }
  public void setHoten()
  {
    System.out.println("enter hoten: ");
    this.hoten = sc.next();
  }

  public String getHoten()
  {
    return this.hoten;
  }
  public void setLop()
  {
    System.out.println("enter lop: ");
    this.lop = sc.next();
  }

  public String getLop()
  {
    return this.lop;
  }
  public void setDm1()
  {
    System.out.println("enter dm1: ");
    this.dm1 = sc.nextInt();
  }

  public double getDm1()
  {
    return this.dm1;
  }
  public void setDm2()
  {
    System.out.println("enter dm2: ");
    this.dm2 = sc.nextInt();
  }

  public double getDm2()
  {
    return this.dm2;
  }
  public void setDm3()
  {
    System.out.println("enter dm3: ");
    this.dm3 = sc.nextInt();
  }

  public double getDm3()
  {
    return this.dm3;
  }

  public double DTB()
  {
    return (double) ((dm1+dm2+dm3)/3);
  }

  public void rankSinhVien()
  {
    if(DTB() < 5)
    {
      System.out.println("HS YEU");
    }
    if(DTB() >= 5 && DTB() < 8)
    {
      System.out.println("HS KHA");
    }
    if(DTB() >=8 )
    {
      System.out.println("HS GIOI");
    }
  }
}
