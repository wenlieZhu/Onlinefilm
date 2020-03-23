package cn.bean;

public class Screenings 
{
	private int id;
	private String playtime;
	private String language;
	private double price;
	private int filmid;
	private int videoid;
	public Screenings() {
		super();
	}
	public Screenings(int id, String playtime, String language, double price, int filmid, int videoid) {
		super();
		this.id = id;
		this.playtime = playtime;
		this.language = language;
		this.price = price;
		this.filmid = filmid;
		this.videoid = videoid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaytime() {
		return playtime;
	}
	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFilmid() {
		return filmid;
	}
	public void setFilmid(int filmid) {
		this.filmid = filmid;
	}
	public int getVideoid() {
		return videoid;
	}
	public void setVideoid(int videoid) {
		this.videoid = videoid;
	}
}
