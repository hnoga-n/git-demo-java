import java.util.Scanner;

public class HINHCHUNHAT {
  private double length;
  private double width;
  Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    
  }
  public HINHCHUNHAT()
  {
    this.length=0;
    this.width =0;
  }

  public HINHCHUNHAT(double length, double width)
  {
    this.length = length;
    this.width = width;
  }

  public HINHCHUNHAT(HINHCHUNHAT hcn)
  {
    this.length = hcn.length;
    this.width = hcn.width;
  }
  public void setLength()
  {
    System.out.println("enter new length: ");
    this.length = sc.nextDouble();
  }
  public void setLength(double length)
  {
    this.length = length;
  }

  public double getLength()
  {
    return this.length;
  }

  public void setWidth()
  {
    System.out.println("enter new width: ");
    this.width = sc.nextDouble();
  }
  public void setidth(double width)
  {
    this.width = width;
  }

  public double getWidth()
  {
    return this.width;
  }

  public double perimeter(double length, double width)
  {
    return (double) ((this.length + this.width)/2);
  }

  public double area(double length, double width)
  {
    return (double) ((this.length * this.width));
  }

}
