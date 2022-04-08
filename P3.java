import java.util.*;
import java.io.*;
import java.lang.*;

public class P3{
   public static void main(String [] args)throws IOException{
   
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a file name: ");
   String name = scan.next();
   System.out.print("Enter a shift value: ");
   int shift = scan.nextInt();
   System.out.print("Enter a key: ");
   String key = scan.next();
   String userkey = "";
   
   
   File file = new File(name);
   
   String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String lowercasealphabet = "abcdefghijklmnopqrstuvwxyz";
   
   

   if (file.exists()){
   
      String reverse = name;
      int insertpos = name.length() - 4;
      
      reverse = name.substring(0, insertpos) + "_caesar" + name.substring(insertpos);
   
      FileReader fr = new FileReader(file);
      Scanner write = new Scanner(reverse);
      PrintStream out = new PrintStream(reverse);
   
      int c = 0;
      
      while((c = fr.read()) != -1){
         char ch = (char) c;
         String stringch = String.valueOf(ch);
         
            if (alphabet.contains(stringch)){
            int letter = alphabet.indexOf(stringch);
            int translated = letter + shift;
            char finalch = alphabet.charAt(translated%52);
            String printout = String.valueOf(finalch);
            out.print(printout);
            
               }
               
            else {
            
            String printout = String.valueOf(ch);
            out.print(printout);
            
               }
            }
            out.close();
            write.close();
         int d = 0;
         while (d < key.length()){
            char keycharcon = key.charAt(d);
            String keychar = String.valueOf(keycharcon);
            
            if (userkey.contains(keychar)){
               
               }
            else{
               if (alphabet.contains(keychar)){
                  userkey = String.join("", userkey, keychar);
                  }
               else{
                  userkey = userkey;
                  }
            }
            
            d = d + 1;
            }
         
         int la = 0;
         while (userkey.length() < 26){
            char a = lowercasealphabet.charAt(la);
            String alpha = String.valueOf(a);
            if (userkey.contains(alpha)){
               
               }
            else {
               userkey = String.join("", userkey, alpha);
               }
            la = la + 1;
            }

               
         int e = 0;  
         
         String cipher = name;
         int inserting = name.length() - 4;
   
         cipher = name.substring(0, insertpos) + "_keyword" + name.substring(inserting);


         Scanner writer = new Scanner(cipher);
         PrintStream active = new PrintStream(cipher); 
         
         FileReader fr2 = new FileReader(file);
         
         while((e = fr2.read()) != -1){
         char cha = (char) e;
         cha = Character.toLowerCase(cha);
         String cont = String.valueOf(cha);
         
         if (lowercasealphabet.contains(cont)){
         
            int find = userkey.indexOf(cha);
            int index = find + shift;
            char printing = userkey.charAt(index%26);
            String finalprint = String.valueOf(printing);

            active.print(finalprint);
            }
         else{
            
            active.print(cont);
            
         }
         

         
            }
            active.close();
         
         
         }
      else {
      System.out.println("File doesn't exist");
      System.out.print("1");
         }
         
         
         
   

   
         
      }
   }
