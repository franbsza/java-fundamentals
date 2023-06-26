package generics;

public abstract class Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getType();

    public abstract boolean isValidIDNumber();
}
