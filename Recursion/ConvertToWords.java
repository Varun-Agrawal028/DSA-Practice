package Recursion;

class ConvertToWords {
    static String[] digitWords = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void convertToWords(int number) {
        // Base case
        if (number == 0) {
            return;
        }

        // Recursive call with smaller number (left digit first)
        convertToWords(number / 10);

        // Print corresponding word for current last digit
        int lastDigit = number % 10;
        System.out.print(digitWords[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int num = 1947;
        convertToWords(num);
    }
}

