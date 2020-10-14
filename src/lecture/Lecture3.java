package lecture;

import java.util.Scanner;

public class Lecture3 {
	
	public static void main(String[] args) {

		testArticle a0 = new testArticle();
		a0.id = 1;
		a0.title = "제목 1";
		a0.body = "내용 1";
		System.out.printf("id : %d, title : %s, body : %s \n", a0.id, a0.title, a0.body);

		
		testArticle a1 = new testArticle();
		a1.id = 2;
		a1.title = "제목 2";
		a1.body = "내용 2";
		System.out.printf("id : %d, title : %s, body : %s \n", a1.id, a1.title, a1.body);
		
		
		

		testArticle a3;         //a3이라는 하나의 리모컨 객체를 생성하는 것
		a3 = new testArticle(); //a3이라는 리모컨에 기능을 부여하는 것

		//즉, a3이 id, title, body를 모두 담아내는 객체가 되는 것이 아닌(변수에는 오직 하나의 값만 담을 수 있기에..)
		//id, title, body를 원격으로 조종할 수 있는 리모컨 기능을 갖고 있는 객체가 되는 것
		//이런 개념을 레퍼런스 변수라 함
		a3.id = 10;
		a3.title = "제목 1";
		a3.body = "내용 1";
		testArticle a4 = a3;
		a4.id = 20;
		System.out.println(a4.id);
		
		
		
		
		
		
		
		
	}
}
class testArticle{
	public int id;
	public String title;
	public String body;
}