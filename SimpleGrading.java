//Heather Cunningham and Bryanna O'Brien 10/26/16 Adv Java Fall '16
import java.util.Arrays;
import java.util.Scanner;

public class SimpleGrading implements Grading, InputGrades
{   
   //private int n;//# of grades in array, size of array

/**
Mean accepts array of ints and returns simple average of all values.
*/
   @Override
   public int mean(int[] arrPassed)
   {
      int sum = 0;
      for(int n: arrPassed)
      {
         sum +=n;
      }
      sum = sum/arrPassed.length;
      return sum;
   }//end mean

/**
Median accepts array of ints, which must be sorted first, and returns the value directly in the middle (the midpoint).
*/
   @Override
   public int median(int[] arrPassed)
   {
      
      int medianPosition = arrPassed.length / 2;
      if ( (arrPassed.length % 2) != 0)
      {
         return arrPassed[medianPosition]; 
      }
      if ( (arrPassed.length % 2) == 0)
      {
         
         return ((arrPassed[medianPosition] + arrPassed[medianPosition -1]) / 2); 
      }
      return 0;
   }//end median

/**
Mode accepts an array of ints, which can be sorted first for ease of use, and returns the value that occurrs the most frequently.
Return an array of all the modes. If no mode, return the entire array.  
*/
   @Override
   public int[] mode(int[] arrPassed)
   {
      int[] modeArr = new int[arrPassed.length];
      
      System.out.print("Mode(s): ");
      for(int i = 0; i <= (arrPassed.length -2); ++i )
      {
         if(arrPassed[i] == arrPassed[i +1])
         {
            modeArr[i] = arrPassed[i + 1];
            System.out.print(modeArr[i] + "\t");
         }//end if   
      }//end for loop
      System.out.println();
      //Test: 
      //System.out.println("This is my modeToString meth: " + modeToString(modeArr) ); 
      //works but is never called in the Demo
      return modeArr; 
   }//end mode v3
   
//toString for mode
/*This method is never called in the Demo, so doesn't matter."
 
   public String modeToString(int[] modeArrPassed)
   {
      String modes = "";
      for(int i = 0; i < modeArrPassed.length; ++i)
         modes = modes.concat(modeArrPassed[i] + "\t"); 
      
      return  modes;
   }//end modeToString
*/
      
/**
Ask user for # of grades to process and save to n.
Create array of size n.
Ask user for grade values and save to array.
*/

   @Override
   public int[] strictGrades()
   {
      Scanner keyboard = new Scanner(System.in);
      int n = 0;
      System.out.println("How many grades to enter?");
      n = keyboard.nextInt();
      int[] strictGradesArr = new int[n];
      for(int i = 0; i < strictGradesArr.length; i++)
      {  
         System.out.println("Grade to enter?");
         strictGradesArr[i] = keyboard.nextInt();
      }
      Arrays.sort(strictGradesArr);
      return strictGradesArr;
   }//end strictGrades
   
/**
Ask user for # of grades to process and save to n.
Create array of size n.
Ask user for grade values and save to array.
Drop the lowest value/grade from the array.
Must return an array without any empty spaces.
*/
   
   @Override
   public int[] lessStrictGrades()
   {
      int n = 0, j = 0;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("How many grades to enter?");
      n = keyboard.nextInt();
      int[] lessStrictGradesArr = new int[n];
      for(int i = 0; i < lessStrictGradesArr.length; i++)
      {
         System.out.println("Grade to enter?");
         lessStrictGradesArr[i] = keyboard.nextInt();
      }
      Arrays.sort(lessStrictGradesArr);
      int[]  newGrades = new int[n-1];
      for(int i = 1; i <  lessStrictGradesArr.length; i++, j++)
      {
         newGrades[j] = lessStrictGradesArr[i];
      }
      return lessStrictGradesArr;
   }//end lessStrictGrades 
   
}//end class interface 