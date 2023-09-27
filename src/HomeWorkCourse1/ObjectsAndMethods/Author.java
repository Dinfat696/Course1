package HomeWorkCourse1.ObjectsAndMethods;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String firstName) {
        this.name = name;
        this.lastName = firstName;
    }

    public String getName() {
        return this.name;
    }


    public String getLastName() {
        return this.lastName;
    }
}

