package com.devmaster.SpringBoot_Lesson06.Respository;

import com.devmaster.SpringBoot_Lesson06.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long /*Tương ứng khóa trong Entity*/> {}
