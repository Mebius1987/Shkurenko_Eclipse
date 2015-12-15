package Shkurenko;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Shkurenko {

	public static void main(String[] args) {
		// 1. ��������� ������ S ���������� �� ��������� V ������ � �������
		// (���������� � �������� �������� � ����������). ����������, �������
		// ������� �� ��� � ���� (�����, �����, ������)?
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��������� ������� ������ ��������� � ����������");
		double S = sc.nextDouble();
		System.out.println("������� �������� ��������� �/c");
		double V = sc.nextDouble();
		if (S > 0 && V > 0) {
			double T = S / V;
			double T1 = (int) T; // �����
			double T2 = (T * 100);
			T2 = (int) T2;
			T2 = T2 % 100; // ������
			double T3 = T * 10000;
			T3 = (int) T3;
			T3 = T3 % 100; // �������

			System.out.println("��������� ��� � ���� " + T1 + " �����, " + T2 + " �����, " + T3 + " �������.");

		}
		// 2. ������������ ������ � ���������� ��� ������� �����. ������� ��
		// ����� ����� ����� ������ � ����� �������.
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("������� � ���������� ������ ������� �����");
		double first = sc.nextDouble();
		System.out.println("������� � ���������� ������ ������� �����");
		double second = sc.nextDouble();
		int a = (int) first;
		int b = (int) second;
		System.out.println("����� ����� ������ ������� ����� = " + (a+b) );
		double c = first - a;
		double e = second - b;
		System.out.println("����� ������� ������ ����� = " + (c+e));
		
		// 3. ������������ ������ � ���������� ����� � ������� (������� �����).
		// ������� �� ����������� ���������� ������ � ���������� ������
		// (��������, ������ 45.67 ������ - �������� � ������� 45 ������ 67
		// ������)
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������");
		double gr = sc.nextDouble();
		if ( gr > 0 ){
		double cel = (int )gr;// ������
		double dr = gr * 100;
		dr = (int) dr;
		dr = dr % 100;
		System.out.println("������ " + cel + " ������ " + dr );
		} else {
			System.out.println("����� �� ����� ���� ������������� �����");
		}
		
		// 4. ������������ ������ � ���������� ����� � ������ (������� �����).
		// ������� �� ����������� ���������� ����, ���������, ����� (��������,
		// ������ 126.456789� - �������� � ������� 126� 456�� 789�)
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� � ������");
		double t = sc.nextDouble();
		if (t > 0){
		double tg = (int) t;
		double kgg = (t - tg);
		double g = kgg * 1000000;
		g = g %1000;
		double kg = kgg *1000;		
		System.out.println((int) tg + "� " + (int) kg + "�� " + (int)g + "�");
		} else {
			System.out.println("����� �� ����� ���� �������������");
		}
		
		// 5. ������������ ������ � ���������� ����� � ��������. ��������� ���
		// �������� � ���, ����, ������ � �������. ��������, 43512 ������ � ���
		// 12 �����, 5 ����� � 12 ������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� � ��������");
		int sec = sc.nextInt();
		if (sec > 0){
			int dni = sec /24 / 60 /60;
			int dniv = dni * 24 * 60 * 60 - sec;
			int cas = -dniv /60 /60;
			int casv = ((cas * 60 * 60) + (dni* 24 * 60 * 60)) - sec;
			int min = -casv / 60; 
			int seco = ((dni* 24 * 60 * 60) +(cas * 60 * 60) + (min * 60)) - sec;
			System.out.println(sec + " ������ - ��� " + dni + " ����, " + cas + " �����, " + min + " ����� � " + -seco + " ������.");
		}
		
		// 6. ������������ ������ � ���������� ���������� �� ��������� (�
		// ����������, ����� ���� ������������ ��������) � �����, �� �������
		// ����� ������� (� �������). ��������� �������� (��/�), � ������� �����
		// �����.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� �� ���������");
		double S = sc.nextDouble();
		System.out.println("�� ������� ���� �������");
		double T = sc.nextDouble();
		if (S > 0 && T > 0){
			double V = S/(T/60);
			System.out.println("�������� � ������� ����� ����� ����� = " + V + "��/�");
		}
		
		// 7. ������������ ������ � ���������� ����� ������ � ����� ����������
		// ����������� ��������� (����, ������ � �������). ��������� ���������
		// ���������, ���� ��������� ������ ���������� 15 ������, � ������
		// ����������� �����������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������ ��������� ����");
		int hour = sc.nextInt();
		System.out.println("������� ����� ������ ��������� ������");
		int min = sc.nextInt();
		System.out.println("������� ����� ������ ��������� �������");
		int sec = sc.nextInt();
		System.out.println("������� ����� ���������� ��������� ����");
		int hour1 = sc.nextInt();
		System.out.println("������� ����� ���������� ��������� ������");
		int min1 = sc.nextInt();
		System.out.println("������� ����� ���������� ��������� �������");
		int sec1 = sc.nextInt();
		System.out.println("�������� ������� � " + hour + ":" + min + ":" + sec + ", �������� ���������� � " + hour1 + ":" + min1 + ":" + sec1);
		if (hour < 24 && min < 60 && sec < 60 && hour1 < 24 && min1 < 60 && sec1 < 60 && hour > 0 && min > 0 && sec > 0 && hour1 > 0 && min1 > 0 && sec1 > 0){
			int a = (((hour1 * 60 + min1 * 60)*60) + sec1) - ((((hour * 60) + (min * 60))*60) + sec);
			double b = a * 0.25;
			b = b/100;
			double c = b * 100 % 100; 
			
			System.out.println("������������ �������� " +(int) b + " ���. " +(int) c + " �������.");
		} else {
			System.out.println("������ ������� ��:��:�� � ������ ������������� �����");
		}
		
		// 8. ������������ ������ � ���������� ����� � ��������, ��������� �
		// ������ �������� ���. ���������, ������� ����� ����� ��� ��������
		// ������ �� ������, ���� ������� ���� ���������� 8 �����.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� ������ � ������ �������� ��� � ��������");
		double sec = sc.nextDouble();
		if (sec > 0){
			double rabota = 8 * 60 * 60;// ������� ���� � ��������
			double b = (rabota - sec)/60/60;
			b = (int)b;
			System.out.println("�������� ������ �� ������ " + (int) b );
		} else {
			System.out.println("����� ����� ���� ������ �������������");
		}
		
		// 9. ������������ ������ � ���������� ��������� ������ ��������, ��
		// ���������� � ������� ������. ��������� ����� ����� ������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��������� ������ ��������");
		double sell = sc.nextDouble();
		System.out.println("������� ���������� ���������");
		int kol = sc.nextInt();
		System.out.println("������� % ������");
		double skidka = sc.nextDouble();
		if (sell > 0 && kol > 0 && skidka >0){
			double a = sell * kol; 
			a = a - (a*(skidka/100));
			System.out.println("� ������ " + a + " � ������ ������ = " + skidka);
		}
		
		
		// 10. ������������ ������ � ���������� ������ ������ ������ �
		// ���������� (������������ ��������!) � �������� ��������-���������� �
		// ����� � �������. ����������, �� ����� ����� (����, ������ � �������)
		// ��������� �����.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������ ������");
		double film = sc.nextDouble();
		System.out.println("������� �������� ��������-���������� � ����� � �������");
		int skorost = sc.nextInt();
		if(film > 0 && skorost > 0){
			double filmb = film * 1024*1024*1024;// ���������� ��� � ������
			double ras41 = (filmb /skorost);// ���������� ������ �� ������� ��������� ����� 
			double ras4 =  ras41/60/60;//��������� ���������� �����
			double rasm = (ras41 - ras4);

			
			
			System.out.println("����� �������� " + film + " ������� �������� �� ��������� " + skorost + " ����/� ��������� �� " +(int) ras4 + " ����, " + rasm + " �����");
		}
		
		// 11. ������������ ������ � ���������� ����� ������ � ����������.
		// ���������, ������� �� ��� ���������� ������� �������� 760 �����.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������ � ����������");
		double flesh = sc.nextDouble();
		if (flesh > 0 ){
			flesh = flesh * 1024 / 760;
			System.out.println("�� ������ ����������� " + (int)flesh + " ������� �������� 760 �����");
		}
		System.out.println("������ ��������� ������ ������");
		
		// 12. ������������ ������ � ���������� ������� �����. ��������� ��� ��
		// ���� ������ ����� ������� � ������� �� �����.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� �����");
		double first = sc.nextDouble();
		first = new BigDecimal(first).setScale(2, RoundingMode.UP).doubleValue();
		System.out.println(first);
		
		// 13. ������������� ������ � ���������� ���������� ���������, �������
		// �������� �������, � ���������� ����������. ���������, �������
		// ��������� ���������� ��������� �� ������ ����� ���������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� ��������� ������� �������� �������");
		int sdali = sc.nextInt();
		System.out.println("������� ���������� ��������� ���������");
		int dolg = sc.nextInt();
		if (sdali > 0 && dolg > 0){
			double a = (double) (100* dolg)/(dolg + sdali);
			System.out.println("�������� ���������� " + a + " ��������� �� ������ ����� ���������");
		}
		System.out.println("����� �������� �� ����� ���� �������������");
		
		// 14. ������������ ������ � ���������� ����� � ��������, ��������� �
		// ������ ���. ����������, ������� ������� (�����, ����� � ������)
		// �������� �� ��������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������ � ������ ��� � ��������");
		int sec = sc.nextInt();
		int na4 = 9*60*60;// ������ ��� � 9 ����
		int a = (24*60*60) - (na4 + sec);// ������� ������� �������� �� ��������
		double b = a /60/60;//���
		double min = (a - (b * 60 * 60))/60;//������
		double secf = a - ((b * 60 * 60) + (min * 60));
		System.out.println("������� �������� �� ��������" + (int) b + " ����� " + (int) min + " ����� " + (int) secf + " �������");
		*/
		// 15. ������������ ������ � ���������� ����� ������ ������ �
		// ����������. ���������, ������� ������ ����������� ��� �������� ������
		// �� ������ ��������� (������ ������� ������� ������ 1.44 �����).
		// 16. ������������ ������ � ���������� ����� � �������, ���� ������ �
		// ������� � ���������� ������ �� ���. ���������, ������� ����� ����� �
		// ������������ � ����� �����.
		// 17. ���������� ������� ����������� �����.
		// 18. ����� ���� ����� ����� N ����? ������������� ������������� ����
		// GregorianCalendar.
		//GregorianCalendar g = new GregorianCalendar();
		//System.out.println(g.getTime());
		// 19. � ���� � �������� ������� ��������� ���������� N �����������.
		// ������� �� ��� �������� � ����� ���������� ����� 1 ������ �������, �
		// ���� ��� ���������� ����� 80 �� - �� ������������� ��� 1 ������
		// ������� � ������ ������. ������ ������ ����� ������� 200 ��, �
		// �������� ������ � 0.9 �. �������� ���������, ������� ���������
		// ���������� ������� ������ � ������ �������, ����������� �������
		// ������ ����, ��� ���� �������:
		// �) ���� � ���� 100% ���� ����������� - ����� (��� ������ 80 ��)
		// �) ���� � ���� 60% ���� ����������� - ����� (��� ������ 80 ��)

	}

}
