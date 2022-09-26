package computer;

public class Case {
    private int caseLength;
    private int caseWidth;
    private int caseThickness;
    private int caseWeight;



    public Case(int caseLength, int caseWidth, int caseThickness, int caseWeight) {
        this.caseLength = caseLength;
        this.caseWidth = caseWidth;
        this.caseThickness = caseThickness;
        this.caseWeight = caseWeight;
    }


    public int getCaseLength() {
        return caseLength;
    }

    public int getCaseWidth() {
        return caseWidth;
    }

    public int getCaseThickness() {
        return caseThickness;
    }

    public int getCaseWeight() {
        return caseWeight;
    }
}
