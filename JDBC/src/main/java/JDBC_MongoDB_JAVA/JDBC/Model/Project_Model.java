package JDBC_MongoDB_JAVA.JDBC.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Model_Project")
public class Project_Model {
    @Id
    private int id;
    private String name;
    private String description;
    private int age;
    private int yearOfCompletion;
    private int yearOfAdmission;
    private String branch;

    // Getters and Setters
    public int getId() { return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfCompletion() {
        return yearOfCompletion;
    }

    public void setYearOfCompletion(int yearOfCompletion) {
        this.yearOfCompletion = yearOfCompletion;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getBranch() { return branch;}

    public void setBranch(String value) {
        branch = value;
    }


}
