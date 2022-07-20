package excercises.herencia;

public class SmartPhone extends SmartDevice{
    String model;
    Integer memory;
    Integer ram;

    public SmartPhone(String operativeSystem, Integer launch, String color, String model, Integer memory, Integer ram) {
        super(operativeSystem, launch, color);
        this.model = model;
        this.memory = memory;
        this.ram = ram;
    }

    public void phoneInformation(){
        System.out.println("OS: "+operativeSystem+" model: "+model+" internal memory: "+memory+" ram: "+ram+" color: "+color+" launch: "+launch);
    }
}
