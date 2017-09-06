package ${groupId};

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/**
 * Unit test for simple App. With boiler plating for more substantial testing.
 */
@RunWith(Parameterized.class)
public class AppTest {

    @Rule
    public ExpectedException expect = ExpectedException.none();

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Parameter
    public int parameter;

    @Parameters(name = "Parameter: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(
            params(1),
            params(2)
        );
    }

    private static Object[] params(int parameter) {
        return new Object[]{parameter};
    }

    @Test
    public void testApp() {
        assertThat(parameter, anyOf(is(1), is(2)));
    }
}
