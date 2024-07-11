class D 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		C c1=new C();
	System.out.println(c1.i);
     System.out.println(2);
	}
}
	/*


1
0
2
*/

   /*

   //

if we are not  using int i c class than it will give the error
    NoSuchFieldError
  1 directelly compile C class andc than direct run D class it will the error NosuchfieldError
	 and D class looking a i but i is not available


	  E:\devlopment-june\ex-app\src>javac -d ../classes C.java

E:\devlopment-june\ex-app\src>java -cp ../classes D
1
Exception in thread "main" java.lang.NoSuchFieldError: i
        at D.main(D.java:7)

E:\devlopment-june\ex-app\src>


*/