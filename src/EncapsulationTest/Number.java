package EncapsulationTest;

public class Number {

	private int y;
	private String stdName; // private field.
    private int stdRollNo;
    private int stdId;
	
	public int getY() {
		return y;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public void setY(int y) {
		this.y = y;
	}


}
