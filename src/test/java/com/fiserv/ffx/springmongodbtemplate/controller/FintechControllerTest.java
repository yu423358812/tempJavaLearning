package com.fiserv.ffx.springmongodbtemplate.controller;

import com.fiserv.ffx.springmongodbtemplate.controller.v1.FintechController;
import com.fiserv.ffx.springmongodbtemplate.model.entity.Fintech;
import com.fiserv.ffx.springmongodbtemplate.service.FintechService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FintechControllerTest {

    @InjectMocks
    FintechController fintechController;

    @Mock
    FintechService fintechService;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void test_save(){
        Mockito.when(fintechService.save(Mockito.any(Fintech.class))).thenReturn(Fintech.builder().build());
        Fintech result = fintechController.save(Mockito.mock(Fintech.class));
        Assertions.assertNotNull(result);
    }

    @Test
    void test_update(){
        Mockito.when(fintechService.update(Mockito.any(Fintech.class))).thenReturn(Fintech.builder().build());
        Fintech result = fintechController.update(Mockito.mock(Fintech.class));
        Assertions.assertNotNull(result);
    }

    @Test
    void test_findByName(){
            List<Fintech> fintechList = new ArrayList<>();
            fintechList.add(Fintech.builder().build());
            Mockito.when(fintechService.findByName(Mockito.anyString())).thenReturn(fintechList);
           List<Fintech> fintechs = fintechController.findByName("Fintech");
           Assertions.assertNotNull(fintechs);
    }

    @Test
    void test_findById(){
        Mockito.when(fintechService.findById(Mockito.anyString())).thenReturn(Fintech.builder().build());
        Fintech fintechs = fintechController.findById("1234");
        Assertions.assertNotNull(fintechs);
    }
    @Test
    public void testGetHealth() throws Exception {
        final CompletableFuture<ResponseEntity<String>> future = this.fintechController.getHealth();
        final ResponseEntity<String> result = future.get();
        assertNotNull(result);
        assertEquals(HttpStatus.OK.value(), result.getStatusCode().value());
        assertEquals("OK", result.getBody());
    }
    @Test
    public void testGetLiveStatus() throws Exception {
        final CompletableFuture<ResponseEntity<String>> future = this.fintechController.getLiveStatus();
        final ResponseEntity<String> result = future.get();
        assertNotNull(result);
        assertEquals(HttpStatus.OK.value(), result.getStatusCode().value());
        assertEquals("OK", result.getBody());
    }
}
