package com.SCTT.SMS.service;

import com.SCTT.SMS.dto.StudentDTO;
import com.SCTT.SMS.entity.Student;
import com.SCTT.SMS.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ModelMapper modelMapper;
    public StudentDTO saveStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }

    public List<StudentDTO> getAllStudents(){
        List<Student>studentList= studentRepo.findAll();
        return modelMapper.map(studentList,new TypeToken<List<StudentDTO>>(){}.getType());
    }

    public  StudentDTO updateStudent(StudentDTO studentDTO){
        studentRepo.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }

    public boolean deleteStudent(StudentDTO studentDTO){
        studentRepo.delete(modelMapper.map(studentDTO, Student.class));
        return true;
    }

    public StudentDTO getStudentByIndexNo(String studentIndex){
        Student student=studentRepo.getStudentByIndexNo(studentIndex);
        return modelMapper.map(student, StudentDTO.class);
    }
}
