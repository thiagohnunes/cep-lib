package cep.lib;

import cep.lib.providers.CepProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {
    @Test
    void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void teste() {

        CepResponse viaCepResponse = new Cep.Builder(CepProvider.VIA_CEP).consultar("4646");
        System.out.println(
                viaCepResponse
        );
    }
}
