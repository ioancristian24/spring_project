import com.sda.entities.Student;
import com.sda.service.implementation.StudentServiceImpl;
import org.junit.Test;

public class EntryPoints {

    private StudentServiceImpl studentService;

    public StudentServiceImpl getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @Test
    public void testExecuteStudent(){
        System.out.println("Testing <executeStudent> operation...");
        Student student = new Student();
        student.setName("Marian Badea");
        student.setAge(22);
        student.setAverage_grade(8);
        getStudentService().addStudent(student);
    }
}
