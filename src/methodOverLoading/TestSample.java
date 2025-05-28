package methodOverLoading;
//3. Write two methods with the same name and same number of parameters of same type and call from main method

class Sample {
    void show(int a) {
        System.out.println("Integer version: " + a);
    }

    void show(String s) {
        System.out.println("String version: " + s);
    }
}
public class TestSample {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.show(25);
        obj.show("Hello");
    }
}

