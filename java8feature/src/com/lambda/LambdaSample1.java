package com.lambda;

public class LambdaSample1 {

	public static void main(String[] args) {

		// Implementation using anonymous class
		Message msg = new Message() {

			@Override
			public void displayMessage(String message) {
				System.out.println("Welcome " + message);
			}

		};

		msg.displayMessage("Muthu");

		// Using Lambda without parameter
		String sa = "Muthu";
		Message msg1 = (b) -> System.out.println("From Lambda Welcome " + b);
		msg1.displayMessage(sa);

		disply(((sb) -> System.out.println(" 1111111112 " + sb)), sa);

		disply(((sb) -> System.out.println(" 3333333333333 " + sb)), sa);

		invokeOperation((a, b) -> a + b, 2, 5);
		
		invokeOperation( (int a, int b) -> {return a * b;}, 2, 5);
		
		invokeOperation( (a, b) -> {return a / b;}, 2, 2);

	}

	private static void disply(Message msg, String data) {
		msg.displayMessage(data);
	}

	private static void invokeOperation(Operation operation, int a, int b) {
		System.out.println(" >> " + operation.doOperation(a, b));
	}

}
