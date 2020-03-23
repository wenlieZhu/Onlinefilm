package cn.bean;

public class Orders 
{
	private int id;
	private String username;
	private String paytime;
	private int uid;
	private int sid;
	public Orders() {
		super();
	}
	public Orders(int id, String username, String paytime, int uid, int sid) {
		super();
		this.id = id;
		this.username = username;
		this.paytime = paytime;
		this.uid = uid;
		this.sid = sid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPaytime() {
		return paytime;
	}
	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
}
