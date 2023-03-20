public class SelamTest {
    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("İlker");
        System.out.println(cevap);

        cevap = nesne.selamSoyle("Ayşe");
        System.out.println(cevap);

        System.out.println("World: " + nesne.world);

        cevap = nesne.selamSoyle("");
        System.out.println(cevap);
    }
}
