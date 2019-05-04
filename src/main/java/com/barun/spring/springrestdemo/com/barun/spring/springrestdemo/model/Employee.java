package com.barun.spring.springrestdemo.com.barun.spring.springrestdemo.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="tb_employee")
@Data
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    @Column(name="EMPLOYEE_NAME")
    private String employeeName;
    @Column(name="DOB")
    private String dob;
    @Column(name="CONTACT_NUMBER")
    private String contactNumber;
}
