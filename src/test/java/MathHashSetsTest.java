import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MathHashSetsTest {

    private HashSet<Integer> first;
    private HashSet<Integer> second;
    private HashSet<String> firstStr;
    private HashSet<String> secondStr;

    @Before
    public void setUp() {
        first = new HashSet<>();
        first.add(1);
        first.add(2);

        second = new HashSet<>();
        second.add(2);
        second.add(3);

        firstStr = new HashSet<>();
        firstStr.add("1");
        firstStr.add("2");

        secondStr = new HashSet<>();
        secondStr.add("2");
        secondStr.add("3");
    }

    @After
    public void tearDown() {
        first = null;
        second = null;
        firstStr = null;
        secondStr = null;
    }

    @Test
    public void union() {

        HashSet<Integer> result = new HashSet<>();
        result.add(1);
        result.add(2);
        result.add(3);

        assertEquals(MathHashSets.union(first, second), result);
    }

    @Test
    public void intersection() {

        HashSet<String> resultStr = new HashSet<>();
        resultStr.add("2");

        assertEquals(MathHashSets.intersection(firstStr, secondStr), resultStr);
    }

    @Test
    public void minus() {

        HashSet<Integer> result = new HashSet<>();
        result.add(1);

        assertEquals(MathHashSets.minus(first, second), result);
    }

    @Test
    public void difference() {

        HashSet<String> resultStr = new HashSet<>();
        resultStr.add("1");
        resultStr.add("3");

        assertEquals(MathHashSets.difference(firstStr, secondStr), resultStr);
    }
}