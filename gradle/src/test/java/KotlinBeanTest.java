import org.junit.*;
import static org.junit.Assert.*;

public class KotlinBeanTest {
	@Test
	public void KotlinBean_set() {
		KotlinBean kb = new KotlinBean(1);
		assertEquals(1, kb.getMyInteger());
		kb.setMyInteger(2);
		assertEquals(2, kb.getMyInteger());
	}
}
