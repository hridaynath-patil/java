package codewithhriday.addition;

public class addtwomatrix {
    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2, 3}, {7, 8, 9}};

        int[][] matrix2 = {{9, 8, 7}, {3, 2, 1}};

        int[][] result = new int[2][3];

        //addition of two matrix

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];

                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
