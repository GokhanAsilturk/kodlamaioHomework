public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setFirstName("Gökhan");
        student1.setLastName("Asiltürk");
        student1.setAge(23);
        student1.setFavouriteCourses("java");

        UserManager userManager = new UserManager();
        userManager.studentDisplay(student1.getFirstName(), student1.getLastName(), student1.getAge(), student1.getFavouriteCourses());

        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiroğ");
        instructor1.setAge(35);
        instructor1.setSalary(4000);

        userManager.instructorDisplay(instructor1.getFirstName(), instructor1.getLastName(), instructor1.getAge(), instructor1.getSalary());

        StudentManager studentManager = new StudentManager();
        studentManager.addFavoriteCourse("C++");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.updateSalary(4500);


        userManager.add(student1.getFirstName(), student1.getLastName());

        userManager.remove(instructor1.getFirstName(), instructor1.getLastName());

        userManager.update(student1.getFirstName(), student1.getLastName());


    }
}
