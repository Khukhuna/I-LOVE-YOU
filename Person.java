public class DefinitelyNotPerson {

	public static void main(String[] args) {
		Human i = new Human("me");
		Human you = new Human("The wife");

		i.love(you);
	}
}

class Human {
	private String name;

	Human(String name) {
		this.name = name;
	}

	public void love(Human other) {
		System.out.printf("%s! Will you marry me? \n", other.name);
	}
}
