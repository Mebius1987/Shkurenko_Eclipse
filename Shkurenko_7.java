package Shkurenko;

import java.util.Scanner;

public class Shkurenko_7 {

	public static void main(String[] args) {
		task8();
	}

	public static void task1() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. �������� �������� 100 ����� ����� � ��������� �� -100 �� 100.
		 * ��������� ������� ������������� �����, ������� ������������� ����� �
		 * ������� �����. ��������� ������� ������ ����� � ������� ��������.
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
				"������� ������������� ����� = " + pol + ", ������� ������������� ����� = " + otr + ", ������� ����� = "
						+ zero + ". ������� ������ ����� = " + chet + ", � ������� �������� = " + (100 - chet));
	}

	public static void task2() {
		// 2. ������� �� ����� ������� ��������� (������� ��������).

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
		 * 3. ����������� ��������� �������� ���������� N ������, � ������� ��
		 * ���������� ��������� ��������� � ���������� M ������ � �����. ����
		 * ��� ���������� ����������� ������� �� 3%. ��������� ��������� �������
		 * ����� �����, ������� ���������� ������������� ��������� � ���������,
		 * ����� ����� ���� ������� ������� ��� (10 �������), ��������� ������
		 * ��� ������ � ���������.
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
		 * 4. �������� �� ������ ������������� �������� MxN, ��������� ��
		 * ��������. ����� ������� �� �� �����, �� ���� ������ ������ ����
		 * ������ (������� ������ �����).
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
		 * 5. �������� �� ������ �������������� ����������� (������������ ������
		 * ������). ����� ������� �� �� �����, �� ���� ������ ������ ���� ������
		 * (������� ������ ������).
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
		 * 6. �������� ���������, ������� ������� �� ����� ���� (�����
		 * ���������� ����� ��������� �� ��������, �� ����� ���� ����� ������
		 * �����). ����� ������� �� �� �����, �� ���� ������ ������ ���� ������
		 * (������� ������ ������).
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
		 * 7. ����������, �������� �� �������� ����� ����� �����������
		 * ����������� (��������, 1234321 � ���������, 12345 � �� ���������).
		 */
		System.out.println("������� �����");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 1;
		int starti = 2;
		int numbera = number;
		while (start < numbera) {
			numbera /= 10;
			start++;
		}
		System.out.println(start);// ���������� ������� ����
		while (number > start) {
			if ((int)(number / Math.pow(10, start - 1)) == (number % 10)) {
				System.out.println("����� " + number + " �������� �����������");
			} else
				System.out.println("����� " + number + " �� �������� �����������");
			number /= 10;
			number = (int) (number % Math.pow(10, start - starti));
			

		}
	}

	public static void task8() {
		/*
		 * 8. ����������� ����������� ����� ����� ��������� ����� �� N ��������
		 * (��������, ��� ������ ����� 12345 ����� �� 3 ������� ��������� �����
		 * 45123).
		 */

	}

	public static void task9() {
		/*
		 * 9. ������� �� ����� ������ ��������������� ������������ AxBxC.
		 */
	}

	public static void task10() {
		/*
		 * 10. �������� ���������, ������� ������� �� ����� ��� ������� ����� �
		 * ��������� �� 2 �� 10.000.000.
		 */
	}

	public static void task11() {
		/*
		 * 11. �������� �� ������ ��� ����� ���������� � ��������� �� 0 ��
		 * 10.000.000.
		 */
	}

	public static void task12() {
		/*
		 * 12. �������� �� ������ ��� ����������� ����� � ��������� �� 0 ��
		 * 10.000.000.
		 */
	}

	public static void task13() {
		/*
		 * 13. �������� �� ������ ��� ����� ��������� � ��������� �� 0 ��
		 * 10.000.000.
		 */
	}

	public static void task14() {
		/*
		 * 14. �������� ���������, ������� ���������� ��������� �� ����� ���,
		 * ��������� � ����������.
		 */
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int a = (14 - 1) / 12;
		int y = year - a;
		int month = 1 + 12 * a - 2;
		String tab = "\t\t\t";
		int sp = (7000 + (1 + y + y / 4 - y / 100 + y / 400 + (31 * month) / 12)) % 7 - a;// 0-poned
		int day = 0;
		for (int m = 1; m <= 12; m++) {// ������� ������
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
		 * /* 15. ������� �������� �� �������� ����������� �����. �����
		 * (��������, for for for 14) � ���������� �������� (��������, 4)
		 * ����������� � ����������.
		 **************
		 **************
		 **************
		 **************
		 */
	}

	public static void task16() {
		/*
		 * 16. �������� �� ������ �������. ���������� �������� (��������, 5)
		 * ��������� ������������.
		 */
	}

	public static void task17() {
		/*
		 * 17. ������������ ��������� � ���������� �������� �����. ��������
		 * ������ � �������� ��������:
		 */
	}

	public static void task18() {
		/*
		 * 18. ���������� ������� ������ for - �����, � ������, ����� � ������.
		 * ������ ������ ����������� � ����������. //*
		 */
	}

	public static void task19() {
		/*
		 * 19. ����� ���� ����� ���! ���������� ������ ���������� ������. �
		 * ���������� �������� ���������� ������, � ������ ������� ����� ������.
		 * ��������, �� �������� 4 �����, ������ ������� ����� � 5 ��������.
		 */
	}

	public static void task20() {
		/*
		 * 20. ������������ ������ ���� (�� ����������� ����, �����, ���).
		 * ���������� ���� ������, ��������������� ��������� ����. ��� ���������
		 * ��������� ������� �������� �� ����, ��� 01.01.01 � ��� �����������.
		 * ����� ����������
		 */
	}

	public static void task21() {
		/*
		 * 21. � ������������ ����� ��������� ������������ ����� 13, � �
		 * ��������� � 4. ����� ����������� �������� � ������������ � ���������
		 * ������, ���� ���������� ����� ����� ��������� ������ ������ �������,
		 * ���������� ����� 4 ��� 13 (��������, 40123, 13373, 12345 ��� 61342),
		 * ����� �� ������� ����������� ������. �������� ���������, �������
		 * ���������, ������� ������� �������� ���������, ���� � ������������
		 * ����� ������� 100 ���. ������ ������ ������� � ������ ������ ������
		 * ����� ����� �� 00001 �� 99999. ������������� ������� �� ����� ���
		 * ������, ������� ���������� ���������.
		 *
		 * boolean success; int copy; for (int i = 1; i < 100000; i++) { copy =
		 * i; success = true;// vse cifri podxod9t' while (copy > 0) { if (copy
		 * % 10 == 4) { success = false; break; } copy /= 10; } if (success) {
		 * System.out.printf("%05d\n", i); }
		 */

	}

	public static void task22() {
		/*
		 * 22. �������� ���������, ������� ����� ��������� � ������� ����� �����
		 * (�� 0 �� 99999999) � �������� ��� � ����� ���� (��. ������� ����):
		 * �������������: �������� ���, ����� "������� �����" �������� �� ��
		 * ��������, � �� ��������������� ��������� (�������) ����.��������
		 * �������
		 */
	}
}