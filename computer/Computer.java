package computer;

public class Computer {
    private Aditional aditional;
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



    public Computer(computer.Aditional aditional,  computer.Battery battery, computer.Case computerCase, computer.Memory memory, computer.Multimedia multimedia, computer.OperationSystem operationSystem, computer.Ports ports, computer.Processor processor, computer.RAM RAM, computer.Screen screen, VideoCard videoCard) {
        this.aditional = aditional;
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

    public Computer() {
    }

    public computer.Aditional getAditional() {
        return aditional;
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


    @Override
    public String toString() {
        return "Computer{" +
                ", aditional=" + aditional +
                ", battery=" + battery +
                ", computerCase=" + computerCase +
                ", memory=" + memory +
                ", multimedia=" + multimedia +
                ", operationSystem=" + operationSystem +
                ", ports=" + ports +
                ", processor=" + processor +
                ", RAM=" + RAM +
                ", screen=" + screen +
                ", videoCard=" + videoCard +
                '}';
    }
}
