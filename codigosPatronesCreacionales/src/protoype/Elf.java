package protoype;

public class Elf extends Character {

	private static final int LIFE = 100;
	private static final int ATTACK = 250;

	public Elf() {
		super(LIFE, ATTACK);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CloneableCharacter clone() {
		// TODO Auto-generated method stub
		Elf clone = new Elf();
		clone.life_ = this.life_;
		clone.attack_ = this.attack_;
		return clone;
	}
	
	public String toString() {
		return super.toString() + "elf";
	}

}
