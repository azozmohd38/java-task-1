public class FactorialCalculator {





    public static void main(String[] args){
        //Declare an int variable named number and assign it a value of 7\
             final int number = 7;
        //Declare a long variable named factorial and initialise it to 1
            long factorial = 1L;
        //Declare an int variable i and initialise it to 1
            int i = 1;

        //Use a while loop with the condition i <= number
        while (i <= number){
        //multiply factorial by i and store the result back into factorial
            factorial *= i;
        //increment i by 1
            i++;

        //print the original number
            System.out.println("Number: "+ number);
        // Print the calculated factorial value
            System.out.println("Factorial: "+factorial);



        }



    }
}
