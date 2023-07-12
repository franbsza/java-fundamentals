package functional.programming.challenge.employee;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeesListProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        Employee ceo = new Employee();

        Employee manager = new Employee();
        manager.setFirstName("Patty");
        manager.setManager(ceo);
        manager.setDepartment("Finances");
        manager.setSalary(20000.0);

        Employee manager1 = new Employee();
        manager1.setFirstName("Roger");
        manager1.setManager(ceo);
        manager1.setDepartment("HR");
        manager1.setSalary(12000.0);

        Employee manager2 = new Employee();
        manager2.setFirstName("Sueli");
        manager2.setManager(ceo);
        manager2.setDepartment("IT");
        manager2.setSalary(15000.0);

        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setManager(manager1);
        employee.setDepartment("HR");
        employee.setSalary(9000.0);

        Employee employee1 = new Employee();
        employee1.setFirstName("Celeste");
        employee1.setManager(manager2);
        employee1.setDepartment("IT");
        employee1.setSalary(9000.0);

        Employee employee2 = new Employee();
        employee2.setFirstName("Maria");
        employee2.setManager(manager);
        employee2.setDepartment("Finances");
        employee2.setSalary(9000.0);

        return Stream.of(Arrays.asList(manager, manager1, manager2, employee, employee1, employee2)).map(Arguments::of);
    }
}
