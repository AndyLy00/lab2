package computer;

public class Aditional {
    private String typeOfComputer;
    private String company;
    private String model;
    private String keyboardLight;
    private String color;

    public Aditional(String typeOfComputer, String company, String model, String keyboardLight, String color) {
        this.typeOfComputer = typeOfComputer;
        this.company = company;
        this.model = model;
        this.keyboardLight = keyboardLight;
        this.color = color;
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

    @Override
    public String toString() {
        return "Aditional{" +
                "typeOfComputer='" + typeOfComputer + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", keyboardLight='" + keyboardLight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}