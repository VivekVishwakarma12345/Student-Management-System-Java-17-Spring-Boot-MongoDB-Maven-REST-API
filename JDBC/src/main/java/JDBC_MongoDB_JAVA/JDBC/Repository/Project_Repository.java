package JDBC_MongoDB_JAVA.JDBC.Repository;

import JDBC_MongoDB_JAVA.JDBC.Model.Project_Model;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Project_Repository extends MongoRepository<Project_Model, Integer> {

}
