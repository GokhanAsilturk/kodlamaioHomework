public class UserManager {

    private String id;

    public void add(String firstName, String lastName) {
        String userName = (firstName + " " + lastName);

        System.out.println("\n\nKullanıcı kaydedildi!: " + userName);


    }

    void remove(String firstName, String lastName) {


        //String id = firstName.substring(0, 1) + lastName.substring(0, 1) + age;
        System.out.println("\n\nKullanıcı silindi!: " + firstName + " " + lastName + " ");
    }

    void update(String firstName, String lastName) {

        System.out.println("\n\nKullanıcı bilgileri yenilendi!: " + firstName + " " + lastName);


    }

    public void idCalculate(String firstName, String lastName, int age) {
        String id = firstName.substring(0, 1) + lastName.substring(0, 1) + age;
        this.id = id;

    }


    void studentDisplay(String firstName, String lastName, int age, String favoriteCourse) {

        idCalculate(firstName, lastName, age);

        System.out.println("\n\nÖĞRENCİ BİLGİLERİ:\n"
                + "Ad Soyad: " + firstName + " " + lastName + "\n"
                + "Favori Kurs: " + favoriteCourse + "\n"
                + "Yaş: " + age + "\n"
                + "Öğrenci ID: " + id);
    }

    void instructorDisplay(String firstName, String lastName, int age, double salary) {

        idCalculate(firstName, lastName, age);
        System.out.println("\n\nÖĞRETMEN BİLGİLERİ:\n"
                + "Ad Soyad: " + firstName + " " + lastName + "\n"
                + "Maaş: " + salary + "\n"
                + "Yaş: " + age + "\n"
                + "Öğretmen ID: " + id);
    }
}
