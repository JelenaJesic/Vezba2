
package student;

public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    public Student (String firstName, String lastName,  int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLasttName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
 public void showData() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLasttName());
        System.out.println("Year of birth: "+ getYearOfBirth());
        System.out.println();
    }
    
    
    
    
    
}
