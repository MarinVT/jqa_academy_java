public class Test {

    public static void main(String[] args) {

        recursion(5);
    }


    public static void recursion(int n) {
        if (n == 0) {
            System.out.println("HI");
        } else {
            System.out.println(n);
            n++;
            recursion(n);
        }
    }
}
