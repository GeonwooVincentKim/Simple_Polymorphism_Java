import School.SchoolClass;
import School.Student;
import School.Teacher;


public class App {
    public static void main(String[] args) throws Exception {
        SchoolClass mTeacher = new Teacher(1, "김선생", 'g');
        SchoolClass mStudent = new Student(10, "김학생", 'm');

        String resultTec = "";
        resultTec = "id : " + mTeacher.id + ", name : " + mTeacher.name + ", gender : " + mTeacher.gender;

        String resultStu = "";
        resultStu = "id : " + mStudent.id + ", name :  " + mStudent.name + ", gender : " + mStudent.gender;

        System.out.println(resultTec);
        System.out.println(resultStu);
    }
}
