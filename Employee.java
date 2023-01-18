import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    
    public Employee(String name, String department, Role initialRole){
  	    this.name = name;
  	    this.department = department;
  	    roles = new ArrayList<Role>();
  	    addRole(initialRole);
  	    
  	  }
    
    
    public String name(){ 
  	  return name; }
    
    public String department(){ 
  	  return department; }
    
    public void addRole(Role theNewRole){
  	    this.roles.add(theNewRole);
  	  }
    
    @Override
    public String toString(){
      return String.format("%s at %s employed is %s", name, department, roles);
    }
  }