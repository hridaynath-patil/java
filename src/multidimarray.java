public class multidimarray {
    public static void main(String[] args) {
        int [] [] rc = new int [2][3];
        rc[0][0] = 1;
        rc[0][1] = 2;
        rc[0][2] = 3;
        rc[1][0] = 4;
        rc[1][1] = 5;
        rc[1][2] = 6;

        System.out.println(" the 2d array is : ");
        for(int i=0; i<rc.length; i++){
            for(int j=0; j<rc[i].length; j++){
                System.out.print(rc[i][j] + " ");
            }

            System.out.println("");
        }
    }
}