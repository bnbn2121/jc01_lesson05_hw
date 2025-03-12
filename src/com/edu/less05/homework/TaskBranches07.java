package com.edu.less05.homework;

/*
 * Составить программу нахождения модуля выражения
 * a*x*x + b*x + c при заданных значениях a, b, c и х
 */
public class TaskBranches07 {

	public static void main(String[] args) {
		int a = -5;
		int b = 6;
		int c = 3;
		int x = 2;
		int calc = a * x * x + b * x + c;
		int modulCalc;

		if (calc < 0) {
			modulCalc = -calc;
		} else {
			modulCalc = calc;
		}
		System.out.println("|" + calc + "| = " + modulCalc);
	}

}
