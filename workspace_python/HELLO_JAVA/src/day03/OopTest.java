package day03;

public class OopTest {

	public static void main(String[] args) {
		Human hum = new Human();
		System.out.println(hum.age);
		System.out.println(hum.skill_lang);
		hum.eatAge();
		hum.momstouch(4);
		System.out.println(hum.age);
		System.out.println(hum.skill_lang);
	}

}
