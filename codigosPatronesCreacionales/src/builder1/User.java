package builder1;

import java.util.List;

public class User {
	
	private int id_;
	private String nick_;
	private List<String> tags_;
	
	private String name_;
	private String familyName_;
	private int age_;
	private int phone_;
	private String profession_;
	
	public User(int id, String nick) {
		this.id_ = id;
		this.nick_ = nick;
	}
	
	public void setTags(List<String> tags) {
		this.tags_ = tags;
	}
	
	public void setName(String name) {
		this.name_ = name;
	}
	
	public void setAge(int age) {
		this.age_ = age;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName_ = familyName;
	}
	
	public void setPhone(int phone) {
		this.phone_ = phone;
	}
	
	public void setProfession(String profession) {
		this.profession_ = profession;
	}
	
	

}
