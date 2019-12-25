import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine().trim();
        System.out.println("Enter a character: ");
        String c = sc.nextLine().trim();
        char test = c.charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == test) {
                count++;
            }
        }
        System.out.println("Character '" + c + "' appear " + count + " time");
    }
}