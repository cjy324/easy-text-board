package practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// 1번 게시물 저장 틀
		int article1_id = 0;
		String article1_title = "";
		String article1_body = "";

		// 2번 게시물 저장 틀
		int article2_id = 0;
		String article2_title = "";
		String article2_body = "";

		int lastArticleId = 0;

		while (true) {
			System.out.printf("명령어) ");
			String command = scanner.nextLine();
			
				if (command.equals("article list")) {
					if (lastArticleId == 0) {
						System.out.println("게시물이 없습니다.");
						continue;
					}
					System.out.println("번호 / 제목");

					if (lastArticleId >= 1) {
						System.out.printf("%d / %s\n", article1_id, article1_title);

					}
					if (lastArticleId >= 2) {
						System.out.printf("%d / %s\n", article2_id, article2_title);

					}
				}
			if (command.equals("article add")) {
				System.out.println("== 새로운 게시물 등록 ==");

				int id = lastArticleId + 1;
				String title;
				String body;

				System.out.printf("제목 입력 : ");
				title = scanner.nextLine();
				System.out.printf("내용 입력 : ");
				body = scanner.nextLine();
				lastArticleId = id;

				System.out.println("                                 ");
				System.out.println(id + "번 게시물이 생성되었습니다.");
				System.out.println("                                 ");
				System.out.println("= 생성된 게시물 정보 =");
				System.out.printf("번호 : %d\n", id);
				System.out.printf("제목 : %s\n", title);
				System.out.printf("내용 : %s\n", body);
				if (id == 1) {
					article1_id = id;
					article1_title = title;
					article1_body = body;
				} else if (id == 2) {
					article2_id = id;
					article2_title = title;
					article2_body = body;
				}

			} 

			
			/*
			 * else if (command.equals("article list")) {
			 * System.out.println("== 게시물 리스트 =="); System.out.println("번호 / 제목 ");
			 * System.out.println(id + " / " + title);
			 * 
			 * }
			 */
			else if (command.equals("exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			}
		}

	scanner.close();
}
}
