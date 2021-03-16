package com.everis.eclipsemaven;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		System.out.println("¡HOLA BOOTCAMP!");

		if (NumberUtils.compare(10, 5) == 0) {
			System.out.println("SI, SON IGUALES");
		} else {
			System.out.println("NO, NO SON IGUALES");
		}
	}
}
