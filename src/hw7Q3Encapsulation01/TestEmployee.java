package hw7Q3Encapsulation01;


public class TestEmployee {

	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setEmpName("Aberah");
		employee.setAge(29.467);
		employee.setSex('F');
		employee.setUsCitizen(false);
		
	
		System.out.println("Name:"+employee.getEmpName()+",\nAge:"+employee.getAge()+"\nSex:"+employee.getSex()+",\nUSCitizen:"+employee.isUsCitizen());
	
	}
	
	
	
}
