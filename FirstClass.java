
public class FirstClass {

	int age; // age�� static�� ���� ������ ���� ����
	static String schoolname; // stastic var.
							// static�� �ϳ��� ���� ��ü ����
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
		first.schoolname = "�б��̸�";
		first.method();
		
		// Create a FirstClass instance.
		FirstClass second = new FirstClass();
		
	}
}
