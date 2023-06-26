package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GenericMethodsTest {

    GenericMethods genericMethods = new GenericMethods();
    List<Client> clients;

    @BeforeEach
    void setup(){
        PersonalClient personalClient = new PersonalClient();
        personalClient.setName("maria");
        personalClient.setPersonalIDNumber("48869118037");
        BusinessClient businessClient = new BusinessClient();
        businessClient.setName("linkedin");
        businessClient.setBusinessIDNumber("13638767000192");

        clients = Arrays.asList(personalClient, businessClient);
    }

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
        List<Client> clientList = genericMethods.uppercaseEachElement(clients);
        Assertions.assertEquals("MARIA", clientList.get(0).getName());
        Assertions.assertEquals("LINKEDIN", clientList.get(1).getName());
    }

    @Test
    @DisplayName("should return the type of each client")
    void checkAllTypeClients(){
        List<String> clientList = genericMethods.checkAllTypeClients(clients);
        Assertions.assertEquals(Arrays.asList("personal", "business"), clientList);
    }

    @Test
    @DisplayName("should return true when validate all clients")
    void checkValidIdNumber(){
        boolean valid = genericMethods.checkValidIdNumber(clients);
        Assertions.assertTrue(valid);
    }

    @Test
    @DisplayName("should return an exception when validate all clients")
    void checkValidIdNumberError(){
        BusinessClient businessClient = new BusinessClient();
        businessClient.setName("Americanas");
        businessClient.setBusinessIDNumber("123");

        Assertions.assertThrows(IllegalArgumentException.class, () -> genericMethods.checkValidIdNumber(Arrays.asList(businessClient)));
    }
}
