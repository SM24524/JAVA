public class E6{
   public static void main(String [] args){
   
      circle c = new circle(5.5);
      System.out.println(c.getradius());
      
      c.setradius(6);
      System.out.println(c.getradius());
      
      System.out.println(c.area());
      
      System.out.println(c.circumference());
      
      System.out.println(c.circle());
      
      rectangle r = new rectangle(4, 5);
      
      System.out.println(r.getlength());
      
      System.out.println(r.getwidth());
      
      r.setlength(6);
      r.setwidth(2);
      
      System.out.println(r.getlength());
      
      System.out.println(r.getwidth());
      
      System.out.println(r.area());
      
      System.out.println(r.perimeter());
      
      System.out.println(r.rect());
      
      employee e = new employee("John", "Doe", 123, 20000);
      
      System.out.println(e.getfirst());
      System.out.println(e.getlast());
      System.out.println(e.getid());
      System.out.println(e.getsalary());
      
      e.setfirst("Cornelius");
      e.setlast("Wallace");
      e.setid(546);
      e.setsalary(10000);
      
      System.out.println(e.getfirst());
      System.out.println(e.getlast());
      System.out.println(e.getid());
      System.out.println(e.getsalary());
      
      e.raise(50);
      System.out.println(e.getsalary());
      
      functions f = new functions();
      
      System.out.println(f.factorial(5));
      System.out.println(f.hypotenuse(3, 4));
      System.out.println(f.quadratic(1,-7,-3));
      System.out.println(f.sinc(3));
   
   }
}
