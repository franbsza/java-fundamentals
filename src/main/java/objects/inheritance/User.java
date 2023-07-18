package objects.inheritance;

class User {
    private String username;
    private String password;
    private String isActive;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String isActive) {
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}
