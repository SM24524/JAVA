import java.util.Scanner;
import java.lang.Math;

public class E3 {
   public static void main(String [] args){
   
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a month (1-12): ");
   int month = scan.nextInt(); 
   System.out.print("Enter a year: ");
   int year = scan.nextInt();
   
   

   
   if (month < 1 || month > 12) {
   System.out.println("throw new IllegalArgumentException(\"Invalid month\")");
      }    
   else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
   System.out.println("31 days");
      }
   else if (month == 4 || month == 6 || month == 9 || month == 11) {
   System.out.println("30 days");
      }
   else if (month == 2 && year%100 == 0 && year%400 == 0) {
   System.out.println("29 days");
      }
   else if (month == 2 && year%4 == 0 && year%100 != 0) {
   System.out.println("29 days");
      }
   else if (month == 2 && year%100 != 0) {
   System.out.println("28 days");
      }
   else if (month == 2 && year%100 == 0 && year%400 != 0) {
   System.out.println("28 days");
      }
   else if (month == 2 && year%100 != 0 && year%4 != 0) {
   System.out.println("28 days");
      }
      
   System.out.print("Enter beginning balance");
   double balance = scan.nextDouble();
   System.out.print("Enter the number of checks written");
   double checks = scan.nextInt();
   
   if (balance < 0) {
   System.out.println("ACCOUNT OVERDRAWN");
      }
   if (checks < 0) {
   System.out.println("throw new IllegalArgumentException(\"Invalid checks\")");
      }
   else if (checks < 20 && checks >= 0 && balance < 400) {
   double fee = (checks*0.1) + 25;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else if (checks < 20 && checks >= 0 && balance >= 400) {
   double fee = (checks*0.1) + 10;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else if (checks >= 20 && checks <= 39 && balance < 400) {
   double fee = (checks*0.08) + 25;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else if (checks >= 20 && checks <= 39 && balance >= 400) {
   double fee = (checks*0.08) + 10;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else if (checks >= 40  && checks <= 59 && balance < 400) {
   double fee = (checks*0.06) + 25;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else if (checks >= 40  && checks <= 59 && balance >= 400) {
   double fee = (checks*0.06) + 10;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else if (checks > 59 && balance < 400) {
   double fee = (checks*0.04) + 25;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
   else {
   double fee = (checks*0.04) + 10;
   System.out.print("Bank Fees: $");
   System.out.println(fee);
      }
      
      
   System.out.print("1st racer name (First name only): ");
   String firstracer = scan.next();
   System.out.print("1st racer time (Seconds): ");
   double firsttime = scan.nextDouble();
   System.out.print("2nd racer name (First name only): ");
   String secondracer = scan.next();
   System.out.print("2nd racer time (Seconds): ");
   double secondtime = scan.nextDouble();
   System.out.print("3rd racer name (First name only): ");
   String thirdracer = scan.next();
   System.out.print("3rd racer time (Seconds): ");
   double thirdtime = scan.nextDouble();
   
   if (firsttime < 0 || secondtime < 0 || thirdtime < 0) {
   System.out.println("throw new IllegalArgumentException(\"Invalid Time\")");
      }
   else if (firsttime < secondtime && secondtime < thirdtime){
   System.out.print("1st place: ");
   System.out.println(firstracer);
   System.out.print("2nd place: ");
   System.out.println(secondracer);
   System.out.print("3rd place: ");
   System.out.println(thirdracer);
      }
   else if (firsttime < thirdtime && thirdtime < secondtime){
   System.out.print("1st place: ");
   System.out.println(firstracer);
   System.out.print("2nd place: ");
   System.out.println(thirdracer);
   System.out.print("3rd place: ");
   System.out.println(secondracer);
      }
   else if (secondtime < firsttime && firsttime < thirdtime){
   System.out.print("1st place: ");
   System.out.println(secondracer);
   System.out.print("2nd place: ");
   System.out.println(firstracer);
   System.out.print("3rd place: ");
   System.out.println(thirdracer);
      }
   else if (secondtime < thirdtime && thirdtime < firsttime){
   System.out.print("1st place: ");
   System.out.println(secondracer);
   System.out.print("2nd place: ");
   System.out.println(thirdracer);
   System.out.print("3rd place: ");
   System.out.println(firstracer);
      }
   else if (thirdtime < secondtime && secondtime < firsttime){
   System.out.print("1st place: ");
   System.out.println(thirdracer);
   System.out.print("2nd place: ");
   System.out.println(secondracer);
   System.out.print("3rd place: ");
   System.out.println(firstracer);
      }
   else if (thirdtime < firsttime && firsttime < secondtime){
   System.out.print("1st place: ");
   System.out.println(thirdracer);
   System.out.print("2nd place: ");
   System.out.println(firstracer);
   System.out.print("3rd place: ");
   System.out.println(secondracer);
      }
   else if (firsttime == secondtime && secondtime < thirdtime){
   System.out.print("1st place: ");
   System.out.print(firstracer);
   System.out.print(" and ");
   System.out.println(secondracer);
   System.out.print("3rd place: ");
   System.out.println(thirdracer);
      }
   else if (firsttime == secondtime && secondtime > thirdtime){
   System.out.print("1st place: ");
   System.out.println(thirdracer);
   System.out.print("3rd place: ");
   System.out.print(firstracer);
   System.out.print(" and ");
   System.out.println(secondracer);
      }
   else if (firsttime == thirdtime && thirdtime < secondtime){
   System.out.print("1st place: ");
   System.out.print(firstracer);
   System.out.print(" and ");
   System.out.println(thirdracer);
   System.out.print("3rd place: ");
   System.out.println(secondracer);
      }
   else if (firsttime == thirdtime && thirdtime > secondtime){
   System.out.print("1st place: ");
   System.out.println(secondracer);
   System.out.print("3rd place: ");
   System.out.print(firstracer);
   System.out.print(" and ");
   System.out.println(thirdracer);
      }
   else if (thirdtime == secondtime && secondtime < firsttime){
   System.out.print("1st place: ");
   System.out.print(thirdracer);
   System.out.print(" and ");
   System.out.println(secondracer);
   System.out.print("3rd place: ");
   System.out.println(firstracer);
      }
   else if (thirdtime == secondtime && secondtime > firsttime){
   System.out.print("1st place: ");
   System.out.println(firstracer);
   System.out.print("3rd place: ");
   System.out.print(thirdracer);
   System.out.print(" and ");
   System.out.println(secondracer);
      }
   else {
   System.out.print(firstracer);
   System.out.print(", ");
   System.out.print(secondracer);
   System.out.print(", and ");
   System.out.print(thirdracer);
   System.out.println(" all tied.");
      }
   
   int airspeed = 1100;
   int waterspeed = 4900;
   int steelspeed = 16400;
   
   System.out.println("Pick one of the folowing mediums: Air, Water, Steel");
   String material = scan.next();
   System.out.print("Enter a distance a sound wave will travel in your selected medium (feet): ");
   double distance = scan.nextDouble();

   
   if (material.equals("Air")) {
   double ans = (distance/airspeed);
   System.out.print(Math.round(ans * 10000d) / 10000d);
   System.out.println(" seconds");
      }
   else if (material.equals("Water")) {
   double ans = (distance/waterspeed);
   System.out.print(Math.round(ans * 10000d) / 10000d);
   System.out.println(" seconds");
      }
   else if (material.equals("Steel")) {
   double ans = (distance/steelspeed);
   System.out.print(Math.round(ans * 10000d) / 10000d);
   System.out.println(" seconds");
      }
   else if (! material.equals("Steel") && ! material.equals("Water") && ! material.equals("Air") && distance <= 0) {
   System.out.println("Invalid medium and distance");
      }
   else if (distance <= 0){
   System.out.println("Invalid Distance");
      }
   else {
   System.out.println("Invalid Medium");
      }
      
   System.out.print("Enter your first name: ");
   String name = scan.next();
   System.out.print("Enter your height (feet): ");
   double height = scan.nextDouble();
   System.out.print("Enter your weight (lbs): ");
   double weight = scan.nextDouble();
   
   if (height <= 0 || weight <= 0) {
   System.out.println("Invalid height or weight input");
      }
   else {
   System.out.print("Name: ");
   System.out.println(name);
   System.out.print("Height: ");
   System.out.println(height*0.3048);
   System.out.print("Weight: ");
   System.out.println(weight*0.453592);
      }

   
   }
}