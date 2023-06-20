package generics;

public class BusinessClient extends Client{

    private String businessIDNumber;
    private String type = "business";

    public String getBusinessIDNumber() {
        return businessIDNumber;
    }

    public void setBusinessIDNumber(String businessIDNumber) {
        this.businessIDNumber = businessIDNumber;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean isValidIDNumber(){
        return businessIDNumber.length() == 15;
    }

    @Override
    public void getGrettings() {
        System.out.println("Hello! I'am a " + this.type +" client.");
    }
}
