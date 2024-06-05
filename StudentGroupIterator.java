import java.util.Iterator;

public class StudentGroupIterator implements Iterator<student> {

    private StudentGroup studentGroup;
    private int index=0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

//    private student[] getStudents(){
//        String[] names = studentGroup.students.toString().split(" ");
//        student[] students = new student[names.length];
//        int count =0;
//        for (String name: names){
//            students[count]=new student(name,count);
//            count++;
//        }
//        return students;
//    }

    @Override
    public boolean hasNext() {
//        int lengthStudents = getStudents().length;

        return index<studentGroup.students.size();
    }

    @Override
    public student next() {
//        student[] students = getStudents();
        return studentGroup.students.get(index++);
//                students[index++];
    }
}
