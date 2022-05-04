import java.lang.Math;

public class functions{

   public functions(){
      }
      
   public int factorial(int number){
      int i;
      int fact = 1;
      for(i=1;i<=number;i++){    
      fact=fact*i; 
      }
      return fact;

   }
   
   public double hypotenuse(double a, double b){
      double total = (a*a) + (b*b);
      return Math.sqrt(total);
      }
      
   public String quadratic(double a, double b, double c){
      double discriminant = Math.sqrt((b*b)-(4*a*c));
      double begnum = -b;
      double denominator = (-2*a);
      double posans = (begnum + discriminant)/denominator;
      double negans = (begnum - discriminant)/denominator;
      String ansa = Double.toString(posans);
      String ansb = Double.toString(negans);
      String comma = ",";
      return(ansa + comma + ansb);
      }
      
   public double sinc(double x){
      double two = 2*x;
      double numerator = Math.sin(two);
      double denominator = two;
      return (numerator/denominator);
      }
}
