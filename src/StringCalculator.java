import java.util.LinkedList;
import java.util.List;

public class StringCalculator {
    public static int add(String numbers) {
        int result = 0;
        if(numbers.isBlank()) return result;
        for(int number: convertNumbers(numbers)) {
            result += number;
        }

        return result;
    }

    private static List<Integer> convertNumbers(String numbers) {
        List<Integer> numbersList = new LinkedList<>();
        String[] numbersArray = splitNumbers(numbers);
        for(String number: numbersArray) {
            int numberInt = 0;
            try {
                numberInt = Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }

            numbersList.add(numberInt);
        }
        return numbersList;
    }

    private static String[] splitNumbers(String numbers) {
        return numbers.split(",|\n");
    }
}
