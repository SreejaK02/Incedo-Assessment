import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamExample {
public static void main (String[] args) {
List<String> language=Arrays.asList("python","java","c++");
filter(language,(str)->str.startsWith("j"));
}
public static void filter(List<String> names, Predicate<String> condition)
{
for(String name:names) {
if(condition.test(name)) {
System.out.println(name+ "");
}
}
}
}