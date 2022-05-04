public class circle{

   private double radius;
   
   public circle(double radius){
      this.radius = radius;
      }
      
   public String getradius(){
      String print = Double.toString(radius);
      return print;
      }
      
   public void setradius(double rad){
      radius = rad;
      }
      
      
   public double area(){
      return (radius*radius*3.1415);
      }
      
   public double circumference(){
      return (2*radius*3.1415);
      }
      
   public String circle(){
      String template = "Circle[radius=";
      String close = "]";
      return (template + radius + close);
      }

}
