package lan.network.sandbox.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task{

    @Id
    private long id;
    private String description;
  
}
