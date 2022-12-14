package computer;

public class Ports {
    private int USB;
    private boolean audio;
    private double bluetoothVersion;
    private boolean typeC;
    private boolean HDMI;
    private boolean VGA;
    private boolean ethernet;

    public Ports(int USB, boolean audio, double bluetoothVersion, boolean typeC, boolean HDMI, boolean VGA, boolean ethernet) {
        this.USB = USB;
        this.audio = audio;
        this.bluetoothVersion = bluetoothVersion;
        this.typeC = typeC;
        this.HDMI = HDMI;
        this.VGA = VGA;
        this.ethernet = ethernet;
    }


    public int getUSB() {
        return USB;
    }

    public boolean isAudio() {
        return audio;
    }

    public double getBluetoothVersion() {
        return bluetoothVersion;
    }

    public boolean isTypeC() {
        return typeC;
    }

    public boolean isHDMI() {
        return HDMI;
    }

    public boolean isVGA() {
        return VGA;
    }

    public boolean isEthernet() {
        return ethernet;
    }
}
