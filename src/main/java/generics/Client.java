package generics;

public abstract class Client {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getGrettings();

    public abstract boolean isValidIDNumber();
}