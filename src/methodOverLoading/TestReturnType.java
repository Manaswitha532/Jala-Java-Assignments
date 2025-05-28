package methodOverLoading;
//5. Write two methods with the same name, number of parameters and data type but different return Type

class ReturnTypeTest {

    int getValue(int x) {
        return x;
    }

    String getValue(String x) {
        return "Value: " + x;
    }
}
public class TestReturnType {
    public static void main(String[] args) {
        ReturnTypeTest obj = new ReturnTypeTest();
        System.out.println(obj.getValue(10));         // Output: 10
        System.out.println(obj.getValue("Manu"));     // Output: Value: Manu
    }
}

