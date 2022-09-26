package computer;

public class Computer {
    private String typeOfComputer;
    private String company;
    private String model;
    private String keyboardLight;
    private String color;
    private Battery battery;
    private Case computerCase;
    private Memory memory;
    private Multimedia multimedia;
    private OperationSystem operationSystem;
    private Ports ports;
    private Processor processor;
    private RAM RAM;
    private Screen screen;
    private VideoCard videoCard;



    public Computer(String typeOfComputer, String company, String model, String keyboardLight, String color, computer.Battery battery, computer.Case computerCase, computer.Memory memory, computer.Multimedia multimedia, computer.OperationSystem operationSystem, computer.Ports ports, computer.Processor processor, computer.RAM RAM, computer.Screen screen, VideoCard videoCard) {
        this.typeOfComputer = typeOfComputer;
        this.company = company;
        this.model = model;
        this.keyboardLight = keyboardLight;
        this.color = color;
        this.battery = battery;
        this.computerCase = computerCase;
        this.memory = memory;
        this.multimedia = multimedia;
        this.operationSystem = operationSystem;
        this.ports = ports;
        this.processor = processor;
        this.RAM = RAM;
        this.screen = screen;
        this.videoCard = videoCard;
    }



    public String getTypeOfComputer() {
        return typeOfComputer;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getKeyboardLight() {
        return keyboardLight;
    }

    public String getColor() {
        return color;
    }

    public computer.Battery getBattery() {
        return battery;
    }

    public computer.Case getComputerCase() {
        return computerCase;
    }

    public computer.Memory getMemory() {
        return memory;
    }

    public computer.Multimedia getMultimedia() {
        return multimedia;
    }

    public computer.OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public computer.Ports getPorts() {
        return ports;
    }

    public computer.Processor getProcessor() {
        return processor;
    }

    public computer.RAM getRAM() {
        return RAM;
    }

    public computer.Screen getScreen() {
        return screen;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}
