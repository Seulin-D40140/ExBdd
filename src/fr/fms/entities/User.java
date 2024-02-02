package fr.fms.entities;

public class User 
{
	int id;
	String loginUser;
	String passwordUser;
	
	
	public User( int id , String loginUser , String passwordUser )
	{
		this.id = id;
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
	}
	public User( String loginUser , String passwordUser)
	{
		this.loginUser = loginUser;
		this.passwordUser = passwordUser;
	}

	public int getIduser() {
		return id;
	}
	public void setIdiser(int id) {
		this.id = id;
	}
	
	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public String toString()
	{
		return "login : "+ getLoginUser() + " Password : " + getPasswordUser();
	}
}
