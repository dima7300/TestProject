import java.util.Scanner;

public class App {

    public static void main(String[] args){
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6, 9},
//                {7},
//        };
//        // calculate the length of each row
//        System.out.println("Length of row 1: " + a[0].length);
//        System.out.println("Length of row 2: " + a[1].length);
//        System.out.println("Length of row 3: " + a[2].length);
//
//
//
//        for (int i = 0; i < a.length; ++i) {
//            for(int j = 0; j < a[i].length; ++j) {
//                System.out.print(a[i][j]);
//            }
//            System.out.println();
//        }
//
//        // first for...each loop access the individual array
//        // inside the 2d array
//        for (int[] innerArray: a) {
//            // second for...each loop access each element inside the row
//            for(int data: innerArray) {
//                System.out.print(data);
//            }
//            System.out.println();
//        }
//        int m = 3;
//        int n = 4;
//        int a =1;
//        int[][] mn = new int [m][n];
//        for (int i = 0; i < mn.length; ++i) {
////            int a =1;
//            for (int j = 0; j < mn[i].length; ++j) {
//
//
//               mn[i][j] = a;
//               ++a;
//            }
//
//        }
//        for (int[] array : mn) {
//            for (int anInt : array) {
//                System.out.print(String.format("%5d", anInt));
//            }
//            System.out.println();
//        }
//



        int [][] matrix = {
                { -1,   2,   -3,    4,    5,    6,   -7},
                {  8,  -9,   10,  -11,   12,  -13,  -14},
                {-15,  16,  -17,   18,  -19,   20,  -21},
                { -22, -23,  24,  -25,  -26,  -27,   28},
                {29,  30,   31,   32,   33,   34,  35}
        };
        Scanner num = new Scanner(System.in);
        System.out.println("Введите номер строки");
        int a = num.nextInt();
        if (a > matrix.length) {
            System.out.println("Такой строки не существует ей будет присвоено число:  " + matrix.length);
            a = matrix.length;
        }
        int b[] = matrix[a -1];
        int c = 0;
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {
                c += 1;

            }

        }
        System.out.println(" количество отрицательных элементов: " + c);
    }

}