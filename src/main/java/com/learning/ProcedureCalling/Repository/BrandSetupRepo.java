package com.learning.ProcedureCalling.Repository;

import com.learning.ProcedureCalling.Entity.BrandSetupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandSetupRepo extends JpaRepository<BrandSetupEntity,String> {

    BrandSetupEntity findByBrdcod(String brdcod);
}
