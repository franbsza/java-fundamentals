/* Enum with validation of two types of brazilian documents
*
* CPF: identify a natural person
* CNPJ: identify a legal person
* */
package enums;

public enum DocumentType {

    CPF {
        @Override
        public boolean validate(String document) {
            return document.length() == 11;
        }
    }, CNPJ {
        @Override
        public boolean validate(String document) {
            return document.length() == 15;
        }
    };

    public abstract boolean validate(String document);
}
