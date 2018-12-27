package Entity;

public class Student {
    private int id;
    private String name;
    private int sem;
 
    public Student() {}
    
    public Student(int id , String name , int sem) {
    	this.id = id;
    	this.name = name;
    	this.sem = sem;
    }
    
    public int getId() {
    	return this.id;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public int getSem() {
    	return this.sem;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    public void setSem(int sem) {
    	this.sem = sem;
    }
}