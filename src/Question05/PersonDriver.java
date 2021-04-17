/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author S542263
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Solution for Question 5");
        Person person = new Person("Varshith","Horizons","4754557384","s542263@nwmissouri.edu");
        Student student = new Student("A","Bairy","Horizons","4845466475","s100210@nwmissouri.edu");
        Employee employee = new Employee("TCS",5000,"01/01/2019","Ravi","Hyderabad","7989973530","varshith.reddy@tcs.com");
        Faculty faculty = new Faculty(8,2,"North West Missouri",5000,"01/01/2017","Revanth","Maryville","800-223-3333","S123456@nwmissouri.edu");
        Staff staff = new Staff("Associate Professor","North West Missouri",7000,"01/01/2015","ABC","Maryville","123-234-3456","abc@nwmissouri.edu");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
    
}
