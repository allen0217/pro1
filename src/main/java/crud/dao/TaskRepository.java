package crud.dao;

import org.springframework.data.repository.CrudRepository;

import crud.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
