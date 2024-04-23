import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num_input = in.nextInt(); //prompt for the number of int to be entered
   
    ArrayListist<Integer> values = new ArrayList<>();

    for (int i = 0; i <= num_input; i++){
      int input = in.nextInt();
      values.add(input);
    }

    int[] occurrences = new int[101]; // Assuming numbers are between 0 and 100
        
        for (int num : values) {
            occurrences[num]++;
        }
        
        // Find the mode
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > maxCount) {
                mode = i;
                maxCount = occurrences[i];
            }
        }
  }
}
