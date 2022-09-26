package computer;

public class Multimedia {
    private boolean camera;
    private int cameraQuality;
    private int numberOfSpeakers;
    private boolean microphone;

    public Multimedia(boolean camera, int cameraQuality, int numberOfSpeakers, boolean microphone) {
        this.camera = camera;
        this.cameraQuality = cameraQuality;
        this.numberOfSpeakers = numberOfSpeakers;
        this.microphone = microphone;
    }


    public boolean isCamera() {
        return camera;
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public boolean isMicrophone() {
        return microphone;
    }
}
