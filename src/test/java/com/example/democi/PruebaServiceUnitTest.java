package com.example.democi;

import com.example.democi.service.PruebaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaServiceUnitTest extends DemoCiApplicationTests{

    @Autowired
    PruebaService pruebaService;

    @Test
    public void sumaTest(){
        assertEquals(8.0,pruebaService.suma(3.0,5.0));
    }
}
