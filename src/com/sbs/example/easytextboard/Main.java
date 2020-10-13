package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lastArticleId = 0;

		while (true) {
			System.out.printf("명령어:");
			String command = scanner.nextLine();

			if (command.equals("article add")) {
				System.out.println("=== 게시물 등록 ===");
				// int lastArticleId = 0; 반복문 바깥 영역으로 이동

				int id = lastArticleId + 1;

				System.out.printf("제목 입력 :");
				String title = scanner.nextLine();

				System.out.printf("내용 입력 :");
				String body = scanner.nextLine();

				lastArticleId = id;

				System.out.println("=== 생성된 게시물 정보 ===");
				System.out.println("번호 : " + id);
				System.out.println("제목 : " + title);
				System.out.println("내용 : " + body);

			}
		}

	}
}
