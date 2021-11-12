package com.example.PTTKDBCLPM.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PTTKDBCLPM.model.Employee;

public interface UserRepo extends JpaRepository<Employee, Long> {

	// Employee findUserByEmployee(String username);
}
