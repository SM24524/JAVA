public class employee{

   private String first;
   private String last;
   private int id;
   private double salary;
   
   public employee(String first, String last, int id, double salary){
      this.first = first;
      this.last = last;
      this.id = id;
      this.salary = salary;
      }
      
   public String getfirst(){
      return first;
      }
      
   public void setfirst(String fname){
      first = fname;
      }
      
   public String getlast(){
      return last;
      }
      
   public void setlast(String lname){
      last = lname;
      }
      
   public int getid(){
      return id;
      }
      
   public void setid(int newid){
      id = newid;
      }
      
   public double getsalary(){
      return salary;
      }
      
   public void setsalary(double newsal){
      salary = newsal;
      }
      
   public String employ(){
      String template = "Employee[id=";
      String fname = ",firstName=";
      String lname = ",lastName=";
      String sal = ",salary=";
      String end = "]";
      return template + id + fname + first + lname + last + sal + salary + end;
      }
      
   public void raise(double percent){
      double per = percent/100;
      salary = salary*(1+per);
      }
   

   }
