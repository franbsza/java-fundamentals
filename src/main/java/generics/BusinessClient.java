package generics;

public class BusinessClient extends Client{

    private String businessIDNumber;

    public void setBusinessIDNumber(String businessIDNumber) {
        this.businessIDNumber = businessIDNumber;
    }

    @Override
    public boolean isValidIDNumber(){
        return businessIDNumber.length() == 14;
    }

    @Override
    public String getType() {
        return "business";
    }
}
