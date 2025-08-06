package JDBC_MongoDB_JAVA.JDBC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health_Check {
    @GetMapping("/health_Check")
    public String healthCheck() {
        return "Application is running successfully!";
    }
}
