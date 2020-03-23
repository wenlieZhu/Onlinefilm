package cn.bean;

public class Area 
{
	private int id;
	private String name;
	private int cityid;
	public Area() {
		super();
	}
	public Area(int id, String name, int cityid) {
		super();
		this.id = id;
		this.name = name;
		this.cityid = cityid;
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
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
}
