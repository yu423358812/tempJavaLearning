package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Fintech;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FintechRepository extends MongoRepository<Fintech, String> {

        Fintech save(Fintech fintech);

        List<Fintech> findByCompanyNameInIgnoreCase(String name);
}
