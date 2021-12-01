import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/hello-world")
public class HelloResources {
    @GET
    @Produces("application/json")
    public List<Student> hello() {
        return Student.getStudents();
    }
}
