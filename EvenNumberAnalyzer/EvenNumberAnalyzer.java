public class EvenNumberAnalyzer {

    public static void main(String[] arge) {
        //Declare an int variable named limit and set it to 20
        int limit = 20;
        //Declare an int variable named count and initialise it to 0
        int count = 0;
        //Declare an int variable named sum and initialise it to 0
        int sum = 0;
        // loop to iterate from 1 to limit
        for (int i = 1; i <= limit; i++)
            if (i % 2 == 0) {
                //print even number
                System.out.println(i);
                // ncrease the count variable by 1
                count++;
                //Add the number to the sum
                sum += i;

                // Print the total number of even numbers
                System.out.println("Total even numbers: " + count);

                // Print the total sum of all even numbers
                System.out.println("Sum of even numbers: " + sum);
            }
    }
}