package builder1;

import java.util.ArrayList;
import java.util.List;

public class UserBuilder {
	
	private int id;
	private String nick;
	private List<String> tags;
	private User user;
	
	public UserBuilder(int id, String nick) {
		this.id = id;
		this.nick = nick;
		this.user = new User(id,nick);
	}
	
	public UserBuilder() {
		this(0,"");
	}
	
	public UserBuilder id(int id) {
		this.id = id;
		this.user = new User(id,nick);
		this.user.setTags(tags);
		return this;
	}
	
	public UserBuilder nick(String nick) {
		this.nick = nick;
		this.user = new User(id, nick);
		this.user.setTags(tags);
		return this;
	}
	
	public UserBuilder name(String name) {
		this.user.setName(name);
		return this;
	}
	
	public UserBuilder familyName(String familyName) {
		this.user.setFamilyName(familyName);
		return this;
	}
	
	public UserBuilder age(int age) {
		this.user.setAge(age);
		return this;
	}
	
	public UserBuilder phone(int phone) {
		this.user.setPhone(phone);
		return this;
	}
	
	public UserBuilder profession(String profession) {
		this.user.setProfession(profession);
		return this;
	}
	
	public UserBuilder tag(String tag) {
		if(this.tags == null) {
			this.tags = new ArrayList<>();
			this.user.setTags(tags);
		}
		this.tags.add(tag);
		this.user.setTags(tags);
		return this;
	}
	
	public UserBuilder byDefault(String suffix) {
		return this.id(1).nick("uno" + suffix).name("name" + suffix).
				familyName("family" + suffix).tag(suffix + "a").tag(suffix + "b");
	}
	
	public UserBuilder byDefault() {
		return this.byDefault("default");
	}
	
	public User Build() {
		return this.user;
	}

}
