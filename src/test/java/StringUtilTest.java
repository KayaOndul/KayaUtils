import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void splitStringIntoSubstring_Java9() {

        var actual=StringUtil.splitStringIntoSubstring_Java9("soiuahjdowqjwjeowqjoqwjiewqowjeqiowqeijwqeoww",3);

        var expected= List.of("soi","uah","jdo","wqj","wje","owq","joq","wji","ewq","owj","eqi","owq","eij","wqe","oww");

        assertEquals(expected,actual);
    }
    @Test
    void splitStringIntoSubstring_Java8() {

        var actual=StringUtil.splitStringIntoSubstring_Java8("soiuahjdowqjwjeowqjoqwjiewqowjeqiowqeijwqeoww",3);

        var expected= List.of("soi","uah","jdo","wqj","wje","owq","joq","wji","ewq","owj","eqi","owq","eij","wqe","oww");

        assertEquals(expected,actual);
    }
}