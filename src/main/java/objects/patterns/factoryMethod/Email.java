package objects.patterns.factoryMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Email implements Message {
    @Override
    public List<String> filterParams(String... params) {
        return Arrays.stream(params)
                .filter(p -> p.substring(0).matches( "[A-Za-z]"))
                .collect(Collectors.toList());
    }
}
