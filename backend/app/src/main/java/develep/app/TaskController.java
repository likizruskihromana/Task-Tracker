package develep.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/getAll")
    public List<Task> getTasks(){
    return taskService.getTasks();
    }
    @PostMapping("/save")
    public void saveTask(Task task){
        taskService.saveTask(task);
    }
}
