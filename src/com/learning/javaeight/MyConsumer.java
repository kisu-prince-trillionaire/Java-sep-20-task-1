package com.learning.javaeight;

import java.util.function.Consumer;

public class MyConsumer {
	public static void main(String[] args) {
		Consumer<Integer> ref = (num)->{
			if(num%2 == 0) {
				System.out.println("Even Number");
			}else {
				System.out.println("Odd Number");
			}
		};
		ref.accept(10);
		ref.accept(35);
	}

}
