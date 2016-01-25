package Shkurenko;

import java.util.Scanner;

public class Shkurenko_7 {

	public static void main(String[] args) {
		task8();
	}

	public static void task1() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
		 * Вычислить процент положительных чисел, процент отрицательных чисел и
		 * процент нулей. Вычислить процент чётных чисел и процент нечётных.
		 */
		int pol = 0;
		int otr = 0;
		int zero = 0;
		int chet = 0;
		for (int str = 0; str < 100; str++) {
			int a = (int) (Math.random() * 200) - 100;
			if (a % 2 == 0)
				chet++;
			if (a > 0) {
				pol++;
			} else if (a < 0) {
				otr++;
			} else if (a == 0) {
				zero++;
			}
		}
		System.out.println(
				"процент положительных чисел = " + pol + ", процент отрицательных чисел = " + otr + ", процент нулей = "
						+ zero + ". процент чётных чисел = " + chet + ", а процент нечётных = " + (100 - chet));
	}

	public static void task2() {
		// 2. Вывести на экран таблицу умножения (таблицу Пифагора).

		for (int str = 1; str <= 10; str++) {
			for (int stl = 1; stl <= 10; stl++) {
				System.out.printf("%4d", str * stl);

			}
			System.out.println("\n");
			if (str == 1) {
				System.out.println("   -------------------------------------");
			}
		}
	}

	public static void task3() {

		/*
		 * 3. Ежемесячная стипендия студента составляет N гривен, а расходы на
		 * проживание превышают стипендию и составляют M гривен в месяц. Рост
		 * цен ежемесячно увеличивает расходы на 3%. Составьте программу расчёта
		 * суммы денег, которую необходимо единовременно попросить у родителей,
		 * чтобы можно было прожить учебный год (10 месяцев), используя только
		 * эти деньги и стипендию.
		 */

		double total = 0;
		double N = 800;
		double M = N + 6000;
		double P = 3;// 3%

		for (int month = 0; month < 10; month++) {
			System.out.printf("for %d month we need %.2f grn\n", month + 1, M);
			total += M;
			M *= 1 + P / 100;
		}
		System.out.printf("vsego = %.2f", total - (N * 10));
	}

	public static void task4() {

		/*
		 * 4. Показать на экране прямоугольник размером MxN, состоящий из
		 * звёздочек. Затем сделать то же самое, но чтоб фигура внутри была
		 * пустая (остаётся только рамка).
		 */

		int m = 10;
		int n = 10;
		for (int y = 0; y < m; y++) {
			for (int x = 0; x < n; x++) {
				if (y == m + 1) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void task5() {
		/*
		 * 5. Показать на экране равнобедренный треугольник (пользователь вводит
		 * высоту). Затем сделать то же самое, но чтоб фигура внутри была пустая
		 * (остаётся только контур).
		 */
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = h * 2 - 1;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < a; x++) {
				if (y == h - 1 || x + y == h - 1 || x - y == h - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void task6() {
		/*
		 * 6. Написать программу, которая выводят на экран ромб (длины
		 * диагоналей ромба одинаковы по значению, но могут быть равны любому
		 * числу). Затем сделать то же самое, но чтоб фигура внутри была пустая
		 * (остаётся только контур).
		 */
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = h * 2 - 1;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < a; x++) {
				if (y == h - 1 || x + y == h - 1 || x - y == h - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void task7() {
		/*
		 * 7. Определить, является ли введённое число любой разрядности
		 * палиндромом (например, 1234321 – палиндром, 12345 – не палиндром).
		 */
		System.out.println("Введите число");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 1;
		int starti = 2;
		int numbera = number;
		while (start < numbera) {
			numbera /= 10;
			start++;
		}
		System.out.println(start);// определили сколько цифр
		while (number > start) {
			if ((int)(number / Math.pow(10, start - 1)) == (number % 10)) {
				System.out.println("Число " + number + " является палиндромом");
			} else
				System.out.println("Число " + number + " не является палиндромом");
			number /= 10;
			number = (int) (number % Math.pow(10, start - starti));
			

		}
	}

	public static void task8() {
		/*
		 * 8. Осуществить циклический сдвиг влево введённого числа на N разрядов
		 * (например, при сдвиге числа 12345 влево на 3 разряда получится число
		 * 45123).
		 */

	}

	public static void task9() {
		/*
		 * 9. Вывести на экран каркас параллелепипеда размерностью AxBxC.
		 */
	}

	public static void task10() {
		/*
		 * 10. Написать программу, которая выводит на экран все простые числа в
		 * диапазоне от 2 до 10.000.000.
		 */
	}

	public static void task11() {
		/*
		 * 11. Показать на экране все числа Армстронга в диапазоне от 0 до
		 * 10.000.000.
		 */
	}

	public static void task12() {
		/*
		 * 12. Показать на экране все совершенные числа в диапазоне от 0 до
		 * 10.000.000.
		 */
	}

	public static void task13() {
		/*
		 * 13. Показать на экране все числа Фибоначчи в диапазоне от 0 до
		 * 10.000.000.
		 */
	}

	public static void task14() {
		/*
		 * 14. Написать программу, которая генерирует календарь на любой год,
		 * указанный с клавиатуры.
		 */
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int a = (14 - 1) / 12;
		int y = year - a;
		int month = 1 + 12 * a - 2;
		String tab = "\t\t\t";
		int sp = (7000 + (1 + y + y / 4 - y / 100 + y / 400 + (31 * month) / 12)) % 7 - a;// 0-poned
		int day = 0;
		for (int m = 1; m <= 12; m++) {// перебор месяца
			System.out.println("\n");
			System.out.print(tab);

			switch (m) {
			case 1:
				System.out.print("Janvar'");
				day = 31;
				break;
			case 2:
				System.out.print("Fevral'");
				day = 29;
				break;
			case 3:
				System.out.print("Mart");
				day = 31;
				break;
			case 4:
				System.out.print("Aprel'");
				day = 30;
				break;
			case 5:
				System.out.print("Mai");
				day = 31;
				break;
			case 6:
				System.out.print("Iun'");
				day = 30;
				break;
			case 7:
				System.out.print("Iul'");
				day = 31;
				break;
			case 8:
				System.out.print("Avgust");
				day = 31;
				break;
			case 9:
				System.out.print("Sent9br'");
				day = 30;
				break;
			case 10:
				System.out.print("Okt9br'");
				day = 31;
				break;
			case 11:
				System.out.print("No9br'");
				day = 30;
				break;
			case 12:
				System.out.print("Dekabr'");
				day = 31;
				break;
			}
			System.out.println(" " + year + "\n");
			System.out.println(tab + "  Mo  Tu  We  Th  Fr  Sa  Su\n");
			System.out.print(tab);
			for (int t = 0; t < sp; t++) {
				System.out.print("    ");
			}
			for (int d = 1; d <= day; d++) {
				System.out.printf("%4d", d);
				sp++;// perexod nasledyuwii den' nedeli
				if (sp == 7) {
					System.out.println();
					System.out.print(tab);
					sp = 0;
				}
			}
		}
		// 4erez slip delaem krasnim syboty i voskerenie

	}

	public static void task15() {
		/*
		 * /* 15. Вывести лестницу из отрезков определённой длины. Длина
		 * (например, for for for 14) и количество ступенек (например, 4)
		 * указывается с клавиатуры.
		 **************
		 **************
		 **************
		 **************
		 */
	}

	public static void task16() {
		/*
		 * 16. Показать на экране лесенку. Количество ступенек (например, 5)
		 * указывает пользователь.
		 */
	}

	public static void task17() {
		/*
		 * 17. Пользователь указывает с клавиатуры нечётное число. Рисуется
		 * фигура с заданной стороной:
		 */
	}

	public static void task18() {
		/*
		 * 18. Нарисовать двойным циклом for - домик, с крышей, окном и трубой.
		 * Высота домика указывается с клавиатуры. //*
		 */
	}

	public static void task19() {
		/*
		 * 19. Скоро ведь Новый год! Необходимо срочно нарисовать ёлочку. С
		 * клавиатуры вводится количество ярусов, и высота каждого яруса ёлочки.
		 * Например, на картинке 4 яруса, высота каждого яруса – 5 символов.
		 */
	}

	public static void task20() {
		/*
		 * 20. Пользователь вводит дату (по отдельности день, месяц, год).
		 * Определить день недели, соответствующий введенной дате. При написании
		 * программы следует исходить из того, что 01.01.01 – это понедельник.
		 * можно анкалендер
		 */
	}

	public static void task21() {
		/*
		 * 21. В американской армии считается несчастливым число 13, а в
		 * китайской — 4. Перед совместными учениями с американской и китайской
		 * армией, штаб украинской армии решил исключить номера боевой техники,
		 * содержащие числа 4 или 13 (например, 40123, 13373, 12345 или 61342),
		 * чтобы не смущать иностранных коллег. Написать программу, которая
		 * определит, сколько номеров придется исключить, если в распоряжении
		 * армии имеется 100 тыс. единиц боевой техники и каждая боевая машина
		 * имеет номер от 00001 до 99999. Дополнительно вывести на экран все
		 * номера, которые необходимо исключить.
		 *
		 * boolean success; int copy; for (int i = 1; i < 100000; i++) { copy =
		 * i; success = true;// vse cifri podxod9t' while (copy > 0) { if (copy
		 * % 10 == 4) { success = false; break; } copy /= 10; } if (success) {
		 * System.out.printf("%05d\n", i); }
		 */

	}

	public static void task22() {
		/*
		 * 22. Напишите программу, которая будет считывать с консоли любое число
		 * (от 0 до 99999999) и выводить его в таком виде (см. рисунок ниже):
		 * Дополнительно: сделайте так, чтобы "большая цифра" состояла не из
		 * звёздочек, а из соответствующих маленьких (обычных) цифр.делается
		 * масивом
		 */
	}
}