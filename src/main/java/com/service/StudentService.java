import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // CRUD operations
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(String studentId) {
        studentRepository.deleteById(studentId);
    }
}
