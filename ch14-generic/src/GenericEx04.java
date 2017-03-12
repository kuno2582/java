
class StudentInfo {
	public int grade;
	
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class StudentPerson {
	public StudentInfo info;
	
	StudentPerson(StudentInfo info){
		this.info = info;
	}
}

class EmployeeInfo {
	public int position;
	
	EmployeeInfo(int position){
		this.position = position;
	}
}

class EmployeePerson {
	public EmployeeInfo info;
	
	EmployeePerson(EmployeeInfo info){
		this.info = info;
	}
}

public class GenericEx04 {

	public static void main(String[] args) {
		
		StudentInfo si = new StudentInfo(97);
		StudentPerson sp = new StudentPerson(si);
		
		//gradeÃâ·Â
		System.out.println(sp.info.grade);
		
		EmployeeInfo ei = new EmployeeInfo(4);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.position);
		

	}

}
