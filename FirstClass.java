
public class FirstClass {

	int age; // age는 static이 없기 때문에 각자 소유
	static String schoolname; // stastic var.
							// static은 하나만 만들어서 전체 공유
	void method() {
		int local = 120;
		System.out.println(age);
		System.out.println(schoolname);
		System.out.println("method's local: " + local);
	}
	
	public static void main(String[] args) {
	 	int local=0; // local var. must be initialised.
		
		FirstClass first = new FirstClass();
		// Prints out className@hashCode.
		System.out.println(first);
		// System.out.println(age);
		System.out.println(schoolname);
		System.out.println("main's local: " + local);
		
		//call method using an instance.
		first.age = 51;
		first.schoolname = "학교이름";
		first.method();
		
		// Create a FirstClass instance.
		FirstClass second = new FirstClass();
		
	}
}
