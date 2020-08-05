package util;

import java.util.Random;

public class MyUtils {
	private String foo;

	public MyUtils(String foo) {
		this.foo = foo;
	}

	public String getFoo() {
		return foo;
	}

	public static String appendRandom(String base) {
		return base + new Random().nextInt();
	}
}
