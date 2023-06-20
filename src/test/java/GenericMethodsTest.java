import generics.BusinessClient;
import generics.Client;
import generics.GenericMethods;
import generics.PersonalClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GenericMethodsTest {

    GenericMethods genericMethods = new GenericMethods();

    @Test
    @DisplayName("test convert array to list with generic method")
    void convertArrayToList(){
        Integer[] numberList = {1,2,3};
        String[] fruits = {"apple, orange, banana"};
        Assertions.assertNotNull(genericMethods.convertArrayToList(fruits));
        Assertions.assertNotNull(genericMethods.convertArrayToList(numberList));
    }

    @Test
    @DisplayName("test uppercase elements with generic method")
    void uppercaseEachElement(){
        PersonalClient personalClient = new PersonalClient();
        personalClient.setName("maria");
        BusinessClient businessClient = new BusinessClient();
        businessClient.setName("linkedin");

        List<Client> clients = Arrays.asList(personalClient, businessClient);

        List<Client> clientList = genericMethods.uppercaseEachElement(clients);

        Assertions.assertEquals("MARIA", clientList.get(0).getName());
        Assertions.assertEquals("LINKEDIN", clientList.get(1).getName());
    }
}
