import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class P4{
   public static void main(String [] args){
   
      Scanner scan = new Scanner(System.in);
      
      Random rand = new Random();
   
      int d1 = rand.nextInt(6);
      int d2 = rand.nextInt(6);
      int d3 = rand.nextInt(6);
      int d4 = rand.nextInt(6);
      int d5 = rand.nextInt(6);
      int d6 = rand.nextInt(6);
      int d7 = rand.nextInt(6);
      int d8 = rand.nextInt(6);
      int d9 = rand.nextInt(6);
      int d10 = rand.nextInt(6);
      int d11 = rand.nextInt(6);
      int d12 = rand.nextInt(6);
      int d13 = rand.nextInt(6);
      int d14 = rand.nextInt(6);
      int d15 = rand.nextInt(6);
      int d16 = rand.nextInt(6);
      int d17 = rand.nextInt(6);
      int d18 = rand.nextInt(6);
      int d19 = rand.nextInt(6);
      int d20 = rand.nextInt(6);
      int d21 = rand.nextInt(6);
      int d22 = rand.nextInt(6);
      int d23 = rand.nextInt(6);
      int d24 = rand.nextInt(6);
      int d25 = rand.nextInt(6);
      int d26 = rand.nextInt(6);
      int d27 = rand.nextInt(6);
      int d28 = rand.nextInt(6);
      int d29 = rand.nextInt(6);
      int d30 = rand.nextInt(6);
      
      int[] dom = {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30};
      
      
      System.out.println("  1    2    3    4    5    6    7    8    9    10   11   12   13   14   15");
      System.out.println("("+d1+"|"+d2+")("+d3+"|"+d4+")("+d5+"|"+d6+")("+d7+"|"+d8+")("+d9+"|"+d10+")("+d11+"|"+d12+")("+d13+"|"+d14+")("+d15+"|"+d16+")("+d17+"|"+d18+")("+d19+"|"+d20+")("+d21+"|"+d22+")("+d23+"|"+d24+")("+d25+"|"+d26+")("+d27+"|"+d28+")("+d29+"|"+d30+")");
      
      String order = "X";
      
      int score = 0;
            
      while(order.length() != 0){
         
         System.out.print("Enter a list of dominoes with commas between numbers, or hit enter if you have no more combinations: ");
         order = scan.nextLine();
         
         if (order.length() > 0){
            String [] string =  order.split(",");
   
            
            int[] orderarr = new int[string.length];
            
            for (int i = 0; i < string.length; i++) {
               orderarr[i] = Integer.valueOf(string[i]);
           }

           
           int x = 0;
           int y = 1;
           int z = 1;
           
           while(z < orderarr.length){
           
           int range1 = (2*orderarr[x]) - 1;
           int range2 = (2*orderarr[x+1])-2;
           

           
           if (dom[range1] == dom[range2]){
            
            }
            
            
            
           else{
            System.out.println("False");
            break;
            }
            
            
           
           z = z+1;
           x = x+1;
           

           }
           
           System.out.println("True");
            score = score + orderarr.length;
         
         }
      
      
      
      
      }
      System.out.print("Final Score: ");
      System.out.println(score);
   }
   }
