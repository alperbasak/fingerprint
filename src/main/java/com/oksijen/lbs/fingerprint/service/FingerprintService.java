package com.oksijen.lbs.fingerprint.service;

import com.oksijen.lbs.fingerprint.dao.FingerprintDao;
import com.oksijen.lbs.fingerprint.model.Fingerprint;
import com.oksijen.lbs.fingerprint.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("fingerprintService")
@Transactional
public class FingerprintService {

    private final FingerprintDao fingerprintDao;

    @Autowired
    public FingerprintService(FingerprintDao fingerprintDao) {
        this.fingerprintDao = fingerprintDao;
    }

//    public boolean insertMeasurements() {
//        //get file
//        //convert to Fingerprint instances
//        return fingerprintDaoImpl.insertMeasurements();
//    }

    public Position findPosition(int cid, double dbm) {
            int key = 0;
            double diff;
            double diffNew=100;
            for (Fingerprint fp:fingerprints.values()) {
                if(fp.getCid()==cid){
                    if((diff=Math.abs(fp.getSignal()-dbm))<diffNew) {
                        diffNew = diff;
                        key=fp.getId();
                    }
                }
            return fingerprints.get(key).getPosition();
        }

        return fingerprintDao.findPosition(cid,dbm);
    }

    public Fingerprint getById(int id){
        return fingerprintDao.findOne(id);
    }
}
