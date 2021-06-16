package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Mission {

    @SerializedName("level")
    @Expose
    private Integer      level;
    @SerializedName("name")
    @Expose
    private String       name;
    @SerializedName("time")
    @Expose
    private Integer      time;
    @SerializedName("reward")
    @Expose
    private Integer      reward;
    @SerializedName("is_open")
    @Expose
    private Boolean      isOpen;
    @SerializedName("tasks")
    @Expose
    private List<String> tasks = null;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public String toString() {
        return name + " Time:" + time + " - Reward:" + reward + (isOpen ? " - Opened" : " - Closed") + " - Tasks Count: " + tasks.size();
    }
}