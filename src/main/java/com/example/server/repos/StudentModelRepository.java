package com.example.server.repos;

import com.example.server.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentModelRepository extends JpaRepository<StudentModel, Long> {
}