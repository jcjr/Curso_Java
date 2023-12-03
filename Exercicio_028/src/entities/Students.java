package entities;

public class Students {
	public String name;
	public double note1, note2, note3;
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public String missingPoints() {
		if(finalGrade() >= 60.0) {
			return "Pass\n";
		} else {
			return "Failed\n" + "Missing " + String.format("%.2f", 60.0 - finalGrade()) + 
					" Points";
		}
	}
}
