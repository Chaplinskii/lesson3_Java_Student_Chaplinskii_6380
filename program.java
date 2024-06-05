//� Создать класс Студент
//� Создать класс УчебнаяГруппа
//� Создать класс УчебнаяГруппаИтератор, заставив его реализовать
//интерфейс Iterator
//� Реализовать его контракты (включая удаление)

//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

import java.util.*;

public class program {
    public  static void main(String[] args) {
        Random rand = new Random();

        int id_Stream = 1;
        StreamServes streamServes = new StreamServes("StreamServes");
        for (int k=0; k<rand.nextInt(3,6);k++) {//Создаем рандомное количество потоков
            StringBuilder nameStream = new StringBuilder("Stream_" + id_Stream);
            Stream stream = new Stream(nameStream.toString(),rand.nextInt(100));
            int id_Group=1;
            for (int j = 0; j < rand.nextInt(3, 9); j++) {//Создаем рандомное количество групп
                StringBuilder nameGroup = new StringBuilder("Group_" + id_Group);
                StudentGroup studentGroup = new StudentGroup(nameGroup.toString(), rand.nextInt(100));
                int id_Student=1;
                for (int i = 0; i < rand.nextInt(3, 6); i++) {//Создаем рандомное количество студентов
                    StringBuilder nameStudent = new StringBuilder("Student_" + id_Student);
                    student student = new student(nameStudent.toString(), rand.nextInt(100));
                    studentGroup.addStudent(student);
                    id_Student++;
                }
                id_Group++;
                stream.addStudentGroup(studentGroup);
            }
            id_Stream++;
            streamServes.addStream(stream);
        }

        System.out.println(streamServes);//Печать всего и вся с помощью переопределенного метода toString
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Печать всего и вся с помощью переопределенного метода toString");
        System.out.println("Потоки до сортировки");

        for (var s: streamServes.getStreams()) {//Потоки до сортировки
            if (s.stream_.size()==3 || s.stream_.size()==4){
                System.out.println("В Steam: "+s.getName()+" содержится: "+ s.stream_.size()+ " группы");
            }else {
                System.out.println("В Steam: " + s.getName() + " содержится: " + s.stream_.size() + " групп");
            }
        }

        System.out.println("========================================================================================");

        Collections.sort(streamServes.getStreams(), new StreamComparator()); // Сортируем порки по количеству групп в них

        System.out.println("Потоки после сортировки");

        for (var s: streamServes.getStreams()) {//Потоки после сортировки
            if (s.stream_.size()==3 || s.stream_.size()==4){
                System.out.println("В Steam: "+s.getName()+" содержится: "+ s.stream_.size()+ " группы");
            }else {
                System.out.println("В Steam: " + s.getName() + " содержится: " + s.stream_.size() + " групп");

            }
        }
//        List<student> students= new ArrayList<>(); // Сортировка студентов по id
//        for (Stream ts: streamServes.getStreams()){
//            for (StudentGroup ts1: ts.stream_){
//                for (student ts2: ts1.getStudents()){
//                    students.addLast(ts2);
//                }
//            }
//        }
//        Collections.sort(students, new StudentComparator());
//        for (var x: students) {
//            System.out.println(x);
//        }
    }
}
