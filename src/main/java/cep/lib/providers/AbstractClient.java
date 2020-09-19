package cep.lib.providers;

import cep.lib.exceptions.InvalidUrlException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AbstractClient {

    public String get(final String urlString) {
        URL url = null;
        String json = "";
        try {
            url = new URL(urlString);
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonB = new StringBuilder();

            reader.lines().forEach(l -> {
                jsonB.append(l.trim());
            });

            json = jsonB.toString();
        } catch (MalformedURLException e) {
            throw new InvalidUrlException("Invalid URL");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }
}
