package convert_base;

public class BinToDec {
    public BinToDec() {
    }

    public int covertBinToDec(String binaryNumber) {
        int decimalNumber = 0;
        for (int loopIndex = 0; loopIndex < binaryNumber.length(); loopIndex++) {
            int numberIndex = binaryNumber.length() - loopIndex - 1;
            decimalNumber += Character.getNumericValue(binaryNumber.charAt(loopIndex)) * Math.pow(2, numberIndex);
        }

        return decimalNumber;
    }
}
