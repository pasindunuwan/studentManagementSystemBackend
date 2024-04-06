package com.SCTT.SMS.repo;

import com.SCTT.SMS.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, String> {

    @Query(value = "SELECT * FROM student WHERE index_no =?1",nativeQuery = true)
    Student getStudentByIndexNo(String studentIndex);
}
