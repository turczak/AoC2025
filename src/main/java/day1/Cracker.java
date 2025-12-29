package day1;

import java.util.List;

public class Cracker {
    
    private final Dial dial = new Dial();
    private int counter = 0;

    public int crack(final List<Rotation> instructions) {
        instructions.forEach(rotation -> {
            dial.rotate(rotation);
            if (dial.getPosition() == 0) {
                counter++;
            }
        });
        return counter;
    }

}
