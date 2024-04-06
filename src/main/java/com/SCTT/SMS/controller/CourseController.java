package com.SCTT.SMS.controller;

import com.SCTT.SMS.dto.CourseDTO;
import com.SCTT.SMS.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/course")
@CrossOrigin

public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getCourses")
    public List<CourseDTO> getCourse(){
        return courseService.getAllCourses();
    }

    @PostMapping("/saveCourse")
    public CourseDTO saveCourse(@RequestBody CourseDTO courseDTO){
        return courseService.saveCourse(courseDTO);
    }

    @PutMapping("/updateCourse")
    public CourseDTO updateCourse(@RequestBody CourseDTO courseDTO){
        return courseService.updateCourse(courseDTO);
    }

    @DeleteMapping("/deleteCourse")
    public boolean deleteCourse(@RequestBody CourseDTO courseDTO){
        return courseService.deleteCourse(courseDTO);
    }

    @GetMapping("/getCourseByIndexNo/{studentIndex}")
    public CourseDTO getCourseByIndexNo(@PathVariable String studentIndex) {
        return courseService.getCourseByIndexNo(studentIndex);
    }
}
