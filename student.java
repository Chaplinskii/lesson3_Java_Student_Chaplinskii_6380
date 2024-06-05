public class student implements Comparable<student>{
    public String name;
    public final int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "{ nameStudent: " +name+
                ", IdStudent: " +id+ " }";
    }

    @Override
    public int compareTo(student student) {
//        if (student.name.length()>this.name.length()) return -1;
//        else if (student.name.length()<this.name.length()) return 1;
//        return 0;
        return student.id - this.id;
    }
}
