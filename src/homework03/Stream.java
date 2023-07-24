package homework03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentsGroup> {
    private List<StudentsGroup> listGroup;

    private Integer number;

    private int counter;

    public Stream() {
        this.listGroup = new ArrayList<StudentsGroup>();
        this.number = null;
    }

    public Stream(Integer number) {
        this.listGroup = new ArrayList<StudentsGroup>();
        this.number = number;
    }

    public List<StudentsGroup> getListGroup() {
        return this.listGroup;
    }

    public void setListGroup(List<StudentsGroup> listGroup) {
        this.listGroup = listGroup;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void addGroup(StudentsGroup group) {
        this.listGroup.add(group);
    }

    @Override
    public String toString() {
        return "Поток #" + number + " : \n" + listGroup;
    }

    @Override
    public boolean hasNext() {
        return counter < listGroup.size() - 1;
    }

    @Override
    public StudentsGroup next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return listGroup.get(counter);
    }

    @Override
    public void remove() {
        listGroup = new ArrayList<StudentsGroup>();
        counter = 0;
    }
}
