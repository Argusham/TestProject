package za.ca.cput.factory;

import za.ca.cput.domain.Employee;
import za.ca.cput.util.Helper;

public class EmployeeFactory {
    public  static Employee createEmployee(String firstName, String lastName, String email) {

        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)) {
            return null;
        }
        String employeeNumber = Helper.generateId();

        if(!Helper.isValid(email)){
            return null;
        }

        Employee employee = new Employee.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmployeeNumber(employeeNumber)
                .setEmail(email)
                .build();

                return employee;
    }
}
