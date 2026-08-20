package codewithhriday.arrays;

public class arraysum {
    public static void main(String[] args) {

        float[] prices= {10.5f, 11.5f, 12.5f, 13.5f};
        float sum= 0.0f;

        for (int i=0; i<prices.length; i++) {
            sum= sum + prices[i];
        }
        System.out.println("The sum of the array elements is: "+ sum);
    }
}
