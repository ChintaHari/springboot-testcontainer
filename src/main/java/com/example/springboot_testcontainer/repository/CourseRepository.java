package com.example.springboot_testcontainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_testcontainer.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
