class Point{
   private int x;
   private int y;
   
   public Point(int x, int y){
      this.x = x;
      this.y = y;
   }
   
   public void setX(int x){
      this.x =x;
   }
   public int getX(){
      return this.x;
   }
   
   public void setY(int y){
      this.y =y;
   }
   public int getY(){
      return this.y;
   }
}

//------------------------
class Line
{
   private Point p1;
   private Point p2;
   
   public Line(Point p1, Point p2)
   {
      this.p1 = p1;
      this.p2 = p2;
   }
   
   public double getDistance()
   {
      return Math.sqrt(  Math.pow((p2.getX()-p1.getX()),2) + Math.pow((p2.getY()-p1.getY()),2));
   }
}

//------------------------
class Circle
{
   double radius;
   
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public double getArea()
   {
      return Math.PI * radius * radius;
   }
   
   public double getCircum()
   {
      return 2 * Math.PI * radius;
   }}

//------------------------
public class CartesianPlane //Demo class
{
   public static void main(String args[])
   {
      Point dot1 = new Point(3,2);
      Point dot2 = new Point(3,-2);
      Line linya = new Line(dot1, dot2);
      double distance = linya.getDistance();
      System.out.println("Distance between dot1 and dot2: "+distance);
      Circle lingin = new Circle(distance);
      double area = lingin.getArea();
      System.out.println("Area: "+area);
      double circum = lingin.getCircum();
      System.out.println("Circumference: "+circum); 
   }
}
