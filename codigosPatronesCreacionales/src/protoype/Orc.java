package protoype;

public class Orc extends Character {
	
	private static final int LIFE = 20;
	private static final int ATTACK = 700;

	public Orc() {
		super(LIFE, ATTACK);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CloneableCharacter clone() {
		// TODO Auto-generated method stub
		Orc clone = new Orc();
		clone.life_ = this.life_;
		clone.attack_ = this.attack_;
		return clone;
	}
	
	public String toString() {
		return super.toString() + "orc";
	}

}
