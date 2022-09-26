package computer;

public class RAM {
    private int RAM;
    private String typeOfRAM;

    public RAM(int RAM, String typeOfRAM) {
        this.RAM = RAM;
        this.typeOfRAM = typeOfRAM;
    }

    public int getRAM() {
        return RAM;
    }

    public String getTypeOfRAM() {
        return typeOfRAM;
    }
}
