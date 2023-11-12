package com.fiserv.ffx.springmongodbtemplate.service;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Fintech;

import java.util.List;

public interface FintechService {
    Fintech save(Fintech fintech);
    List<Fintech> findByName(String name);
    Fintech findById(String id);

    Fintech update(Fintech fintech);
}
