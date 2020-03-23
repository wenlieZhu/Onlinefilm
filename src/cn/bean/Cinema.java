package cn.bean;

public class Cinema 
{
	private int id;
	private String name;
	private String address;
	private int areaid;
	public Cinema() {
		super();
	}
	public Cinema(int id, String name, String address, int areaid) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.areaid = areaid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
}
