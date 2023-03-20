package statik;
import java.util.Date;

public class Citizen {
    String tckn;
    String firstName;
    String lastName;
    Date dateOfBirth;
    String placeOfBirth;
    char sex;

    String fatherName;
    String motherName;

    static String nationality;

    static String getNationality() {
        return nationality;
    }

    public static void main(String[] args) {
        Citizen c1 = new Citizen();
        c1.tckn = "11111111111";
        c1.firstName = "İlker";
        c1.lastName = "Yelekçioğlu";

        Citizen c2 = new Citizen();
        c2.tckn = "22222222222";
        c2.firstName = "Ali";
        c2.lastName = "Çınar";

        Citizen.nationality = "Turkiye Cumhuriyeti";

        System.out.println("Nationality: " + Citizen.nationality);
        System.out.println("Mehmet's nationality: " + c1.nationality);
        System.out.println("Selin's nationality: " + c2.nationality);

        Citizen.nationality = "Azerbaycan Respublikasi";
        c1.nationality = "Azerbaycan Respublikasi";
        c2.nationality = "Azerbaycan Respublikasi";

        System.out.println("\nNationality: " + Citizen.nationality);
        System.out.println("İlker's nationality: " + c1.nationality);
        System.out.println("Ali's nationality: " + c2.nationality);

        System.out.println("\nNationality: " + Citizen.getNationality());
        System.out.println("İlker's nationality: " + c1.getNationality());
        System.out.println("Ali's nationality: " + c2.getNationality());
    }
}
