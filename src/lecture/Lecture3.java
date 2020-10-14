package lecture;

import java.util.Scanner;

public class Lecture3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 1번 게시물 저장소
		int article1__id = 0;
		String article1__title = "";
		String article1__body = "";

		// 2번 게시물 저장소
		int article2__id = 0;
		String article2__title = "";
		String article2__body = "";

		
		int lastArticleId = 0;
		
		
		while (true) {
			System.out.printf("명령어) ");
			String command = scanner.nextLine();

			if (command.startsWith("article detail ")) {
				int inputedId = Integer.parseInt(command.split(" ")[2]);

				System.out.println("== 게시물 상세 ==");

				if (inputedId == 1) {
					if (article1__id == 0) {
						System.out.printf("%d번 게시물은 존재하지 않습니다.\n", inputedId);
						continue;
					}

					System.out.printf("번호 : %s\n", article1__id);
					System.out.printf("제목 : %s\n", article1__title);
					System.out.printf("내용 : %s\n", article1__body);
				} else if (inputedId == 2) {
					if (article2__id == 0) {
						System.out.printf("%d번 게시물은 존재하지 않습니다.\n", inputedId);
						continue;
					}

					System.out.printf("번호 : %s\n", article2__id);
					System.out.printf("제목 : %s\n", article2__title);
					System.out.printf("내용 : %s\n", article2__body);
				} else {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", inputedId);
				}

			}

			else if (command.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");

				if (lastArticleId == 0) {
					System.out.println("게시물이 없습니다.");
					continue;
				}
				System.out.println("번호 / 제목");
				if (lastArticleId >= 1) {
					System.out.printf("%d / %s\n", article1__id, article1__title);
				}
				if (lastArticleId >= 2) {
					System.out.printf("%d / %s\n", article2__id, article2__title);
				}
			} else if (command.equals("article add")) {
				System.out.println("== 게시물 등록 ==");
				int id = lastArticleId + 1;
				String title;
				String body;
				System.out.printf("제목 : ");
				title = scanner.nextLine();
				System.out.printf("내용 : ");
				body = scanner.nextLine();
				if (id == 1) {
					article1__id = id;
					article1__title = title;
					article1__body = body;
				} else if (id == 2) {
					article2__id = id;
					article2__title = title;
					article2__body = body;
				}
				System.out.printf("%d번 게시물이 생성되었습니다.\n", id);

				lastArticleId = id;
			} else if (command.equals("system exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			}

		}
		scanner.close();
	}
}