package com.tzuchaedahy.todo_list.repositories;

import com.tzuchaedahy.todo_list.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {}
