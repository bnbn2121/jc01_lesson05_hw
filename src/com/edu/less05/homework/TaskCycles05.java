package com.edu.less05.homework;

/*
 * С помощью оператора while напишите программу определения
 * суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
 */
public class TaskCycles05 {

	public static void main(String[] args) {
		int number = 1;
		int sum = 0;
		while (number <= 99) {
			sum += number;
			number += 2;
		}
		System.out.println(sum);

	}

}
