package objects.patterns.factoryMethod;

public class SmsCreator implements MessageCreator {

    @Override
    public Message createItem() {
        return new Sms();
    }
}
