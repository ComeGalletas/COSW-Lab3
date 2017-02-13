package edu.eci.cosw.spademo;

/**
 * Created by juanpa_507 on 1/02/17.
 */
public class Task {
    private String user;
    private String description;
    private int priority;

    public Task(){}

    public Task(String description, int priority){
        this.user = "user";
        this.description = description;
        this.priority = priority;
    }

    public Task(String user, String description, int priority){
        this.user = user;
        this.description = description;
        this.priority = priority;
    }

    public String getUser(){
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
