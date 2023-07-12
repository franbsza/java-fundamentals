package functional.programming.challenge.employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeUtilsTest {
    private EmployeeUtils employeeUtils = new EmployeeUtils();
    Employee employee;
    Employee manager;

    @BeforeEach
    void setup(){
        manager = new Employee();
        manager.setLastName("Westbay");

        employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");
        employee.setYearsOfService(20);
        employee.setNumberOfDirectReports(5);
        employee.setDepartment("HR");
        employee.setSalary(9000.0);
        employee.setManager(manager);
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


    @ParameterizedTest(name = "should return a map of employees grouping by manager")
    @ArgumentsSource(EmployeesListProvider.class)
    void groupByDepartment(List<Employee> employees){
        Map<String, List<String>> mapResult = new HashMap<>();
        mapResult.put("Finances", Arrays.asList("Patty", "Maria"));
        mapResult.put("HR", Arrays.asList("Roger", "Jerome"));
        mapResult.put("IT", Arrays.asList("Sueli", "Celeste"));

        Map<String, List<String>> groupedEmployees = employeeUtils.groupByDepartment(employees);

        assertAll("groupby department",
                () -> assertEquals(mapResult.keySet(), groupedEmployees.keySet()),
                () -> assertEquals(mapResult, groupedEmployees)
                );
    }

    @ParameterizedTest(name = "should return the employees's average salary")
    @ArgumentsSource(EmployeesListProvider.class)
    void getAverageSalary(List<Employee> employees){
        Double actual = employeeUtils.getAverageSalary(employees);
        assertEquals(12334.0, actual);
    }
}
