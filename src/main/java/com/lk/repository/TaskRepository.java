package com.lk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lk.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
