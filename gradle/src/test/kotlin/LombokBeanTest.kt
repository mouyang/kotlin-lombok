import org.junit.*
import org.junit.Assert.*

class LombokBeanTest {
    @Test fun JavaBean_set() {
        val lb = LombokBean()
        lb.setX("abc")
        assertEquals(lb.getX(), "abc")
    }
}