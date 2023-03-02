package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
   public  void test(){
        Employee employee = EmployeeFactory.createEmployee("jake", "paul", "jp@gmail.com");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }
}