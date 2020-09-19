package cep.lib;

import cep.lib.providers.CepProvider;
import org.junit.jupiter.api.Test;

class LibraryTest {

    @Test
    void teste() {

        CepResponse viaCepResponse = new Cep.Builder(CepProvider.VIA_CEP).consultar("38412104");
        System.out.println(
                viaCepResponse
        );
    }
}
