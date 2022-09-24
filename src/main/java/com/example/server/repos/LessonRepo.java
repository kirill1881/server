package com.example.server.repos;

import com.example.server.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<LessonModel, Long> {
}
