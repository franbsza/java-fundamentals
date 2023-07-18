package objects.patterns.factoryMethod;

import java.util.List;

public interface Message {
    List<String> filterParams(String... params);
}
