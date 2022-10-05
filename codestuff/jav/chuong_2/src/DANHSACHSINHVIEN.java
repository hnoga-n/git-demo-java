import java.util.Arrays;
import java.util.Scanner;

public class DANHSACHSINHVIEN{
  private SINHVIEN[] arrsv;
  private int siso;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {  
    DANHSACHSINHVIEN a = new DANHSACHSINHVIEN();
    a.nhapArraySv();
    a.printArraySv();
    a.deleteSv();
    a.printArraySv();
  }

  public DANHSACHSINHVIEN()
  {
    this.siso = 0;
    this.arrsv = null;
  }

  public void nhapArraySv()
  {
    System.out.print("Nhap si so sinh vien: ");
    this.siso = sc.nextInt();
    arrsv = new SINHVIEN[siso];
    for(int i=0;i<arrsv.length;i++)
    {
      arrsv[i]= new SINHVIEN();
      arrsv[i].nhapSv();
    }
  }
  public void printArraySv()
  {
    System.out.printf("%-12s%-20s%-12s%-25s%-12s%-12s\n\n","ma sv","ho ten","lop","dm1","dm2","dm3");
    for(int i=0;i<arrsv.length;i++)
    {
      arrsv[i].xuatSv();
    }
  }

  public void add1Sinhvien()
  {
    this.arrsv = Arrays.copyOf(arrsv, arrsv.length + 1);
    arrsv[siso] = new SINHVIEN();
    arrsv[siso].nhapSv();
    this.siso++;
  }

  public void deleteSv()
  {
    CHECK check = new CHECK();
    String masv;
    int l=0;
    System.out.println("Nhap ma sinh vien muon XOA: ");
    masv = check.checkMasv();
    for(int i=0;i<arrsv.length;i++)
    {
      if(arrsv[i].getMssv().equalsIgnoreCase(masv))
      {
        for(int k=i;k<arrsv.length;k++)
        {
          l=k;
          while(l<arrsv.length)
          {
            arrsv[l] = arrsv[l++];
            l++;
          }
        }
        break;
      }
    }
    this.arrsv = Arrays.copyOf(arrsv, arrsv.length - 1);
    this.siso--;

  }

  public SINHVIEN searchSvTheoMaSv()
  {
    CHECK check= new CHECK();
    String masv;
    SINHVIEN sv;
    System.out.println("nhap MSSV muon tim kiem: ");
    masv = check.checkMasv();
    for(int i=0; i<arrsv.length;i++)
    {
      if(arrsv[i].getMssv().equals(masv))
      {
        sv = arrsv[i];
        return sv;
      }
    }
    System.out.println("Khong tim thay sinh vien!");
    return null;

  }

  public void searchSvTheoTen()
  {
    boolean isExist=false;
    String name;
    SINHVIEN sv;
    System.out.println("Nhap ten muon tim kiem: ");
    name = sc.next();
    for(int i=0;i<arrsv.length;i++)
    {
      if(arrsv[i].getHoten().equalsIgnoreCase(name))
      {
        arrsv[i].xuatSv();
        isExist = true;
      }
    }
    if(!isExist)
    {
      System.out.println("Khong tim thay sinh vien nao!");
    }
  }

}
