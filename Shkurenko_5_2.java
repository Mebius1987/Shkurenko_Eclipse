package Shkurenko;

import java.util.Scanner;

public class Shkurenko_5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ����������, ����������� �� ����������� ������ ����� ��� �������,
		// ���� ��� �������. ������ ������� ����� �������.
		System.out.println("������� ������ ���������� ����� ");
		double x = sc.nextDouble();
		System.out.println("������� ������ ���������� ����� ");
		double y = sc.nextDouble();
		System.out.println("������� ������ ���������� ����� ����� ������");
		double x1 = sc.nextDouble();
		System.out.println("������� ������ ���������� ����� ����� ������");
		double y1 = sc.nextDouble();
		if (x == x1 ){
			System.out.println("�������� ����� ��� �������");
		} else if (y == y1) {
		System.out.println("�������� ����� ��� �������");
		} else
			System.err.println("�� �������� ����� ��� ������� � ����� ��� �������");
		// 2. ���������, ����� �� �������� ����� ������������ �����. ��������,
		// ����� 3.14 � 2.5 � ����� ������������ �����, � ����� 5 � 10.0 � ���.
		// 3. �������� ���������, ������� ���������� ������������ ������ �����
		// ��� ������, � � ����� ���������� �������� ����� ��� (��������, 6 �
		// ��� �������). ������ � �������������� if � switch.
		// 4. ������� � ���������� ������� ����� (���������� �����, �����,
		// ������). ��������� ������������ �������� ��������.
		// 5. ������ � ���������� ������������ ����� �����������
		// (��������������) ������, � ���������� �������� �� �� ����������
		// (��������� ����� ��� ������ � ��� ��������� ���� ������).
		// 6. ������� � ���������� ��� � ������� ��������. ����������, ���� ��
		// ��� �� ������.
		// 7. �������� ����� (���� � ������) � ��������� ������� �����������,
		// ��������������� ��������� ������� (��������, ����� 15 ����� 6 �����
		// � ��������� ����������� ������� �����).
		// 8. ��������� �������� ���������� ���� � �����. ������ ���� � ���,
		// ������� ��������� � ���, ������� ����� �� ������� ��� ��������
		// (��������� ��� = ���� - 110).
		// 9. ������ ����� ���� (����, ����� � ��� �������� �� �����������).
		// ��������� ������������ �������� ��������. ������� ���� ����������
		// ��� (������������ ����������� ���������� ������ Java �����
		// GregorianCalendar ���������!)
		// 10. �������� ���������, ������� ���������� ������������ �������
		// �������� �� ������ (1 � �����, 2 � ������ � ��.), � � �����
		// ����������, ����� ����� ����� ��������� ��������. � ������ ������
		// ���� ���� �� 10 ��������.
		// 11. �������� ���� "�, �����������!". �� ������ �� ������� ����������
		// �������, � �������� �������. ������������ ����� - ���� ��������.
		// ���������� ����� � ��������� � ���������� �������. ���� ��� ������
		// ���������� � � ����� ��������� ��������� � ������. �� ������� �����
		// ����������� ����������� �����, ���������, ������ � �������, ��������
		// ������� � ��.
		// 12. ������������ ������ � ���������� ���������� �������� �� �������,
		// ������� ������������� �������������� ����������� �� �����. ���������
		// ��������, ����� ������ ��� �������, ����� ��� �����, � �����
		// ���������� ������� ������ �� ������, � ��������� �������� �����,
		// ��������� ������� � ����������� ���� � ׸���� ����.
		// 13. ����������� ��������� ���������������. ������������ ������
		// ������. ��������� ����� ��������� ����� �� ������ �������
		// ��������������� ������� (5 �������������, 5 �������������, 10
		// ����������� ���������).
		// 14. ����������� ���������-�������. ��������� ���������� 5
		// (���������������) ����� � ��������� �� 1 �� 42, �� �� ���������� ��
		// �� �����. ������������ �������� �� ������� � ������ �����-�� 5 �����
		// � ����������. ��������� ����� �� ����������. ��������, ����
		// ������������ ������ ��� ����� - ���� 300 ������, ���� 4 - 4000
		// ������, ���� 5 � 50000 ������. � � �����, ������ ����������� ����,
		// ��� ������������ ������� ��� 5 �����?
		// 15. ������������ ��������� ���� ������ �������� (����� � �����).
		// ��������� ���������� ���� ������� ������������ � ���������� ��� ����
		// �������� �� ��������� ������.
		// 16. ������ ����� N ����� �� M ������ �� ���� ������. ������ ������
		// ���� �� X ��� � ������. ������ ����� ������� ���� ������ � ����
		// ��������� ����, ������� ����� ������. �� ������� ���� �������� ����,
		// ���� ��������� ���� �� Z ������ �� ������� (� ������ ���, �� ���
		// ����� ����� � ��)? ������ ����� �����, ���������� ������� �
		// ���������, � ����� ��������� ����� � ������ ���� ����� ����������.
		// 17. ����������� ������� ��������� ���������� ������ (�������
		// �������). � ������ ���� ������������ ������� ������ �� 5000 ������.
		// ��������� ������� �� ������������ �������� ��� �������� �� 0 �� 7.
		// �������� ����������: 0 0 0, 1 1 1, 2 2 2, 3 3 3, 4 4 4, 5 � �, 5 5 �,
		// 5 5 5, 7 � �, 7 7 �, 7 7 7 (�� ����� � ����� ���� ����� �����).
		// �������� ����������: 6 6 6. ��� ��������� ���������� �����������. �
		// ����� ������, �� ����� ����� ���������� � �������� ����� ������������
		// ��������� ����������� ������������� ����� �����. ����������
		// ��������� ��������� �������������� �� ��������� �������� ����������.
		// ���������� ����� ���������� ����� JOptionPane.showMessageDialog,
		// ��������. ��������� ������ ����������. ���� ������������� ����������,
		// ���� ������ �����������. ���� ������������� �������, ���� ��������
		// ����-��� (7 7 7).

	}

}
