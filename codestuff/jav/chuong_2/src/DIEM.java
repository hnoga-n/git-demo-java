import java.util.Scanner;

public class DIEM {
  private int x;
  private int y;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    DIEM a = new DIEM(2,3);
    Scanner sc = new Scanner(System.in);
    char mode;
    do
    {
      System.out.println("a:Move to left");
      System.out.println("d:Move to right");
      System.out.println("w:Move up");
      System.out.println("s:Move down");
      System.out.println("q:Quit");
      mode = sc.next().charAt(0);
      switch(mode)
      {
        case 'w': a.moveUp();break;
        case 's': a.moveDown();break;
        case 'a': a.moveToLeft();break;
        case 'd': a.moveToRight();break;
        case 'q': System.out.println("program terminated"); break;
      }

    }
    while(mode !='q');

  }

  public DIEM()
  {
    this.x = 0;
    this.y = 0;
  }
  public DIEM(int x,int y)
  {
    this.x = x;
    this.y = y;
  }
  public DIEM(DIEM obj)
  {
    this.x = obj.x;
    this.y = obj.y;
  }

  
  public void input()
  {
    System.out.println("Enter x: ");
    this.x = sc.nextInt();
    System.out.println("Enter y: ");
    this.y = sc.nextInt();
  }

  public void setX()
  {
    System.out.println("Enter new X: ");
    this.x = sc.nextInt();
  }
  public void setY()
  {
    System.out.println("Enter new Y: ");
    this.y = sc.nextInt();
  }

  public void output()
  {
    System.out.println("x: " + x);
    System.out.println("y :" + y);
  }

  public void moveToLeft()
  {
    this.x--;
    output();
  }

  public void moveToRight()
  {
    this.x++;
    output();
  }

  public void moveUp()
  {
    this.y++;
    output();
  }
  public void moveDown()
  {
    this.y--;
    output();
  }

  
}
