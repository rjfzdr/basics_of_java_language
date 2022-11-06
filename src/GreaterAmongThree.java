public class GreaterAmongThree {
    public static void main(String[] args) {
        int num1 = 6,num2 = 6, num3 = 5,largest;
        if (num1>=num2) {

            if (num1 >= num3) {
                largest = num1;
            } // if loop ends here

            else {
                largest = num3;
            } // else loop ends here
        }

            else {

                if (num2>=num1)
            {
                largest = num2;
            } // if loop ends here

            else
            {
            largest = num3;
            }// else loop ends here

            }// else loops ends here
        System.out.println("Largest number is :"+largest); // if loop ends here
    } // main function ends here
} // class ends here
