package conditionals;
import enums.EmployeeStatus;

import java.util.Objects;

public class EmployeeValidation {

    String[] errors = new String[2];

    public boolean isValidName(String name){

        errors[0]= null;
        errors[1] = null;
        boolean match = name.matches("[A-z]*");

        if( match && name.length() > 3){
            return true;
        }
        else{
            errors[0] = "name";
            errors[1] = "The name must contain at least 4 letters.";
            return false;
        }
    }

    public boolean isValidAge(int age){

        errors[0] = null;
        errors[1] = null;
        if(age < 18 || age > 120){
            errors[0] = "age";
            errors[1] = "Age must be a number between 18 and 120.";
            return false;
        }
        return true;
    }

    public boolean isValidSalary(double salary){

        errors[0] = null;
        errors[1] = null;
        if(salary <= 0){
            errors[0] = "salary";
            errors[1] = "Salary must be greater than 0.";
            return false;
        }
        return true;
    }

    public boolean isValidGender(String gender){

        errors[0] = null;
        errors[1] = null;
        if(! (Objects.equals(gender, "F") || Objects.equals(gender, "M"))){
            errors[0] = "gender";
            errors[1] = "Gender must be F or M";
            return false;
        }
        return true;
    }

    public boolean isValidState(char state){

        errors[0] = null;
        errors[1] = null;
        char[] validStates = new char[]{
                's', 'c', 'v', 'd'
        };
        for(int i=0; i < validStates.length ; i++){

            if( Objects.equals(validStates[i], state) ){
                break;
            }
            else if (i == 3){
                errors[0] = "state";
                errors[1] = "Marital status must be 's', 'c', 'v' or 'd'";
                return false;
            }
        }
        return true;
    }

    public boolean isValidStatus(String status){

        errors[0] = null;
        errors[1] = null;

        boolean valid = false;
        EmployeeStatus[] values = EmployeeStatus.values();

       for(EmployeeStatus s : values){
           if(s.name().equals(status)){
               valid = true;
               break;
           }
        }
        if(!valid){
            errors[0] = "status";
            errors[1] = "Employe status must be 'ACTIVE', 'OFF', 'SUSPENDED' or 'VACATION'";
        }
        return valid;
    }
}
