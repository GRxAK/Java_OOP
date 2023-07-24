package homework03;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int nameComparison = o1.getLastName().compareTo(o2.getLastName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
