//Heather Cunningham and Bryanna O'Brien 10/26/16 Adv Java Fall '16
public class DemoGradingInterfaces
{
   public static void main(String[] args)
   {
      // Naming objs "Fred" was an inside classroom joke w/ this professor.
      SimpleGrading Fred = new SimpleGrading();
      int[] gradesHard = Fred.strictGrades();
      int[] gradesEasy = Fred.lessStrictGrades();
      System.out.println("Using the strict grading paradigm:");
      System.out.println("Mean: " + Fred.mean(gradesHard));
      System.out.println("Median: " + Fred.median(gradesHard));
      System.out.println("Mode: " + Fred.mode(gradesHard));
      System.out.println("Using the less strict grading paradigm:");
      System.out.println("Mean: " + Fred.mean(gradesEasy));
      System.out.println("Median: " + Fred.median(gradesEasy));
      System.out.println("Mode: " + Fred.mode(gradesEasy));
      
   }//end main
}//end class