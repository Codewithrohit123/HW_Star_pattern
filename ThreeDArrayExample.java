package HW_Star_pattern;

public class ThreeDArrayExample {
    public static void main(String[] args) {
                int[][][] A3D = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
        };

       
        for (int i = 0; i < A3D.length; i++) { 
            for (int j = 0; j < A3D[i].length; j++) { 
                for (int k = 0; k < A3D[i][j].length; k++) { 
                    System.out.print(A3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println(); 
        }
    }
}
