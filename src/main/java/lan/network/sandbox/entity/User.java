package lan.network.sandbox.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

    @Id
    private long id;
    private String name;
    @OneToMany
    private List<Task> tasks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    
    public List<Task> getTasks() {
        return tasks;
    }
    
    
    
}
