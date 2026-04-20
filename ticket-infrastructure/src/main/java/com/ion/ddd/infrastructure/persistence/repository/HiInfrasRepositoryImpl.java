package com.ion.ddd.infrastructure.persistence.repository;

import com.ion.ddd.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Service;

@Service
public class HiInfrasRepositoryImpl implements HiDomainRepository {

    @Override
    public String sayHi(String who) {
        return "Hi " + who + " from infra!";
    }

}
