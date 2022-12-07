// Java program for the above approach
import java.util.*;

class combinationINT{

    // Store the current sequence of s
    static String combination = "";

    // Store the all the required sequences
    static HashSet<String> combinations = new LinkedHashSet<String>();

    // Function to print all sequences of S
// satisfying the required condition
    static void printSequences(HashSet<String> combinations)
    {

        // Print all Strings in the set
        for(String s : combinations)
        {
            System.out.print(s + " ");
        }
    }

    // Function to generate all sequences
// of String S that are at most N
    static void generateCombinations(String s, int n)
    {

        // Iterate over String s
        for(int i = 0; i < s.length(); i++)
        {

            // Push ith character to combination
            combination += (s.charAt(i));

            // Convert the String to number
            long x = Integer.valueOf(combination);

            // Check if the condition is true
            if (x <= n)
            {

                // Push the current String to
                // the final set of sequences
                combinations.add(combination);

                // Recursively call function
                generateCombinations(s, n);
            }

            // Backtrack to its previous state
            combination = combination.substring(
                    0, combination.length() - 1);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "1234";
        int N = 100;

        // Function Call
        generateCombinations(S, N);

        // Print required sequences
        printSequences(combinations);
    }
}

// This code is contributed by Amit Katiyar
