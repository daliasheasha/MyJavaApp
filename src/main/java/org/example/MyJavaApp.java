
package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MyJavaApp {
    public static void main(String[] args) {
        Weather rochester = new Weather();
        rochester.setCity("Chapel Hill");
        rochester.setState("North Carolina");
        rochester.setCountry("USA");
        rochester.setForecast("Warm");

        // Convert my Rochester object to XML
        writeXML(rochester);

        // Encode/decode my forecast
        String encodedForecast = encode(rochester.getForecast());
        decode(encodedForecast);
    }

    public static void writeXML(Weather weather) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(weather, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static String encode(String originalString) {
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String:  " + encodedString);
        System.out.println("============================================");
        return encodedString;
    }

    public static String decode(String encodedString) {
        String decodedString = "";
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Encoded String:  " + encodedString);
        System.out.println("Decoded String:  " + decodedString);
        System.out.println("============================================");
        return decodedString;
    }
}
