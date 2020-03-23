package cn.bean;

public class Film 
{
	private int id;
	private String name;
	private String introduce;
	private String actor;
	private double grade;
	private int filmtypeid;
	public Film() {
		super();
	}
	public Film(int id, String name, String introduce, String actor, double grade, int filmtypeid) {
		super();
		this.id = id;
		this.name = name;
		this.introduce = introduce;
		this.actor = actor;
		this.grade = grade;
		this.filmtypeid = filmtypeid;
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
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getFilmtypeid() {
		return filmtypeid;
	}
	public void setFilmtypeid(int filmtypeid) {
		this.filmtypeid = filmtypeid;
	}
}
