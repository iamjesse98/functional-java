class myClass {
	public static void main(String[] args) {
		GreetingService greetingFunction = () -> System.out.println("Hey there");
		UniOperation doubleMe = (int a) -> a*2;
		MathOperation addUs = (int a, int b) -> a + b;
		greetingFunction.sayMessage();
		System.out.println(doubleMe.operation(5));
		System.out.println(addUs.operation(5, 50));
	}
	interface MathOperation {
  		 int operation(int a, int b);
	}
	interface UniOperation {
  	 	int operation(int a);
	}
	interface GreetingService {
  	        void sayMessage();
	}
}
