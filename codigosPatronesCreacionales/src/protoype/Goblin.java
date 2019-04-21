package protoype;

public class Goblin extends Character {

	private static final int LIFE = 200;
	private static final int ATTACK = 150;

	public Goblin() {
		super(LIFE, ATTACK);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CloneableCharacter clone() {
		// TODO Auto-generated method stub
		Goblin clone = new Goblin();
		clone.life_ = this.life_;
		clone.attack_ = this.attack_;
		return clone;
	}
	
	public String toString() {
		return super.toString() + "goblin";
	}

}
