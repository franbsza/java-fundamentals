package generics;

public class PersonalClient extends Client{
    private String personalIDNumber;
    private String type = "personal";

    public String getPersonalIDNumber() {
        return personalIDNumber;
    }

    public void setPersonalIDNumber(String personalIDNumber) {
        this.personalIDNumber = personalIDNumber;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean isValidIDNumber(){
        return personalIDNumber.length() == 11;
    }

    @Override
    public void getGrettings() {
       System.out.println("Hello! I'am a " + this.type +" client.");
    }
}
