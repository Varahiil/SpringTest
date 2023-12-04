package by.itstep.student;

import java.util.List;

public class Group {
    private List<Student> listOfStudents;

    public void addStudent(Student student){
        this.listOfStudents.add(student);
    }

    public Group() {
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;

        Group group = (Group) o;

        return getListOfStudents() != null ? getListOfStudents().equals(group.getListOfStudents()) : group.getListOfStudents() == null;
    }

    @Override
    public int hashCode() {
        return getListOfStudents() != null ? getListOfStudents().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Group{" +
                "listOfStudents=" + listOfStudents +
                '}';
    }

}