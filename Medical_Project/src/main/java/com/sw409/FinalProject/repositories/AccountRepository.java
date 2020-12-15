package com.sw409.FinalProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.FinalProject.models.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
