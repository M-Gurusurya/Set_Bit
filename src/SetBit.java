import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number=scanner.nextInt();

        System.out.println(findNumberOFOneBit(number));
    }
    public static int findNumberOFOneBit(int number) {
        int count = 0;
        while (number > 0)
        {
            if ((number & 1)==1)
            {
                count++;
            }
            number=number>>1;
        }
        return count;
    }
}
