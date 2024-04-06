package com.SCTT.SMS.service;

import com.SCTT.SMS.dto.AdminDTO;
import com.SCTT.SMS.entity.Admin;
import com.SCTT.SMS.repo.AdminRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private ModelMapper modelMapper;

    public AdminDTO saveCourse(AdminDTO adminDTO){
     adminRepo.save(modelMapper.map(adminDTO, Admin.class));
     return (adminDTO);


    }
public boolean findByUserNameAndCourseName(String username, String password){
    Admin admin = adminRepo.findByUserNameAndCourseName(username, password);
    if (admin == null) {
        return false; // User not found
    } else if (!admin.getPassword().equals(password) || !admin.getUserName().equals(username)) {
        return  false;
        
    } else{
        return  true;
    }
}
}
