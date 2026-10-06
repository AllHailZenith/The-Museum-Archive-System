public class Main {
    public static void main(String[] args) {
        ArrayCollection<Artifact> catalog = new ArrayCollection<>();

        Artifact artifact1 = new Artifact("A101", "Ancient Vase", "Ancient Greece");
        Artifact artifact2 = new Artifact("B205", "Medieval Sword", "Middle Ages");
        Artifact artifact3 = new Artifact("C309", "Renaissance Painting", "Renaissance");

        catalog.add(artifact1);
        catalog.add(artifact2);
        catalog.add(artifact3);

        Artifact searchKey = new Artifact("B205", "", "");

        System.out.println("Contains B205: " + catalog.contains(searchKey));
        System.out.println("Found artifact: " + catalog.get(searchKey));

        System.out.println("\nBefore removal:");
        System.out.println(catalog);

        catalog.remove(searchKey);

        System.out.println("After removing B205:");
        System.out.println(catalog);

        System.out.println("Collection size: " + catalog.size());
    }
}