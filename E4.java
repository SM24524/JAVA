import java.util.Random;
import java.util.*;
import java.lang.Math;
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
      }while(randomnum != sum);
      
   out.close();
   
   Scanner number = new Scanner(System.in);
   
   int usernum;
   do{
   System.out.print("Enter a number between 0-10: ");
   usernum = input.nextInt();
      if (usernum < 0 || usernum > 10){
      System.out.println("Invalid Input");
         }
      }while(usernum < 0 || usernum > 10);
      
   number.close();
   
   Scanner reader = new Scanner(file);
   
   double vowels = 0;
   
   while(reader.hasNextLine()){
   String line = reader.nextLine();
   for (int i = 0; i <= line.length(); i++){
   char ch = line.charAt(i);
      if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'|| ch == 'U' || ch == 'u'){
         vowels = vowels + 1;
            }
      else if (ch == '!' || ch == '.' || ch == '?'){
            break;
            }
         }

   System.out.print(line.length());
   System.out.print(" characters in the line. ");
   double percent = (vowels/line.length())*100;
   System.out.print((Math.round(percent * 100d) / 100d));
   System.out.println("% are vowels.");
   vowels = 0;
   percent = 0;
   }
   }
}
