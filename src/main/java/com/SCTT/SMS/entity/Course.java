package com.SCTT.SMS.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "course")

public class Course {
    @Id
    @Column(name="index_no")
    private String indexNo;
    @Column(name="semester")
    private String semester;
    @Column(name="course_1")
    private String course1;
    @Column(name="course_2" )
    private String course2;
    @Column(name="course_3")
    private String course3;
    @Column(name="course_4")
    private String course4;
    @Column(name="course_5")
    private String course5;
    @Column(name="course_6")
    private String course6;
    @Column(name="course_7")
    private String course7;
    @Column(name="course_8")
    private String course8;
}
