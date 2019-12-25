import java.util.Scanner;

public class Manghaichieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 0;

        System.out.println(" nhap vao mang gom m hang va n cot: ");
        System.out.println(" m:");
        m = sc.nextInt();

        System.out.println(" n: ");
        n = sc.nextInt();


        int manghaichieu[][] = new int[m][n];
        for (int i = 0 ; i<m ; i ++){
            for( int k= 0 ; k<n; k++){
                System.out.println("mang["+ i +"]["+ k +"] =");
                manghaichieu[i][k] = sc.nextInt();
            }
        }

        System.out.println(" cac phan tu cua mang hai chieu la: ");
for( int i = 0 ; i<manghaichieu.length ; i++){
    for( int k = 0 ; k <manghaichieu[1].length ; k++){
        System.out.print(manghaichieu[i][k] + "\t");
    }
    System.out.println(" ");
}
    }
}
