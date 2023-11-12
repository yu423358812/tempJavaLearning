package com.fiserv.ffx.springmongodbtemplate.controller.v1;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Fintech;
import com.fiserv.ffx.springmongodbtemplate.service.FintechService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import static java.util.concurrent.CompletableFuture.completedFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@Slf4j
@RequestMapping("/v1/fintechs")
@AllArgsConstructor
public class FintechController {
    private FintechService fintechService;
    @PostMapping("/save")
    public Fintech save(@RequestBody Fintech fintech){
        return fintechService.save(fintech);
    }

    @PutMapping("/update")
    public Fintech update(@RequestBody Fintech fintech){
        return fintechService.update(fintech);
    }

    @GetMapping(value = "/findByName/{name}")
    public List<Fintech> findByName(@PathVariable("name") String name) {
        return fintechService.findByName(name);
    }

    @GetMapping(value = "/findById/{id}")
    public Fintech findById(@PathVariable("id") String id){
        return fintechService.findById(id);
    }

    @GetMapping("/health")
    public CompletableFuture<ResponseEntity<String>> getHealth() {
        log.info("Invoking service: GET /health");
        return completedFuture(ResponseEntity.ok().body("OK"));
    }

    @GetMapping("/live")
    public CompletableFuture<ResponseEntity<String>> getLiveStatus() {
        log.info("Invoking service: GET /live");
        return completedFuture(ResponseEntity.ok().body("OK"));
    }
}
