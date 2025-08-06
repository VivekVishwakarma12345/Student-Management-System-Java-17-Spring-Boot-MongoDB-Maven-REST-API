package JDBC_MongoDB_JAVA.JDBC.Services;
import java.util.List;
import JDBC_MongoDB_JAVA.JDBC.Model.Project_Model;
import JDBC_MongoDB_JAVA.JDBC.Repository.Project_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Project_Services {
    @Autowired
    private Project_Repository Repo;

    public Project_Model CreateStudent (Project_Model value) {
        return Repo.save(value);
    }
    public List<Project_Model> GetAllStudents() {
        return Repo.findAll();
    }
    public Project_Model GetStudentById(int id) {
        return Repo.findById(id).orElse(null);
    }
    public void DeleteStudentById(int id) {
        Repo.deleteById(id);
    }
    public Project_Model UpdateStudentById(int id, Project_Model value) {
          value.setId(id);
          Repo.save(value);
          return Repo.findById(id).orElse(null);
    }

}
