package Shkurenko;

import java.util.Scanner;

public class Shkurebko_6 {

	public static void main(String[] args) {
		
		//1.	������� �� ����� �������������� ����� �� ��������. ����� �������� ��������� ������������. 
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� ���������");
		int a = sc.nextInt();
		for (int x = 0; x < a; x++) {
			System.out.print("*");
			} 
		//2.	�������� ���������, ��������� �� ����� ������ ������ ����� ����� �� ��������� �� 1 �� 100.
		
		for (int x = 1; x <= 100; x++)
			if (x % 2 == 0){
			System.out.println(x);
			}
			
		//3.	��������� ����� ����� � ��������� �� M �� N. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� M");
		int M = sc.nextInt();
		System.out.println("������� ����� N");
		int N = sc.nextInt();
		while (M <= N){
			int a = M + N;
					System.out.println(a);
			M++;
		}
		
		//4.	��������� �������� ������� ������������ ���������� �� ������� � ����������  � ��������� ���������.
		
		int C1 = -1;// ������ ���������
		int C2 = 110;// �����
		while (C1 < C2){
			int F = C1 + 32;
			System.out.println("����������� �� ������� = " + C1 + ",  � ����������� �� ���������� = " + F);
			C1++;
			
		}
		
		//5.	�������� ���������, ����������� ��������� ��������� �����.
		
		System.out.println("������� ����� ��������� �������� ��������� ���������");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int y=1;
	    for (int i = 1; i <= number; i++){
	        y=y*i;
	    }
	    System.out.print(number + " != " + y);

			
		
		//6.	� ���������� �������� ����� ����� ����� �����������. ���������� ���������� ���� � �� � �� �����. 
		
		System.out.println("������� �����");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 1;
		while (start < number){
			number /= 10;	
			start++;
		}
		System.out.println(start);
		
		//7.	� ���������� �������� ����� ����� ����� �����������. ���������� ����������� ��� �����, 
		// �.�.  ����� ������ ������������� � �������� ������� (��������, ������ ����� 1234 � � ���������� ����� 4321).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �����");
		int number = sc.nextInt();
		int a= 0;
		while (number > 0){
		a = number % 10;
		number /=10;
		System.out.print(a);
		}
		//8.	� ���������� �������� ����� �����. ������� �� ����� ��� �����, �� ������� �������� ����� ������� ��� �������. ��������, ��� 60 ������ ������� ������ 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 1;
		while (start <= number){
			//System.out.println(number + "%" +  start + "=" + number % start);
			start++;
			if (number % start == 0){
				System.out.println(start);
		}
		}
		//9.	� ���������� �������� ����� �����. ����������, �������� �� ��� �������. ������� ����� ������� ��� ������� 
		//������ �� 1 � ���� �� ����.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int start = 2;
		boolean isSimple = true; //������� ��� ��������� 0
		while(start < number){
			
			if (number % start == 0){
				isSimple = false;
				break;

			}
			start++;
		}
			System.out.println(isSimple);
		
		//10.	���������, ���� �� �� �������� ����� ���������� ����� ������.
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number > 10){
		if (number % 10 == number /10 %10){
			System.out.println("�����������");
			break;
		} 
			number /=10;
		}
		if (number <=10){
			System.out.println("�� �����������");
		}
		//11.	������ � ���������� �����. ���������, ��� ��� ����� ����� ����� ����������� � ����������� �������
		//      (��������, ����� 11299 ������������� �������, � ����� 22044 ���).
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number > 0){
		if (number % 10 <= number /10 % 10 ){
		System.out.println("����������� � ��������� �������");
		return;
		}
		number /= 10;
		}
		System.out.println("�� ��");
		//12.	�������� ���� ������� �����. ������������ �������� ���������� ����� �� 0 �� 1000, ��������� ���������� ��� �� ����������� ���������� �������.
		
		int min = 1;
		int max = 1000;
		System.out.println("��������� ����� �� " + min + " �� " + max);
		int L = min;
		int R = max;
		int M ;
		Scanner sc = new Scanner(System.in);
		int choice;//����� 1, 2, 3
		int n = 0;
		while (L <= R){
			M = (L + R) / 2;
			n++;
			System.out.println("����� ���� ��� " + M + " ?");
			System.out.println("����� 1 - ���� ����� ������� \n 2 - ���� ���� ����� ������ " + M + "\n 3 - ���� ���� ����� ������ " + M);
			choice = sc.nextInt();
			if(choice < 1 || choice >3){
				System.out.println("������");
				break;
			}
			switch(choice){
			case 1 :
				System.out.println("����� ������� �� " + n + " �������!");
				return;
			case 2 :
				R = M - 1;
				break;
			case 3 :
				L = M + 1;
				break;
				
			}
		}
		System.out.println("�� ��������");
		
		//13.	�������� ������ � ����� ���������� ���� ���������� ���������� ������� � ������������� ��������.
		int start = 111111;
		int over = 999999;
		while (start <= over){
			if(((start%10) + (start /10 %10) + (start / 100 %10)) == ((start /1000 % 10) + (start / 10000 % 10) + (start / 100000))){
				System.out.println(start);
			}
			start++;
		}
		
		//14.	�������� �� ����� ��� ������������� �����, ����� � ������� �� �����������. ��� ����� ������ �������� �� 12345 ��� �������. �������� ����� ���������� ��������� �����.
		int start = 0;
		int del = 12345;
		int min = 10000000;
		int max = 99999999;
		while (min % del !=0)min++;
		int a, b, c ,d ,e ,f ,g, h;
		while (min <= max){
			h = min % 10;
			g = min /10 % 10;
			f = min / 100 % 10;
			e = min / 1000 % 10;
			d = min / 10000 % 10;
			c = min / 100000 % 10;
			b = min / 1000000 % 10;
			a = min / 10000000 % 10;
			if (!(a == b || a == c || a == d || a == e || a == f || a == g || a == h || b == c || b == d || b == e || b == f || b == g || b == h || c == d || c == e || c == f || c == g || c == h || d == e || d == f || d == g || d == h || e == f || e == g || e == h || f == g || f == h || g == h)){
				System.out.println(min);
				
			}
			
			start++;
			min +=del;
		}
		System.out.println("Naideno chisel = " + start);
		
		*/
		//15.	�������� ���������, ����������� ���������� ����� ����� �� ���������� ������� ��������� � 2, 8 � 16-������ �������.
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����");
		int nomer = sc.nextInt();
		System.out.println("�������� ������� ��������� \n��� 2 ������� 1\n��� 8 ������� 2\n��� 16 ������� 3");
		int sist = sc.nextInt();
		if (sist == 1){
		int dvoic = 0;
		String temp = "";
		while(nomer != 0){
			dvoic = nomer % 2;
			temp = dvoic + temp;
			nomer /= 2;
		}System.out.print(temp);
		} else if (sist == 2){
			int vosm = 0;
			String temp = "";
			while(nomer != 0){
				vosm = nomer % 8;
				temp = vosm + temp;
				nomer /= 8;
			}System.out.print(temp);
		} else if (sist == 3){
			int shest = 0;
			String temp = "";
			String temp2 = "";
			while(nomer != 0){
				shest = nomer % 16;
				switch (shest){
				case 11: 
					temp2 = "A";
					temp = temp2 + temp;
				break;
				case 12: 
					temp2 = "B";
					temp = temp2 + temp;
				break;
				case 13: 
					temp2 = "C";
					temp = temp2 + temp;
				break;
				case 14: 
					temp2 = "D";
					temp = temp2 + temp;
				break;
				case 15: 
					temp2 = "E";
					temp = temp2 + temp;
				break;
				case 16: 
					temp2 = "F";
					temp = temp2 + temp;
				break;
				}
				temp = shest + temp;
				nomer /= 16;
			}System.out.print(temp);
			
			}
		//16.	����������� ������� ��������� ���������� ������ (������� �������). � ������ ���� ������������ ������� 5000 ��������. ��������� ������� �� ������������ �������� ��� �������� �� 0 �� 7. �������� ����������: 0 0 0, 1 1 1, 2 2 2, 3 3 3, 4 4 4, 5 � �, 5 5 �, 5 5 5, 7 � �, 7 7 �, 7 7 7 (�� ����� � ����� ���� ����� �����). �������� ����������: 6 6 6. ��� ��������� ���������� �����������. � ����� ������, �� ����� ����� ���������� � �������� ����� ������������ ��������� ����������� ������������� ����� �����. ���������� ��������� ��������� �������������� �� ��������� �������� ����������. ���������� ����� ���������� ����� JOptionPane.showMessageDialog, ��������. ��������� ������ ����������. ���� ������������� ����������, ���� ������ �����������. ���� ������������� �������, ���� �������� ����-��� (7 7 7).
		/*
		int bet = 20;
		int score = 500;
		String temp = sc.next();
		while(score >= bet){
		int a = (int)(Math.random()*7)+1;
		int b = (int)(Math.random()*7)+1;
		int c =	(int)(Math.random()*7)+1;
		
		System.out.println(a + " "  + b + " " + c);
		for (int i = 1;  i <= 7; i++)
		if (a == b && a == c && a == i){
			System.out.println("win");
			score+=10;
		}
		//17.	������ ����� ����� �������, �� �������� ��� ����� � ����������.  ����� ������� ���������, ������� ������� ���������� ����������� ���������� ����������, ������� ����������, ����� ����� �������. ������ ����� �������� � ����� ������� � ������ ��������� �������� � ����������. ������, �����, ������, �������� � �.�. �� ���������. ��������� ������� ���� ������� (����� ��������� ���� � ��� ����� ���� ���� ����� ����������). ���� ����� ������� ��������� �������� ����� �������� ��������� (��������, � ��������� �� 10, � ����� ������� - 15),  �� �������� ��������, � ���������� ���� ��������� �� ���������� � ����� ����������. ��������, ����� ������� 500, ����� 55, ����� ������ ��������� 10, ����� 10, � ���������� ���������� - 20. ��� ��� ��� ������� ������� ������ ��������� ���:
		//�	��������� ������� (���� 200) � � ������� �������� 300 ����� ��������.
		//�	������ ������� (���� 55) � �������� 15 ����������, ���� �� ������� ����� (�������� 5 ����� ��������).
		//�	��������� ������� (���� 150) � � ������� �������� 150 ����� ��������.
		//�	������ ������� (���� 55) � �������� 9 ����������.
		//�	��������� ������� (���� 90) � � ������� �������� 60 ����� ��������.
		//�	������ ������� (���� 55) � �������� 4 ���������, ���� �� ������� ����� (�������� 5 ������).
		//�	��������� ������� (���� 40) � � ������� �������� 20 ����� ��������.
		//�	������ �������  � ���������.
			*/
	}
}



	


