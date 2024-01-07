package com.mikhailtoukach.spring.spring_dat_jpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mikhailtoukach.spring.spring_dat_jpa.entity.Employee;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByName(String name);

}
