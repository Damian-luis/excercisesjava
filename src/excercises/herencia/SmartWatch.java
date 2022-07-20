package excercises.herencia;

public class SmartWatch extends SmartDevice{
    Integer size;
    boolean healthCare;
    String model;

    public SmartWatch(String operativeSystem, Integer launch, String color, Integer size, boolean healthCare, String model) {
        super(operativeSystem, launch, color);
        this.size = size;
        this.healthCare = healthCare;
        this.model = model;
    }
    public void watchInformation(){
        System.out.println("OS: "+operativeSystem+" model: "+model+" healthcare: "+healthCare+" size: "+size+" color: "+color+" launch: "+launch);
    }
}
