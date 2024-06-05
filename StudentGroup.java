import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentGroup implements Iterable<student> {
    private String name;
    private final int id;

    public StudentGroup(String name, int id) {
        this.id = id;
        this.name = name;
    }


    public List<student> students= new ArrayList();
    public void addStudent(student student){
        students.addLast(student);
    }

    public List<student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        for (student st: students){
             x= new StringBuilder(x+" " + "nameGroup: " + name + ": " + st+"\n");
        }
        return x.toString();
    }

    @Override
    public Iterator<student> iterator() {
        return new StudentGroupIterator(this);
    }
}
