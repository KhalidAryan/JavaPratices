package JavaBasics;

public class LogicslsFun {

	public static void main(String[] args) {
		System.out.println();

		int age = 20;

		if (age >= 21) {

			System.out.println("we can sell cig");

		} else {
			System.out.println("we can NOT sell cig");

		}

		int grade = 78;
		if (grade >= 90) {
			System.out.println("pass");
		} else if (grade >= 80) {
			System.out.println("fail");
		} else if (grade >= 70) {
			System.out.println("C");
		}

		if (grade >= 95) {
			System.out.println("+A");
		} else if (grade >= 90) {
			System.out.println("-A");

		} else if (grade >= 85) {
			System.out.println("+B");

		} else if (grade >= 80) {
			System.out.println("-B");

		} else if (grade >= 75) {
			System.out.println("+C");

		} else if (grade >= 70) {
			System.out.println("-C");

		} else if (grade >= 65) {
			System.out.println("+D");

		} else if (grade >= 60) {
			System.out.println("-D");

		} else {
			System.out.println("Failed");
		}

	}

}
