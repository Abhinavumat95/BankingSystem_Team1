package com.learning.repo;

import org.springframework.stereotype.Repository;


import com.learning.entity.Account;


import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	

}
