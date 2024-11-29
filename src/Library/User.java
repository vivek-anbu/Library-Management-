package Library;

public class User {

	private String username;
	private String emailid;
	private String password;
	public User(String username)
	{
		this.username=username;
	}
	public User(String name,String emailid,String password)
	{	
		this.username=name;
		this.emailid=emailid;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String toString()
	{
		String text="User Name: "+username+'/'+"EmailId :"+'/'+"PassWord: "+password;
		return text;
	}
}
