package day1;

public class Rotation {
    private final char direction;
    private final int clicks;

    public Rotation(String instruction) {
        this.direction = instruction.charAt(0);
        this.clicks = Integer.parseInt(instruction.substring(1));
    }

    public char getDirection() {
        return direction;
    }

    public int getClicks() {
        return clicks;
    }

}
