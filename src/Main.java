import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artifact> museumList = new ArrayList<>();

        Artifact artifact1 = new Artifact(
                "M04",
                "Ancient Coin",
                "Ancient Rome"
        );

        Artifact artifact2 = new Artifact(
                "A01",
                "Stone Tool",
                "Stone Age"
        );

        Artifact artifact3 = new Artifact(
                "Z99",
                "Modern Sculpture",
                "Modern Era"
        );

        Artifact artifact4 = new Artifact(
                "B12",
                "Medieval Shield",
                "Middle Ages"
        );

        museumList.add(artifact1);
        museumList.add(artifact2);
        museumList.add(artifact3);
        museumList.add(artifact4);

        System.out.println("Before sorting:");
        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }

        Collections.sort(museumList);

        System.out.println("\nAfter sorting:");
        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }
    }
}