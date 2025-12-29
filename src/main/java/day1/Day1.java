package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day1 {

    public static void main(String[] args) throws IOException {
        final List<Rotation> instructions = Files.readAllLines(Path.of("src/main/resources/day1.txt"))
                .stream()
                .map(Rotation::new)
                .toList();
        final Cracker cracker = new Cracker();
        int password = cracker.crack(instructions);

        System.out.println(password);
    }

}
