package com.SCTT.SMS.controller;

import com.SCTT.SMS.dto.StudentDTO;
import com.SCTT.SMS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/student")
@CrossOrigin
public class UserController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/getStudent")
    public List<StudentDTO> getStudent(){
        return studentService.getAllStudents();
    }

    @PostMapping("/saveStudent")
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO studentDTO){
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/deleteStudent")
    public boolean deleteStudent(@RequestBody StudentDTO studentDTO){
        return studentService.deleteStudent(studentDTO);
    }

    @GetMapping("/getStudentByIndexNo/{studentIndex}")
    public StudentDTO getStudentByIndexNo(@PathVariable String studentIndex){
        return studentService.getStudentByIndexNo(studentIndex);
    }

}
