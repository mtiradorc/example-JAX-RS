/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.proyect.client.dto.ClienteDto;
import java.lang.reflect.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MTIRADORC
 */
public class Testmain {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/mavenproject4/rest/api/cliente");
            //URL url = new URL("http://localhost/servicesApi/cliente.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()), "UTF-8"));

            String output = null;
            String result = "";
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                result = output;
                System.out.println(result);
            }
            Gson gson = new Gson();
            Type founderListType = new TypeToken<Map<String, List<ClienteDto>>>(){}.getType(); 
            Map <String, List<ClienteDto>> param = gson.fromJson(result, founderListType);  
            for (ClienteDto arg : param.get("cliente")) {
                System.out.println(arg.toString());
            }
            
            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}
