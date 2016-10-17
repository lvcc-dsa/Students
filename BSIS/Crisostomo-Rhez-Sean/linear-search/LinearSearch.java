import java.util.Scanner;
import java.util.Random;
public class LinearSearch {
 public static void main(String[]args){
  int a, size, search, array[];
  
  Scanner input = new Scanner (System.in);
  Random rand = new Random();
  
  System.out.println("Enter array size: ");
  size = input.nextInt();
  array = new int[size];
  
  System.out.println("Enter number to find: ");
  search = input.nextInt();
  
  for (a = 0; a< size; a++){
   array[a] = rand.nextInt(1000);
   
   if(array[a] == search){
    System.out.println("FOUND!!! :"+ search + "is at"+ "array["+a+"]");
    break;
   }
  }
  if(a == size){
   System.out.println("NOT FOUND:"+ search +" is not in the array.");
  }
 }
}