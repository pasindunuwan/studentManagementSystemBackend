package com.SCTT.SMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

        private String indexNo;
        private String firstName;
        private String lastName;
        private String bod;
        private String address;
        private String degree;
        private String nic;
        private String gender;

}
