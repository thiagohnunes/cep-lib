package cep.lib;

import cep.lib.providers.viacep.ViaCepResponse;

public class CepResponse {

    private String rua;
    private String complemento;
    private String cidade;
    private String estado;
    private String ibge;

    public CepResponse(ViaCepResponse response) {
        this.rua = response.getLogradouro();
        this.complemento = response.getComplemento();
        this.cidade = response.getLocalidade();
        this.estado = response.getUf();
        this.ibge = response.getIbge();
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    @Override
    public String toString() {
        return "CepResponse{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", ibge='" + ibge + '\'' +
                '}';
    }
}
