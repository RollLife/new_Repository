package test;

public class TestPerson {

	public static void main(String[] args) {
		Person Ahn = new Person(); //reference variable
		Ahn.name = "병호";
		Ahn.age = 19;
		
		System.out.println(Ahn.name+"님의 나이는 :"+Ahn.age+"세 이십니다.");
	}

}
