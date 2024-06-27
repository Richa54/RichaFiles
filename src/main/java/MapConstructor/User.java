package MapConstructor;

public class User {
    String id;
    String mail;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String mail) {
		super();
		this.id = id;
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", mail=" + mail + "]";
	}
    
    
}
