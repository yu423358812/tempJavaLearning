package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.DunsInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DunsInfoRepository extends MongoRepository<DunsInfo, String> {
    DunsInfo save(DunsInfo dunsInfo);

}
