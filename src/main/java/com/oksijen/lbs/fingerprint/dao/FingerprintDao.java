package com.oksijen.lbs.fingerprint.dao;

import com.oksijen.lbs.fingerprint.model.Fingerprint;
import com.oksijen.lbs.fingerprint.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FingerprintDao extends JpaRepository<Fingerprint, Integer>{

//    boolean insertMeasurements();

    Position findPosition(int cid, double dbm);

}
