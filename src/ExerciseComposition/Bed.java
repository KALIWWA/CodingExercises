package ExerciseComposition;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int guilt;

    public Bed(String style, int pillows, int height, int sheets, int guilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.guilt = guilt;
    }

    void make() {
        System.out.println("Bed.make()");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getGuilt() {
        return guilt;
    }
}
