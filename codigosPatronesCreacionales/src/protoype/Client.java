package protoype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character[] characters = new Character[3];
		
		characters[0] = new Elf();
		characters[1] = new Orc();
		characters[2] = new Goblin();
		
		for(Character c: characters) {
			System.out.println(c.toString());
		}
		
		Character elf2 = (Character) characters[0].clone();
		System.out.println(elf2.toString());
	}

}
