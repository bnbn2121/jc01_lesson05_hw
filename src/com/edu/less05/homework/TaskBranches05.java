package com.edu.less05.homework;

/*
 * Составить программу: определения наименьшего
 * из двух чисел а и b.
 */
public class TaskBranches05 {

	public static void main(String[] args) {
		int a = 4;
		int b = -7;

		System.out.println("a = " + a + ", b = " + b);
		if (a < b) {
			System.out.println("наименьшее число - a");
		} else if (b < a) {
			System.out.println("наименьшее число - b");
		} else {
			System.out.println("числа равны");
		}
	}

}
