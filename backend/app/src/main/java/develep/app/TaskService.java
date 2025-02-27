package develep.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.util.List;
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }
    public List<Task>  getTasks(){
        return taskRepository.findAll();
    }
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

}
