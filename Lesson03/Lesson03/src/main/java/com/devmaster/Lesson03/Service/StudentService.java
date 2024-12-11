package com.devmaster.Lesson03.Service;

import com.devmaster.Lesson03.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<Student>();

    public StudentService() {
        students.addAll(
                Arrays.asList(new Student("Số 31 Tổ 12,", 21," khiem@gmail.com", "None",1L , "Lê Hoài Khiêm", "0987333231")
                        ,new Student("Ha Noi,", 19," khiemhn@gmail.com", "None",2L , "Lê Hoài ", "0945621398")
                        ,new Student("Thai Nguyen", 17," khietnm@gmail.com", "None",3L , "Lê Khiêm", "0912345678")
                        ,new Student("Hai Phong", 20," khiemhp@gmail.com", "None",4L , "Hoài Khiêm", "0987654321")
                        )
        );
    }
    // Hiển thị danh sách toàn bộ sinh viên
    public List<Student> getStudents() {
        return students;
    }
    //Lấy sinh viên theo id
    public Student getStudentById(long id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);

    }

    // Thêm mới 1 sinh viên
    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    // Cập nhật thông tin sinh viên
    public Student updateStudent(Long id, Student student) {
        Student oldStudent = getStudentById(student.getId());
        System.out.println(id);
        System.out.println(student.toString());
        if (oldStudent == null) {
            return null;
        }
        students.forEach(item -> {
            if(item.getId().equals(id)){
                item.setName(student.getName());
                item.setAddress(student.getAddress());
                item.setEmail(student.getEmail());
                item.setPhone(student.getPhone());
                item.setGender(student.getGender());
                item.setAge(student.getAge());

            }

        });
        return student;
    }

    // Xóa thông tin sinh viên
    public boolean deleteStudent(long id) {
        Student student = getStudentById(id);
        return students.remove(student);
    }
}
