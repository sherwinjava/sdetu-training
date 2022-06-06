package lab;

public class StudentDB {

	public static void main(String[] args) {

		
		Student stu1 = new Student("Joey","875350253283");
		Student stu2 = new Student("Phoebe","875350253283");
		Student stu3 = new Student("Monica","875350253283");
		String[] courses = {"Java", "JSON", "PHP"};
		stu1.enroll(courses);
		stu1.pay(550);
		
		stu1.setPhone("321435223");
		stu1.setCity("San Francisco");
		stu1.setState("California");
		
		System.out.println("\n" + stu1.toString());	

	}

}

class Student{
	
	private String name;
	private String SSN;
	private String email;
	private static int ID = 1000;
	private String userID;
	private double balance;
	private String[] courses;
	private String phone;
	private String city;
	private String state;
	
	
	public Student(String name, String SSN){
		ID++;
		System.out.println("\nNew Student: " + name + "\nSSN: " + SSN);
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmail();
		
	}
	
	public void setEmail(){
		email = name.toLowerCase()+"."+ userID + "@lab.com";
		System.out.println("Email: " + email);
	}
	
	public void setUserID(){
		int random = (int)(Math.random() * 9000);
		userID = ID + "" + random + SSN.substring(SSN.length()-4,SSN.length()); 
		System.out.println("User ID: " + userID);
	}
	
	public void enroll(String[] courses){
		System.out.println("\nEnrollment Details");
		System.out.println("Enrollee: " + name + "\nUser ID: " + userID);
		this.courses = courses;
		showCourses();
		balance = courses.length * 1000;		
		System.out.println("Tuition Fee: " + balance);
	}
	 
	public void pay(double amount){
		balance = balance - amount;
		System.out.println("\nPaid Amount: " + amount);
		checkBalance();		
	}
	
	public void checkBalance(){
		System.out.println("Current Balance: " + balance);
	}
	
	@Override
	public String toString(){
		return "\n[Student Name: " + name + "]\n[User ID: " + userID + "]\n[Email: " + email +"]\n[Phone: " + phone + "]\n[City: " + city + "]\n[State: "+ state + "]";
	}
	
	public void showCourses(){
		
		for (int i=0; i<courses.length; i++){
			System.out.println("Course " + (i+1) + ": " + courses[i]);
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
