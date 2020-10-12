package Test;

public class Test1 {

	public static void main(String[] args) {

		int a = 10;
		
		if(a>=10) {
			System.out.println("참");
			
		}
		
		String command2 = "article add";
		String command3 = "article list";
		
		
		if (command2.equals("article add")) {
			System.out.println("==게시물 등록==");
		}
		if (command3.equals("article list")) {
			System.out.println("==게시물 리스트==");
		}
		
		
		
	}

}