public class Student extends User {

    private String favouriteCourses;

    public Student() {

    }


    public Student(String favouriteCourses) {

        this.favouriteCourses = favouriteCourses;
    }


    public String getFavouriteCourses() {
        return favouriteCourses;
    }

    public void setFavouriteCourses(String favouriteCourses) {
        this.favouriteCourses = favouriteCourses;
    }
}
