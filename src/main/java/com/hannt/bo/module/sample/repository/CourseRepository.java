package com.hannt.bo.module.sample.repository;

import com.hannt.bo.module.sample.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
