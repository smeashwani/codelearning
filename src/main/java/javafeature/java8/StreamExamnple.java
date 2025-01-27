package javafeature.java8;

import java.util.stream.IntStream;

public class StreamExamnple {
	public static void main(String[] args) {
		IntStream.range(1, 4).peek(System.out::println).peek(i -> {
			if(i == 3) throw new RuntimeException("Exception");
		});
	}

}
