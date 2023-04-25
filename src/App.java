import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean process = true;

        while(process){
            String input = scan.nextLine();
            String[] numbers_str = input.split("\\s+");
            int[] numbers = {};

            for (String number_str : numbers_str) {
                int[] new_arry = Arrays.copyOf(numbers, numbers.length + 1);
                new_arry[new_arry.length - 1] = Integer.parseInt(number_str);
                numbers = new_arry;
            }

            int maior = numbers[0];
            for (int number : numbers) {
                if(number > maior){
                    maior = number;
                }
            }
            System.out.println(maior*3);
            System.out.println("continuar? n/s");
            if(scan.nextLine().toLowerCase().equals("n")){
                process = false;
                break;
            }

        }
        scan.close();
    }
}
