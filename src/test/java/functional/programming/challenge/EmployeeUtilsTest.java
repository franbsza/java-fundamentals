package functional.programming.challenge;
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
        manager.setJobTitle("CEO");

        manager1 = new Employee();
        manager1.setFirstName("Roger");
        manager1.setLastName("Westbay");
        manager1.setJobTitle("HR Director");
        manager1.setManager(manager);
        manager1.setDepartment("HR");

        manager2 = new Employee();
        manager2.setFirstName("Sueli");
        manager2.setLastName("Barros");
        manager2.setJobTitle("IT TeamLeader");
        manager2.setManager(manager);
        manager2.setDepartment("IT");

        employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");
        employee.setYearsOfService(20);
        employee.setNumberOfDirectReports(5);
        employee.setJobTitle("HeadHunter I");
        employee.setManager(manager1);
        employee.setDepartment("HR");

        employee2 = new Employee();
        employee2.setFirstName("Celeste");
        employee2.setLastName("Pattison");
        employee2.setYearsOfService(1);
        employee2.setNumberOfDirectReports(3);
        employee2.setJobTitle("Developer II");
        employee2.setManager(manager2);
        employee2.setDepartment("IT");

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
        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when employee has been employed less than five years")
    void employeeInEmploymentLessThanFiveYears() {
        employee.setYearsOfService(3);
        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return false when employee has more than three direct reports")
    void employeeHasMoreThanThreeDirectReports() {
        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when employee has less than three direct reports")
    void employeeHasLessThanThreeDirectReports() {
        employee.setNumberOfDirectReports(1);
        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);
        assertFalse(actual);
    }

    @Test
    @DisplayName("should return true when employee who has more than three years of service and less than two direct reports")
    void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        employee.setNumberOfDirectReports(1);
        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false when employee who has more than three years of service and more than two direct reports")
    void employeeHasMoreThanThreeYearsOfServiceAndMoreThanTwoDirectReports() {

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

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
}
