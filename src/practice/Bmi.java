package practice;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�������أ�kg��"+"\n");
		double weight = s.nextDouble();
		System.out.println("������ߣ�m��"+"\n");
		double high = s.nextDouble();
		double bmi = weight/(high*high);
		System.out.println("��ǰ��BMI�ǣ�"+bmi);
	}
}
