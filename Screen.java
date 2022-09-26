package computer;

public class Screen {
    private int screenLength;
    private int screenWidth;
    private String display;
    private String displayCover;
    private double diagonal;
    private int refreshRate;

    public Screen(int screenLength, int screenWidth, String display, String displayCover, double diagonal, int refreshRate) {
        this.screenLength = screenLength;
        this.screenWidth = screenWidth;
        this.display = display;
        this.displayCover = displayCover;
        this.diagonal = diagonal;
        this.refreshRate = refreshRate;
    }

    public int getScreenLength() {
        return screenLength;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public String getDisplay() {
        return display;
    }

    public String getDisplayCover() {
        return displayCover;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getRefreshRate() {
        return refreshRate;
    }
}
