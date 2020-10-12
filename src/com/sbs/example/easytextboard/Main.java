package com.sbs.example.easytextboard; //여기서 폴더명은 모두 소문자로

import java.util.Scanner; //ctrl+shift+O

//빨간줄 발생시 커서 위치시키고 ctrl+1
//ctrl+shift+F 라인 맞추기

public class Main {

	// "main" ctrl+space
	public static void main(String[] args) {
		System.out.println("안녕");

		// System.out 모니터(출력)
		// System.in 키보드(입력)

		System.out.println("### 변수 ###");

		int x; // 미지수 x를 선언
				// int는 정수만 담는 변수(범위: -21억~21억까지)

		x = 5;
		System.out.println(x);
		System.out.println(x + 5);
		System.out.println("x");
		System.out.println("x : " + x);
		System.out.println("x : " + x + x);
		System.out.println("x : " + (x + x));
		System.out.println("x : " + x * x);

		x = 20;
		System.out.println(x);
		System.out.println(x + 5);
		System.out.println("x");
		System.out.println("x : " + x);
		System.out.println("x : " + x + x);
		System.out.println("x : " + (x + x));
		System.out.println("x : " + x * x);

		System.out.println("---------------------------------");
		System.out.println("# String #");

		String command = "article add";

		System.out.println(command);

		System.out.println("---------------------------------");
		System.out.println("# if문 #");

		if (10 == 10) {
			System.out.println("참");
		}

		if (command.equals("article add")) {
			System.out.println("== 게시물 등록==");
		}

		if (command.equals("article list")) {
			System.out.println("== 게시물 리스트==");
		}

		System.out.println("---------------------------------");
		System.out.println("스캐너");

		Scanner scanner = new Scanner(System.in);

//		System.out.println("명령어:"); // ln은 기본적으로 줄바꿈
		System.out.printf("명령어:"); // f를 넣으면 바로 옆으로 출력
		String testCommand = scanner.nextLine();

		if (testCommand.equals("article add")) {
			System.out.println("==게시물 등록==");
		} else if (testCommand.equals("article list")) {
			System.out.println("==게시물 리스트==");
		} else {
			System.out.println("==존재하지 않는 명령어==");
		}

		scanner.close(); // 스캐너가 종료되는 시점
							// 안해도 큰 문제는 없지만 가능하면 작성하는 것이 좋음

		System.out.println("---------------------------------");
		System.out.println("");

		int i = 1;
		System.out.println(i); // 1
		while (i < 4) {
			i++;
		}
		System.out.println(i); // 6
		
		//여길 수정하면???

	}
}
