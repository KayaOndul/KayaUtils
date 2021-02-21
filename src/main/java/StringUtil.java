import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringUtil {
    /*
     *
     * Java 9 Solution
     */
    public static List<String> splitStringIntoSubstring_Java9(String s, int chunksize){
        List<String> strings=new ArrayList<>();

        IntStream.iterate(0, i->i+3)
                .takeWhile(n-> n<s.length())
                .forEach(num->{
                    strings.add(s.substring(num,num+3));
                });

        return  strings;
    }

    public static List<String> splitStringIntoSubstring_Java8(String s, int chunksize){
        List<String> strings=new ArrayList<>();
        IntStream.iterate(0, i->i+3)
                .takeWhile(n-> n<s.length())
                .forEach(num->{
                    strings.add(s.substring(num,num+3));
                });

        return  strings;
    }

}
