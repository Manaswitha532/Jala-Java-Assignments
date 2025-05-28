package operatorss;
//. Write a method for increment and decrement operators(++, --)

public class IncrementDecrement {
	int inc(int num) {
		return ++num;
	}
	int dec(int numb) {
		return --numb;
	}
	public static void main(String[] args) {
		IncrementDecrement obj=new IncrementDecrement();
		System.out.println(obj.inc(5));
		System.out.println(obj.dec(5));
		
	}

}
