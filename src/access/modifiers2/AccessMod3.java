package access.modifiers2;

import access.modifiers1.AccessMod1;

public class AccessMod3 extends AccessMod1{

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
//		System.out.println(obj.name);
//		obj.printEmpId();
		System.out.println(obj.getName());
		obj.setName("Basava");
	}

}
