package generics;

public class PersonalClient extends Client{
    private String personalIDNumber;

    public void setPersonalIDNumber(String personalIDNumber) {
        this.personalIDNumber = personalIDNumber;
    }


    @Override
    public boolean isValidIDNumber(){
        return personalIDNumber.length() == 11;
    }

    @Override
    public String getType() {
       return "personal";
    }
}
