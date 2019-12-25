import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] InputArray = new int[size];

//        for (int i = 0; i < size; i++) {
//            System.out.print("Value of: " + "array[" + i + "]: " );
//            InputArray[i]=sc.nextInt();
//        }

        for (int i = 0; i < size; i++) {
            InputArray[i] = (int)(Math.floor(Math.random()*100));
        }

        System.out.println();
        System.out.print("Original Array is: ");
        for (int i : InputArray) System.out.print( + i + ",");

        System.out.println();
        System.out.println("Enter the value to delete from array: ");
        int DellValue = sc.nextInt();

        int[] OutputArray = new int[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (InputArray[i] != DellValue) {
                OutputArray[index] = InputArray[i];
                index++;
            }
        }
        System.out.println("After Array: ");
        for (int i : OutputArray) System.out.print(i + ", ");
    }
}