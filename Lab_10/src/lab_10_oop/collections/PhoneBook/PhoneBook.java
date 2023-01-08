package lab_10_oop.collections.PhoneBook;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByName(String name);

    Student searchLastName(String name);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
