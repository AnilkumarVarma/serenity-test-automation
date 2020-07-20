package serenityTest.model;

public class Member {
	 int point;
	String grade;

	public Member(int points) {
		this.point=points;
		this.grade="Bronze";
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}



	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static Member withInitialPoints(int points) {
		// TODO Auto-generated method stub
		return new Member(points);
	}

}
