import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetCodeSolutionsTest {

    @Test
    void alertNames() throws ParseException {
        var givenKeyName = new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        var givenKeyTime = new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};

        var expected = List.of("daniel");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }

    @Test
    void alertNames_test2() throws ParseException {
        var givenKeyName = new String[]{"alice", "alice", "alice", "bob", "bob", "bob", "bob"};
        var givenKeyTime = new String[]{"12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00"};

        var expected = List.of("bob");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }


    @Test
    void alertNames_test3() throws ParseException {
        var givenKeyName = new String[]{"a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b"};
        var givenKeyTime = new String[]{"23:27", "03:14", "12:57", "13:35", "13:18", "21:58", "22:39", "10:49", "19:37", "14:14", "10:41"};

        var expected = List.of("a");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }

    @Test
    void alertNames_test4() throws ParseException {
        var givenKeyName = new String[]{"a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b"};
        var givenKeyTime = new String[]{"23:27", "03:14", "12:57", "13:35", "13:18", "21:58", "22:39", "10:49", "19:37", "14:14", "10:41"};

        var expected = List.of("a");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }
}