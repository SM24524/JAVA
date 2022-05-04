public class rectangle{

   private double length;
   private double width;
   
   public rectangle(double length, double width){
      this.length = length;
      this.width = width;
      }
      
   public String getlength(){
      String print = Double.toString(length);
      return print;
      }
      
   public void setlength(double len){
      length = len;
      }
      
   public String getwidth(){
      String print = Double.toString(width);
      return print;
      }
      
   public void setwidth(double wid){
      width = wid;
      }
      
   public double area(){
      return (width*length);
      }
      
   public double perimeter(){
      return ((2*width)+(2*length));
      }
      
   public String rect(){
      String template = "Rectangle[length=";
      String wid = ",width=";
      String close = "]";
      return (template + length + wid + width + close);
      }



   }
