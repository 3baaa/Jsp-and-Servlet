package member.model;

import java.util.Date;

public class Member {
	
	private String id;
	private String name;
	private String password;
	private Date regDage;
	
	public Member(String id, String name, String password, Date regDage) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.regDage = regDage;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Date getRegDage() {
		return regDage;
	}

	public boolean matchPassword(String pwd) {
		return password.equals(pwd);
	}
	
	
}
