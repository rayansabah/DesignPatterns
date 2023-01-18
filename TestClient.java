public class TestClient {
    public static void main(String[] args) {
    	
    	// Test for adding a person and a role 
        Employee emp1 = new Employee("Isac johansson", "The Role Dep", new Role("Engineer")); 
        System.out.println(emp1);
        
        //Test for adding a role to an existing person
        emp1.addRole(new Role("Manager"));
        System.out.println(emp1);
        
        

    }
}