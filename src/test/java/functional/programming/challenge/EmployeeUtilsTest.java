package functional.programming.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeUtilsTest {
    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    void employeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");

        String actual = employeeUtils.getFullName(employee);

        assertEquals("Jerome Donaldson",actual);
    }

    @Test
    void employeeManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Westbay");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagersLastName(employee1);

        assertEquals("Westbay", actual);
    }

    @Test
    void employeeInEmploymentLongerThanFiveYears() {
        Employee employee = new Employee();
        employee.setYearsOfService(20);

        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

        assertTrue(actual);
    }

    @Test
    void employeeInEmploymentLessThanFiveYears() {
        Employee employee = new Employee();
        employee.setYearsOfService(3);

        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

        assertFalse(actual);
    }

    @Test
    void employeeHasMoreThanThreeDirectReports() {
        Employee employee = new Employee();
        employee.setNumberOfDirectReports(5);

        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);

        assertTrue(actual);
    }

    @Test
    void employeeHasLessThanThreeDirectReports() {
        Employee employee = new Employee();
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);

        assertFalse(actual);
    }

    @Test
    void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(5);
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertTrue(actual);
    }

    @Test
    void employeeHasLessThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(1);
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertFalse(actual);
    }

    @Test
    void employeeHasMoreThanThreeYearsOfServiceAndMoreThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(10);
        employee.setNumberOfDirectReports(5);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertFalse(actual);
    }

}
