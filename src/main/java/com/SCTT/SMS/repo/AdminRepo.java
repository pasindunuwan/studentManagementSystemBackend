package com.SCTT.SMS.repo;

import com.SCTT.SMS.entity.Admin;
import com.SCTT.SMS.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin,String> {
    @Query(value = "SELECT * FROM course WHERE user_name = ?1 And passowrd =?2" ,nativeQuery = true)
    Admin  findByUserNameAndCourseName(String username, String password);
}
