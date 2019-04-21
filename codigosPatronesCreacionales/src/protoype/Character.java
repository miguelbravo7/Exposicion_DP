package protoype;

public abstract class Character implements CloneableCharacter {
	
	protected int life_;
	protected int attack_;
	
	public Character(int life, int attack) {
		// TODO Auto-generated constructor stub
		this.life_ = life;
		this.attack_ = attack;
	}

	@Override
	public abstract CloneableCharacter clone();
	
	public String toString() {
		return "I'm a ";
	}

}
