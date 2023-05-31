package com.sangamone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
