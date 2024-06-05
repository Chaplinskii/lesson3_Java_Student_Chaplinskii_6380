import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private String name;
    private final int id;

    public Stream(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<StudentGroup> stream_ = new ArrayList();

    public List<StudentGroup> getStream_() {
        return stream_;
    }

    public void addStudentGroup (StudentGroup StudentGroup){
        stream_.addLast(StudentGroup);
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        for (StudentGroup st: getStream_()){
            x= new StringBuilder( x+"nameStream: "+name + "\n"+st +"\n");
        }
        return x.toString();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        Iterator<StudentGroup> it = new Iterator<StudentGroup>() {
            private int i=0;

            @Override
            public boolean hasNext() {
                return i<stream_.size();
            }

            @Override
            public StudentGroup next() {
                return stream_.get(i++);
            }
        };

        return it;
    }
}
