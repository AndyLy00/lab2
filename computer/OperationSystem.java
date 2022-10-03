package computer;

public class OperationSystem {
    private String typeOfSystem;

    public OperationSystem(String typeOfSystem) {
        this.typeOfSystem = typeOfSystem;
    }

    public String getTypeOfSystem() {
        return typeOfSystem;
    }

    @Override
    public String toString() {
        return "OperationSystem{" +
                "typeOfSystem='" + typeOfSystem + '\'' +
                '}';

    }

}