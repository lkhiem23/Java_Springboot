package com.devmaster.SpringBoot_Lesson06.Service;

import com.devmaster.SpringBoot_Lesson06.DTO.StudentDTO;
import com.devmaster.SpringBoot_Lesson06.Entity.Student;
import com.devmaster.SpringBoot_Lesson06.Respository.StudentRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@NoArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // List All SinhVien

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    // Get Object Student
    public Optional<StudentDTO> findById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());
            studentDTO.setEmail(student.getEmail());
            studentDTO.setAge(student.getAge());
            return Optional.of(studentDTO);
        } else {
            log.warn("Không tìm thấy sinh viên với id: " + id);
            return Optional.empty();
        }
    }

   //Create

    public Boolean save(StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());
        try {
            studentRepository.save(student);
            return true;
        }catch (Exception e) {
            log.error(e.getMessage());
            return false;
        }
    }

    /*
    * Cập nhật dữ liệu khi sửa
    */

    public Boolean update(Long id, StudentDTO studentDTO){
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(studentDTO.getName());
                    student.setEmail(studentDTO.getEmail());
                    student.setAge(studentDTO.getAge());
                    studentRepository.save(student);
                    return true;
                }).orElseThrow(()->new IllegalArgumentException("Không tìm thấy id Student"))
                ;
    }

    /*
     * XÓA
     */

    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
