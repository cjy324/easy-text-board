package before;

import java.util.Scanner;

//20.10.21
//게시물 개수 구하는 함수를 만들어서 전체 소스코드에 적용[]
//게시물 객체를 미리 만들지 않고, 필요할 때 마다 만들기[]
//게시물 삭제 기능 구현[]
//게시물 수정 기능 구현[]
//게시물 내용 검색 기능 구현[]
//게시물 리스팅 시 최신 등록 순서대로 출력[]
//게시물 등록시 현재 날짜 "yyyy-MM-dd HH:mm:ss" 형식으로 입력 구현[]

public class App {
	Article[] articles = new Article[3];
	int lastArticleId = 0;

	Article getArticle(int id) {
		if (id < 1) {
			return null;
		}

		if (id > lastArticleId) {
			return null;
		}

		return articles[id - 1];
	}

	public void run() {
		for (int i = 0; i < articles.length; i++) {
			articles[i] = new Article();
		}

		Scanner sc = new Scanner(System.in);

		int maxArticlesCount = articles.length;

		while (true) {

			System.out.printf("명령어) ");
			String command = sc.nextLine();

			if (command.equals("system exit")) {
				System.out.println("== 프로그램 종료 ==");
				break;
			} else if (command.equals("article add")) {
				System.out.println("== 게시물 등록 ==");

				if (lastArticleId >= maxArticlesCount) {
					System.out.println("더 이상 생성할 수 없습니다.");
					continue;
				}

				int id = lastArticleId + 1;
				String title;
				String body;

				lastArticleId = id;

				System.out.printf("제목 : ");
				title = sc.nextLine();
				System.out.printf("내용 : ");
				body = sc.nextLine();

				Article article = getArticle(id);

				article.id = id;
				article.title = title;
				article.body = body;

				System.out.printf("%d번 게시물이 생성되었습니다.\n", id);
			} else if (command.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");

				if (lastArticleId == 0) {
					System.out.println("게시물이 존재하지 않습니다.");
					continue;
				}

				System.out.println("번호 / 제목");

				for (int i = 1; i <= lastArticleId; i++) {
					Article article = getArticle(i);

					System.out.printf("%d / %s\n", article.id, article.title);
				}
			} else if (command.startsWith("article detail ")) {
				int inputedId = Integer.parseInt(command.split(" ")[2]);
				System.out.println("== 게시물 상세 ==");

				Article article = getArticle(inputedId);

				if (article == null) {
					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", inputedId);
					continue;
				}

				System.out.printf("번호 : %d\n", article.id);
				System.out.printf("제목 : %s\n", article.title);
				System.out.printf("내용 : %s\n", article.body);
			}
		}

		sc.close();
	}

}