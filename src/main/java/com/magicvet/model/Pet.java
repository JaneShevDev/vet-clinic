package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Pet {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yy");
    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    private HealthState healthState;
    private final LocalDateTime registrationDate = LocalDateTime.now();

    public Pet(){}
    public Pet(HealthState healthState){
        this.healthState = healthState;
    }
    public enum HealthState {
        HEALTHY(4),
        UNHEALTHY(3),
        WELL_FEELING(2),
        CRITICAL(1);
        private final int valueHealth;
        HealthState(int valueHealth) {
            this.valueHealth = valueHealth;
        }
        public int getValueHealth() {
            return valueHealth;
        }
    }

    @Override
    public String toString(){
        return "\n\tType: " + type
                + ", Sex:  " + sex
                + ", Age: " + age
                + ", Name: " + name
                + ", HealthState: " + healthState
                + ", Registration Date: " + registrationDate.format(FORMATTER);
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}

