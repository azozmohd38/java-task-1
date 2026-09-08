package PACKAGE_NAME;

public class MultiplicationTable {
    public static void main(String[]args){
       //Declare an int variable named base and assign it a value of 9
       final int base = 9;
       //Use a for loop that runs a counter variable from 1 to 10
        for (int i = 1; i <= 10; i++){
         int result = base * i;
         System.out.println(base + " x " + i + " = " + result);
        }
    }
}
