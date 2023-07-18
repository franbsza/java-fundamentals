package objects.patterns.factoryMethod;

public class EmailCreator implements MessageCreator {
    @Override
    public Message createItem() {
        return new Email();
    }
}
