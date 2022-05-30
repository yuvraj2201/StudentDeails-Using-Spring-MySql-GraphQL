package queryResolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphQL.representation.StudentRepresentation;
import com.graphQL.requestSamples.FullNameParams;
import com.graphQL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    StudentService studentService;

    public String firstQuery() {
        return "Hello Buddy";
    }

    public String fullName(String firstName,String lastName){
        return firstName +" "+lastName;
    }

    public String getFullName(FullNameParams request){
        return request.getFirstName()+" "+request.getLastName();
    }

    public StudentRepresentation getstudent(int id){ return new StudentRepresentation(studentService.getStudentById(id));

    }
}
