import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Questin 2 on the assessment
 */



public class ApplicationRunner {

    public static void main(String[] args) {
        String line = "4155230";

        phoneNumberCombinations(line);
    }

    public static List<String> phoneNumberCombinations(String line){
        HashMap<Character, String> map = new HashMap<>();
        map.put('0', "0");
        map.put('1', "1");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();

        result.add("");

        for (int i = 0; i < line.length(); i++){
            ArrayList<String> temp = new ArrayList<>();
            String letters = map.get(line.charAt(i));

            for (int j = 0; j < result.size(); j++){
                for (int c = 0; c < letters.length(); c++) {
                    temp.add(new StringBuilder(result.get(j)).append(letters.charAt(c)).toString());
                }
            }
            result.clear();
            result.addAll(temp);
        }

        System.out.println("Final Result is : " + result);
        return result;
    }
}
