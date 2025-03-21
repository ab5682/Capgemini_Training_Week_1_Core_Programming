public class two {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > first) {
                second = first;
                first = digit;
            } else if (digit > second && digit != first) {
                second = digit;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < first) {
                second = first;
                first = digit;
            } else if (digit < second && digit != first) {
                second = digit;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] maxTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + maxTwo[0] + ", Second Largest: " + maxTwo[1]);

        int[] minTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + minTwo[0] + ", Second Smallest: " + minTwo[1]);
    }
}
