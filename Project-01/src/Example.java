public class Example {
    public static void main(String[] args) {
        new PrintInt(10).printInt();
        new PrintDouble(20.5).printDouble();
    }

}

class PrintInt {
    private int x;

    PrintInt(int x) {
        this.x = x;
    }

    public void printInt() {
        System.out.println(x);
    }

}

class PrintDouble {
    private double y;


    PrintDouble(double y) {
        this.y = y;
    }

    public void printDouble() {
        System.out.println(y);
    }
}
