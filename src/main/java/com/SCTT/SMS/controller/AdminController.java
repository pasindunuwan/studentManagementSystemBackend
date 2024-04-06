package com.SCTT.SMS.controller;

import com.SCTT.SMS.dto.AdminDTO;
import com.SCTT.SMS.dto.CourseDTO;
import com.SCTT.SMS.entity.Admin;
import com.SCTT.SMS.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminService adminService;
    @PostMapping("/saveAdmin")
    public AdminDTO saveCourse(@RequestBody AdminDTO adminDTO){
        return adminService.saveCourse(adminDTO);
    }
@PostMapping("/login")
    public  ResponseEntity<String> login(@RequestBody AdminDTO adminDTO){
    String userName = adminDTO.getUserName();
    String password = adminDTO.getPassword();
    if (adminService.findByUserNameAndCourseName(userName, password)) {
        return ResponseEntity.ok("Login successful");
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
    }
}
}
