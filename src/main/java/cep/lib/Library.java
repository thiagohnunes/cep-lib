package cep.lib;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class ViaCep {
    private final String logradouro;
    private final String bairro;
    private final String cidade;
    private final String uf;

    public ViaCep(String[] array) {
        logradouro = array[7];
        bairro = array[15];
        cidade = array[19];
        uf = array[23];
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "ViaCep{" +
                "logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}

public class Library {

    private final String cep = "38412104";
    private URL url;
    String json;

    public static void main(String[] args) {
        new Library();
    }

    {
        try {
            url = new URL("http://viacep.com.br/ws/${cep}/json".replace("${cep}", cep));
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonB = new StringBuilder();

            reader.lines().forEach(l->{
                jsonB.append(l.trim());
            });

            json = jsonB.toString();

            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");
            String array[] = new String[30];
            array = json.split("\n");

            ViaCep cep = new ViaCep(array);

            System.out.println(cep);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean someLibraryMethod() {
        return true;
    }
}
