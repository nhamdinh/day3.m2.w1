
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String[] students = new String[]{"ty", "suu", "dan", "mao", "thin", "ti",
                "ngo", "mui", "than", "dau"};
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter the name you wanna Search For: ");
            String input = sc.nextLine();

            boolean flag = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equalsIgnoreCase(input)) {
                    flag = true;
                    System.out.println("Position of the student " + "'" + input + "'" + " in the list is: " + (i + 1));
                }
            }
            if (!flag) {
                System.out.println("Not found " + input + " in the list.");
            }
        }

    }
}