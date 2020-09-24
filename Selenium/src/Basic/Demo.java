package Basic;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Demo {
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
	}
	
	@Before
	public static void before() {
		System.out.println("before");
	}
	
	@Test
	 public void test() {
		System.out.println("inside tests");
	}
	
	@After
	public static void after() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}

}


// 
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
// 
//public class Demo01_JUnitAnnotaions {
//	@BeforeClass
//	public static void beforeClass() {
//		System.out.println("Inside before class method.");
//	}
// 
//	@Before
//	public void before() {
//		System.out.println("Inside before method.");
//	}
// 
//	@Test
//	public void test() {
//		System.out.println("Inside test method.");
//	}
// 
//	@After
//	public void after() {
//		System.out.println("Inside after method.");
//	}
// 
//	@AfterClass
//	public static void afterClass() {
//		System.out.println("Inside after class method.");
//	}
//}
