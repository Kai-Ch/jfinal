package demo;

import com.jfinal.core.JFinal;

public class Application {
	public static void main(String[] args) {
		JFinal.start("WebRoot", 80, "/", 5);
	}
}
