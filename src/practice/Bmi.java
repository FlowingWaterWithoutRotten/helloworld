package practice;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入体重（kg）"+"\n");
		double weight = s.nextDouble();
		System.out.println("输入身高（m）"+"\n");
		double high = s.nextDouble();
		double bmi = weight/(high*high);
		System.out.println("当前得BMI是："+bmi);
	}
}
