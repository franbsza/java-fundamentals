package functional.programming.employee;
import functional.programming.challenge.employee.Employee;
import functional.programming.challenge.employee.EmployeeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeUtilsTest {
    private EmployeeUtils employeeUtils = new EmployeeUtils();
    Employee employee;
    Employee employee2;
    Employee manager;
    Employee manager1;
    Employee manager2;
    List<Employee> employees;

    @BeforeEach
    void setup(){
        manager = new Employee();

        manager1 = new Employee();
        manager1.setFirstName("Roger");
        manager1.setLastName("Westbay");
        manager1.setManager(manager);
        manager1.setDepartment("HR");
        manager1.setSalary(12000.0);

        manager2 = new Employee();
        manager2.setFirstName("Sueli");
        manager2.setLastName("Barros");
        manager2.setManager(manager);
        manager2.setDepartment("IT");
        manager2.setSalary(15000.0);

        employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");
        employee.setYearsOfService(20);
        employee.setNumberOfDirectReports(5);
        employee.setManager(manager1);
        employee.setDepartment("HR");
        employee.setSalary(9000.0);

        employee2 = new Employee();
        employee2.setFirstName("Celeste");
        employee2.setLastName("Pattison");
        employee2.setYearsOfService(1);
        employee2.setNumberOfDirectReports(3);
        employee2.setManager(manager2);
        employee2.setDepartment("IT");
        employee2.setSalary(9000.0);

        employees = Arrays.asList(manager1, manager2, employee, employee2);
    }

    @Test
    @DisplayName("should return fullname employee")
    void employeeFullName() {
        String actual = employeeUtils.getFullName(employee);
        assertEquals("Jerome Donaldson",actual);
    }

    @Test
    @DisplayName("should return manager's last name")
    void employeeManagersLastName() {
        String actual = employeeUtils.getManagersLastName(employee);
        assertEquals("Westbay", actual);
    }

    @Test
    @DisplayName("should return false when employee has been employed longer than five years")
    void employeeInEmploymentLongerThanFiveYears() {
        boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when employee has been employed less than five years")
    void employeeInEmploymentLessThanFiveYears() {
        employee.setYearsOfService(3);
        boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return false when employee has more than three direct reports")
    void employeeHasMoreThanThreeDirectReports() {
        boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when employee has less than three direct reports")
    void employeeHasLessThanThreeDirectReports() {
        employee.setNumberOfDirectReports(1);
        boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return true when employee who has more than three years of service and less than two direct reports")
    void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        employee.setNumberOfDirectReports(1);
        boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when employee who has more than three years of service and more than two direct reports")
    void employeeHasMoreThanThreeYearsOfServiceAndMoreThanTwoDirectReports() {

        boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertAll("employee",
                () -> assertTrue(employee.getYearsOfService() > 3),
                () -> assertFalse(employee.getNumberOfDirectReports() < 2));

        assertFalse(actual);
    }


    @Test
    @DisplayName("should return a map of employees grouping by manager")
    void groupByDepartment(){
        Map<String, List<String>> mapResult = new HashMap<>();
        mapResult.put("HR", Arrays.asList("Roger", "Jerome"));
        mapResult.put("IT", Arrays.asList("Sueli", "Celeste"));

        Map<String, List<String>> groupedEmployees = employeeUtils.groupByDepartment(employees);

        assertAll("groupby department",
                () -> assertEquals(mapResult.keySet(), groupedEmployees.keySet()),
                () -> assertEquals(mapResult, groupedEmployees)
                );
    }

    @Test
    @DisplayName("should return the employees's average salary")
    void getAverageSalary(){
       assertEquals(11250.0, employeeUtils.getAverageSalary(employees));
    }
}
