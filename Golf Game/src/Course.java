import java.util.ArrayList;

public class Course {
	private String name;
	private int length;
	private int width;
	private int score;
	private int par;

	public Course(String n, int l, int w, int s, int p) {
		name = n;
		length = l;
		width = w;
		score = s;
		par = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPar() {
		return par;
	}

	public void setPar(int par) {
		this.par = par;
	}

	static ArrayList<Course> course = new ArrayList<Course>();

	public static void addCourse() {
		course.add(new Course("Hole 1", 430, 100, 0, 4));
		course.add(new Course("Hole 2", 390, 80, 0, 4));
		course.add(new Course("Hole 3", 115, 40, 0, 3));
		course.add(new Course("Hole 4", 600, 120, 0, 5));
		course.add(new Course("Hole 5", 422, 95, 0, 4));
		course.add(new Course("Hole 6", 440, 110, 0, 4));
		course.add(new Course("Hole 7", 195, 50, 0, 3));
		course.add(new Course("Hole 8", 565, 105, 0, 5));
		course.add(new Course("Hole 9", 370, 60, 0, 4));
	}

}
