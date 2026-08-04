public class array2 {
    public static void main(String[] args) {
        // way of printing array Elements

        float [] mark = {98.5f, 90.5f, 78.5f, 89.5f};
        String [] student = {"Hriday", "Rohan", "Shubham", "rahul"};

        System.out.println(mark[0] + " - " + (student[0]));
        System.out.println("The Length of Marks: " + mark.length); //show the the no. of values inside array

        // printing using loop
        System.out.println("The Array: ");


        for(int i=0; i<mark.length; i++){
            System.out.println(student[i] + " - " + mark[i]);
        }

        // print in reverse order
        System.out.println("The Reverse Array: ");

        for (int i= (mark.length - 1); i>=0; i--){
            System.out.println(student[i] + " - " + mark[i]);
        }


    }
}
