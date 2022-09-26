package computer;

public class Processor {
    private String frequency;
    private int cores;
    private int cache;
    private String architecture;
    private String typeOfCPU;
    private String CPUModel;
    private String CPUCompany;

    public Processor(String frequency, int cores, int cache, String architecture, String typeOfCPU, String CPUModel, String CPUCompany) {
        this.frequency = frequency;
        this.cores = cores;
        this.cache = cache;
        this.architecture = architecture;
        this.typeOfCPU = typeOfCPU;
        this.CPUModel = CPUModel;
        this.CPUCompany = CPUCompany;
    }

    public String getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public int getCache() {
        return cache;
    }

    public String getArchitecture() {
        return architecture;
    }

    public String getTypeOfCPU() {
        return typeOfCPU;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public String getCPUCompany() {
        return CPUCompany;
    }
}
