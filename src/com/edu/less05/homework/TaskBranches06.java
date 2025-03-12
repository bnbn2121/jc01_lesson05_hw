package com.edu.less05.homework;

/*
 * Составить программу: определения наибольшего
 * из двух чисел а и b.
 */
public class TaskBranches06 {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int max;
		int del = a - b;

		if (del == 0) {
			System.out.println("Оба числа равны " + a);
		} else {
			if (del > 0) {
				max = a;
			} else {
				max = b;
			}
			System.out.printf("Наибольшее из чисел %d и %d:%n%d", a, b, max);
		}
	}
}