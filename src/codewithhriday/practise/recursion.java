package codewithhriday.practise;

class recursion {
    static void rec(int n) {
        if (n > 0) {
            // System.out.print("\t"+n); - REVERSE in DESC
            rec(n - 1);
            System.out.print("\t"+n);// in ASC
        }
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.print("Numbers from 1 to " + n + ":");
        rec(n);
    }
}
