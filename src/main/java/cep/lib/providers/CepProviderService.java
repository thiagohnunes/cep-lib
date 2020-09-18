package cep.lib.providers;

import cep.lib.CepResponse;

public interface CepProviderService {
    public CepResponse consultar(String cep);
}
