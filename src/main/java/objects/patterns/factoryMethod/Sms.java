package objects.patterns.factoryMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sms implements Message {
    @Override
    public List<String> filterParams(String... params) {
        return Arrays.stream(params)
                .filter(p -> p.startsWith("_"))
                .collect(Collectors.toList());
    }
}
