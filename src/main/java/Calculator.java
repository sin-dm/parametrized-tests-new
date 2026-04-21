public class Calculator {

    String name;

    int digits = 8;

    public Calculator() {
        name = "Test calculator";
    }

    public int sum(int x, int y) {
        System.out.println(x);
        System.out.println(y);
        return x + y;
    }

    public String doSome() {
        return "dosome";
    }
}
