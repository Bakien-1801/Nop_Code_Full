package lab_10_oop.collections.PhoneBook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBookMap();

        phoneBook.addPerson(new Student("Nicola", "Bicocchi", "12345"));
        phoneBook.addPerson(new Student("Marco", "Rizzo", "4231"));
        phoneBook.addPerson(new Student("Luisa", "Poppi", "23643"));

        System.out.println(phoneBook.searchByName("Marco"));
        System.out.println(phoneBook.searchLastName("Poppi"));

        System.out.println(phoneBook.searchByNumber("2222"));

        phoneBook.deleteByNumber("23643");
        System.out.println(phoneBook.searchLastName("Poppi"));
    }
}
