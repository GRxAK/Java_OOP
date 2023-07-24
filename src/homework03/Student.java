package homework03;

public class Student implements Comparable<Student> {
    private Integer id;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student (Integer id, String firstName, String secondName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Студент: id : " + id + ", ФИО : " + lastName + " " + firstName + " " + secondName + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        Student student = (Student) o;
        return  (this.firstName.equals(student.firstName) &&
                this.secondName.equals(student.secondName) &&
                this.lastName.equals(student.lastName));
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
