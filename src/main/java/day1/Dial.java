package day1;

public class Dial {

    private int position = 50;

    public void rotate(final Rotation rotation) {
        switch (rotation.getDirection()) {
            case 'L' -> position -= rotation.getClicks();
            case 'R' -> position += rotation.getClicks();
            default -> throw new IllegalStateException("Unexpected direction: " + rotation.getDirection());
        }
        position = ((position % 100) + 100) % 100;
    }

    public int getPosition() {
        return position;
    }

}
