package objects.inheritance;

class Teacher extends Client {
    private Double hourlyRate;

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
