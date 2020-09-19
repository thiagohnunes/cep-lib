package cep.lib.providers.viacep;

import cep.lib.providers.AbstractClient;

public class ViaCepClient {

    private final String URL = "http://viacep.com.br/ws/${cep}/json";

    public ViaCepResponse findCep(final String cep) {

        String retorno = new AbstractClient().get(URL.replace("${cep}", cep));

        return new ViaCepResponse(toArray(retorno));

    }

    private String[] toArray(String value) {
        value = value.replaceAll("[{},:]", "");
        value = value.replaceAll("\"", "\n");
        String array[] = new String[30];
        return value.split("\n");
    }
}
