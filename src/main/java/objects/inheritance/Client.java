package objects.inheritance;

/*

Turn into this class abstract make sense since 'Client' do not represent a real object , it exists only to generalize
clients that could be type Student or Teacher.

It will prevent wrong instantiate of this class.

 */

abstract class Client extends User {
    private String name;
    private String address;
    private String telephone;

    Client(String username, String password, String name, String address, String telephone) {
        super(username, password);
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    Client() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
