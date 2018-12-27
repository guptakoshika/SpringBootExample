package Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentProvider {
	public StudentProvider() {
		System.out.println("Object Created");
	}
   
	List<Student> students=new ArrayList<Student>(Arrays.asList(
			new Student(1610991464 , "koshika" , 5),
			new Student(1610991433 , "karan" , 4)));
	
	public List<Student> getAllStudents()
	{
		return students;
	}
	
	
	public Student get(int  id)
	{
		return students.stream().filter(t->t.getId() == id ).findFirst().get();
	}
	
	public void addStudents(Student student) {
		students.add(student);	
	}	
	
	public void deleteStudent(int id) {
		
		students.removeIf(t->t.getId() == id);
	}
}