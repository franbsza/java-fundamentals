import conditionals.EmployeeValidation;
import enums.EmployeeStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;

public class EmployeeValidationTest {

    @InjectMocks
    EmployeeValidation employeeValidation = new EmployeeValidation();

    @ParameterizedTest
    @CsvSource({"Franciele,true", "Bee,false" , "Alex,true", "Ana,false", "Az,false"})
    public void validName(String name, boolean expected){
       boolean actual = employeeValidation.isValidName(name);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"18,true", "17,false" , "90,true", "121,false", "0,false"})
    public void validAge(int age, boolean expected){
        boolean actual = employeeValidation.isValidAge(age);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"23656,true", "0,false" , "1500,true", "-1,false"})
    public void validSalary(double salary, boolean expected){
        boolean actual = employeeValidation.isValidSalary(salary);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"F,true", "C,false" , "M,true", "D,false", "T,false"})
    public void validGender(String gender, boolean expected){
        boolean actual = employeeValidation.isValidGender(gender);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"c,true", "t,false" , "s,true", "v,true", "A,false", "z,false", "d,true",})
    public void validState(char state, boolean expected){
        boolean actual = employeeValidation.isValidState(state);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(
            value = EmployeeStatus.class,
            names = {"ACTIVE", "OFF", "SUSPENDED", "VACATION"})
    public void validStatus(EmployeeStatus status){
        boolean actual = employeeValidation.isValidStatus(String.valueOf(status));
        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"off","idle", "fired" , "ON", "unknown"})
    public void invalidStatus(String status){
        boolean actual = employeeValidation.isValidStatus(status);
        Assertions.assertFalse(actual);
    }
}
