   package pack1;


 class A {
	int i;//i is a default scope ,not only the current  class we can use all other classes of same package
	//
	
	public static void main(String[] args) {
		A a1= new A();
		System.out.println(a1.i);
	} 
	
}