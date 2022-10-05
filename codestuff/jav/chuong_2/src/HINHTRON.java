import java.util.Scanner;

public class HINHTRON {
  private double radius;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    
  }
  public HINHTRON()
  {
    this.radius = 0;
  }
  public HINHTRON(double radius)
  {
    this.radius = radius;
  }

  public HINHTRON(HINHTRON cir)
  {
    this.radius = cir.radius;
  }
  public void setRadius(Double radius)
  {
    this.radius = radius;
  }
  public void setRadius()
  {
    System.out.println("Enter new radius: " );
    this.radius = sc.nextDouble();
  }

  public double getRadius()
  {
    return this.radius;
  }


  public void perimeter()
  {
    double p;
    p = 2 * this.radius;
    System.out.println(p + "π");
  } 

  public void area()
  {
    double a;
    a = Math.pow(this.radius, 2);
    System.out.println(a + "π");
  }
}
