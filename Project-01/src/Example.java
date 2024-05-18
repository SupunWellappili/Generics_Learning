public class Example {
    public static void main(String[] args) {
        /*new PrintInt(10).printInt();
        new PrintDouble(20.5).printDouble();*/

        Print<Integer> p1 = new Print<>(34);
        p1.printData();

        Print<String> p2 =new Print<>("Hello");
        p2.printData();
    }

}

class Print<T> {
    private T x;

    Print(T x) {
        this.x = x;
    }

    public void printData() {
        System.out.println(x);
    }

}

/*

class PrintDouble {
    private double y;


    PrintDouble(double y) {
        this.y = y;
    }

    public void printDouble() {
        System.out.println(y);
    }
}
*/
