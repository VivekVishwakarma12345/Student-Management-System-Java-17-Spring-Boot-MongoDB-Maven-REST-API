package JDBC_MongoDB_JAVA.JDBC.Controllers;

import JDBC_MongoDB_JAVA.JDBC.Model.Project_Model;
import JDBC_MongoDB_JAVA.JDBC.Repository.Project_Repository;
import JDBC_MongoDB_JAVA.JDBC.Services.Project_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/project")
public class Project_Controller {
    @Autowired
    private Project_Services Services;

    @PostMapping
    public ResponseEntity<Project_Model> AddStudent(@RequestBody Project_Model value) {
        Project_Model createdStudent = Services.CreateStudent(value);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> GetAllStudents() {
        List<Project_Model> students = Services.GetAllStudents();
        if (students != null && !students.isEmpty()) {
            return new ResponseEntity<>(students, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Students not found", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Project_Model> GetStudentById(@PathVariable int id) {
        Project_Model student = Services.GetStudentById(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> UpdateStudentById(@PathVariable int id, @RequestBody Project_Model value){
        Project_Model student = Services.GetStudentById(id);
        if (student != null) {
            Project_Model UpdatedStudents = Services.UpdateStudentById(id, value);
            return new ResponseEntity<>(UpdatedStudents, HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteStudentById(@PathVariable int id) {
        Project_Model student = Services.GetStudentById(id);
        if (student != null) {
            Services.DeleteStudentById(id);
            return new  ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    }
}
