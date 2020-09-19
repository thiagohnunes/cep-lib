package cep.lib.providers;

import cep.lib.providers.viacep.ViaCepProvider;

public enum CepProvider {
    VIA_CEP {
        @Override
        public CepProviderService create() {
            return new ViaCepProvider();
        }
    };

    public abstract CepProviderService create();

}
