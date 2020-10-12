package Test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.printf("명령어)");

			String test = scanner.nextLine();

			if (test.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");
			} else if (test.equals("article add")) {
				System.out.println("== 게시물 작성 ==");
			} else if (test.equals("system exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			} else {
				System.out.println("== 존재하지 않는 명령어 ==");
			}
		}
		scanner.close();

	}

}
