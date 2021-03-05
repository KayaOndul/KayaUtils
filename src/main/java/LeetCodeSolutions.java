import java.util.*;
import java.util.stream.Collectors;

public class LeetCodeSolutions {

    /**
     * @param keyName corresponds to a person's name  when their key-card was used in a single day
     * @param keyTime corresponds to a person's time when their key-card was used in a single day
     * @return unique worker names who received an alert for frequent keycard use(>=3 times in a day)
     * @see <a href="https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/submissions/"></a>
     */
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();


        for (int i = 0; i < keyName.length; ++i) {
            hashMap.computeIfAbsent(keyName[i], v -> new ArrayList<>()).add(convertToMinutes(keyTime[i]));
        }

        return hashMap.entrySet().stream().filter(e -> violatedOneHourLaw(e.getValue())).
                map(Map.Entry::getKey).sorted().collect(Collectors.toList());
    }

    public static int convertToMinutes(String time) {
        String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }

    public static boolean violatedOneHourLaw(List<Integer> list) {
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; --i) {

            int count = 1;
            for (int j = i - 1;
                 count <= 3 && j >= 0 &&
                         list.get(j) + 60 >= list.get(i) && list.get(j) < list.get(i);
                 --j, ++count)
                ;
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }
}
