package cep.lib;

import cep.lib.providers.CepProvider;

public class Cep {

    static class Builder {

        private CepProvider provider;

        Builder(CepProvider provider) {
            this.provider = provider;
        }

        public CepResponse consultar(final String cep) {
            return this.provider.create().consultar(cep);
        }
    }
}