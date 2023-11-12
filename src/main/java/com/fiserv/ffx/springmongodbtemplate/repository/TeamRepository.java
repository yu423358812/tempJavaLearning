package com.fiserv.ffx.springmongodbtemplate.repository;

import com.fiserv.ffx.springmongodbtemplate.model.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
    Team save(Team team);
}
