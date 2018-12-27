package Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentProvider studprovider;
	
	@RequestMapping("/students")
	public List<Student> getallStudents()
	{
		System.out.println(studprovider);
		return studprovider.getAllStudents();
	}
	
	@RequestMapping("/students/{id}")
	public Student getStudentFromId(@PathVariable String id) {
		return studprovider.get(Integer.parseInt(id));
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/students")
	public void addNewStudent(@RequestBody Student student) {
		studprovider.addStudents(student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/students/{id}" )
	public void deleteStudent(@PathVariable String id) {
		studprovider.deleteStudent(Integer.parseInt(id));
	}
}