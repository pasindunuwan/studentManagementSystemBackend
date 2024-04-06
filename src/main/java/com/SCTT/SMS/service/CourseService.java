package com.SCTT.SMS.service;
import com.SCTT.SMS.dto.CourseDTO;
import com.SCTT.SMS.entity.Course;
import com.SCTT.SMS.repo.CourseRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private ModelMapper modelMapper;
    public CourseDTO saveCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, Course.class));
        return courseDTO;
    }

    public List<CourseDTO> getAllCourses(){
        List<Course>courseList= courseRepo.findAll();
        return modelMapper.map(courseList,new TypeToken<List<CourseDTO>>(){}.getType());
    }

    public  CourseDTO updateCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, Course.class));
        return courseDTO;
    }

    public boolean deleteCourse(CourseDTO courseDTO){
        courseRepo.delete(modelMapper.map(courseDTO, Course.class));
        return true;
    }

    public CourseDTO getCourseByIndexNo(String studentIndex){
        Course course = courseRepo.getCourseByIndexNo(studentIndex);
        return modelMapper.map(course, CourseDTO.class);
    }
}
