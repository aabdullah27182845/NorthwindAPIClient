package com.sparta.northwindapi.jacksonfilestest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.northwindapi.jacksonfiles.CustomerJSON;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

public class CustomerTest {

    @Test
    void checkValue() {
        ObjectMapper mapper = new ObjectMapper();
        CustomerJSON customer = null;
        try {
            customer = mapper.readValue(new URL("http://localhost:8080/customer/id/CACTU"),
                    CustomerJSON.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals( "Cactus Comidas para llevar", customer.getCompanyName());
    }
}
