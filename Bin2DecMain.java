import java.util.Scanner;
import convert_base.BinToDec;

public class Bin2DecMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinToDec binToDec = new BinToDec();

        System.out.print("Enter the binary number: ");
        String binaryNumber = scanner.nextLine();
        System.out.println(binToDec.covertBinToDec(binaryNumber));
    }
}