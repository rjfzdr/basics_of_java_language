public class EvenOddNum {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber)
        {
            number++;
            if (!iseven(number))
            {
                continue;

            }
            System.out.println("Even number = " +number);
        }

    }
    public static boolean iseven (int number)
    {
        if (number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
