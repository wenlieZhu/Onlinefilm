package cn.bean;

public class VideoHall 
{
	private int id;
	private String name;
	private int seatid;
	public VideoHall() {
		super();
	}
	public VideoHall(int id, String name, int seatid) {
		super();
		this.id = id;
		this.name = name;
		this.seatid = seatid;
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
	public int getSeatid() {
		return seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
}
