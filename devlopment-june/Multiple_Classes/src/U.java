public class U {
public static void main(String[] args) {
	System.out.println("U main begin");
	T.test();
	System.out.println("U-main end");
}
}
//CTE
  /* error: cannot find symbol
        T1.test();
        ^
  symbol:   variable T1
  location: class U
1 error	*/
