package com.curler.os.repositories;

import com.curler.os.domains.OS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OSRepository extends JpaRepository<OS,Integer>{
    
}