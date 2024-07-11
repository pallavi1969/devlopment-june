class A3//super class
{
	int i;
	void test1()
	{
		System.out.println("A3-test1");
	}
}
public class G  extends A3//G is sub class
{
public static void main(String[] args) {
	G g1= new G();
	System.out.println(g1.i);
	g1.test1();
	g1.i=40;
	System.out.println(g1.i);
}
}