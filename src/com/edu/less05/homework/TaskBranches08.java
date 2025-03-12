package com.edu.less05.homework;

/*
 * Составить программу нахождения наименьшего
 * из квадратов двух чисел а и b.
 */
public class TaskBranches08 {

	public static void main(String[] args) {
		int a = -1;
		int b = 11;

		int a2 = a * a;
		int b2 = b * b;

		System.out.println("a = " + a + ", b = " + b);
		if (a2 < b2) {
			System.out.println("Наименьший из квадратов - квадрат числа a: " + a2);
		} else if (a2 > b2) {
			System.out.println("Наименьший из квадратов - квадрат числа b: " + b2);
		} else {
			System.out.println("Квадраты обоих чисел равны: " + b2);
		}

	}

}
