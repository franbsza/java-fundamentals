import enums.DocumentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;

public class DocumentTypeTest {

    @InjectMocks
    DocumentType documentType;

    @ParameterizedTest
    @CsvSource(value = {
            "81497655064, CPF, true",
            "814976, CPF, false",
            "188081024000163, CNPJ, true",
            "1404088081024000163546776, CNPJ, false"
            })
    @DisplayName("validation according to type of document")
    public void executeTest(String doc, String type, boolean expected){
       documentType = Enum.valueOf(DocumentType.class, type) ;
       boolean actual = documentType.validate(doc);
       Assertions.assertEquals(expected, actual);
    }
}
