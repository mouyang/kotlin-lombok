import org.junit.*
import org.junit.Assert.*

class JavaBeanTest {

	@Test fun JavaBean_set() {
		val jb = JavaBean()
		jb.setMyString("abc")
		assertEquals(jb.getMyString(), "abc")
	}
}
