package com.SCTT.SMS.repo;
import com.SCTT.SMS.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface CourseRepo extends JpaRepository<Course, String> {
    @Query(value = "SELECT * FROM course WHERE index_no =?1",nativeQuery = true)
    Course getCourseByIndexNo(String studentIndex);
}
