import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question7 {
	
	public static class Employee implements Comparable<Employee>{
	    private int id;
	    private String name;
	    private int department;
	    private int age;
	
	  
	    public static final Comparator<Employee> AgeComparator = new Comparator<Employee>(){

	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return o1.age - o2.age;  
	        }
	      
	    };
	  
	    public static final Comparator<Employee> DepartmentComparator = new Comparator<Employee>(){

	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return o1.department- o2.department; 
	        }
	      
	    };
	  
	    public static final Comparator<Employee> NameComparator = new Comparator<Employee>(){

	        @Override
	        public int compare(Employee o1, Employee o2) {
	            return o1.name.compareTo(o2.name);
	        }
	      
	    };
	  
	   

	    public Employee(int id, String name, int department, int age) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.age = age;
	      
	    }

	    @Override
	    public String toString() {
	        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + '}';

	    }

	    @Override
	    public int compareTo(Employee o) {
	        return this.id - o.id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Employee other = (Employee) obj;
	        if (this.id != other.id) {
	            return false;
	        }
	        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
	            return false;
	        }
	        if (this.department != other.department) {
	            return false;
	        }
	        if (this.age != other.age) {
	            return false;
	        }
	        
	        return true;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 47 * hash + this.id;
	        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
	        hash = 47 * hash + this.department;
	        hash = 47 * hash + this.age;
	
	        return hash;
	    }

	}

	public static void testEmployeeSorting(){
        Employee e1 = new Employee(1, "Tom", 1000, 32);
        Employee e2 = new Employee(2, "Brianna", 1300, 22);
    
      
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);

      
        Collections.sort(listOfEmployees);     

	}
	
}

