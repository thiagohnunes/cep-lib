package cep.lib.providers.viacep;

import cep.lib.CepResponse;
import cep.lib.providers.CepProviderService;

public class ViaCepProvider implements CepProviderService {
    @Override
    public CepResponse consultar(String cep) {
        ViaCepResponse response = new ViaCepClient().findCep(cep);

        return new CepResponse(response);
    }
}
