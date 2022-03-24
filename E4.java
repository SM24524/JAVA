import java.util.Random;
import java.util.Scanner;
import java.io.*;


class E4{
   public static void main(String [] args)throws IOException{
   
   
   File file = new File("sampletext.txt");
   Scanner scan = new Scanner(file);
   File reverseFile = new File("sampletext_reverse.txt");
   String reverse = "";
   PrintStream out = new PrintStream(reverseFile);
   while(scan.hasNextLine()){
      reverse = reverse + scan.nextLine() + "\n";
   }
   for(int i = reverse.length () -1; i>= 0; i--){
      out.print(reverse.charAt(i));
      }
   
   scan.close();
   
   Random rand = new Random();
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a desired sum (2-12): ");
   
   int sum = input.nextInt();
   scan.close();
   
   Scanner writer = new Scanner(file);
   
   File dice = new File("dice.txt");
   

   PrintStream write = new PrintStream(dice);
   
   int randomnum = rand.nextInt(11) + 2;
   
   do{
      randomnum = rand.nextInt(11) + 2;
      write.println(randomnum);
      System.out.println(randomnum);
      }while(randomnum != sum);
      
   out.close();
   
   
   
   }
}
