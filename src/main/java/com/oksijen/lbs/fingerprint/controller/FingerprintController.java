package com.oksijen.lbs.fingerprint.controller;

import com.oksijen.lbs.fingerprint.dao.FingerprintDao;
import com.oksijen.lbs.fingerprint.model.Fingerprint;
import com.oksijen.lbs.fingerprint.model.Position;
import com.oksijen.lbs.fingerprint.service.FingerprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FingerprintController {

    @Autowired
    private FingerprintService fingerprintService;

//    @RequestMapping(value = "/insert",method = RequestMethod.POST)
//    public boolean insertMeasurements(){
//        return fingerprintService.insertMeasurements();
//    }

    @RequestMapping(value = "/fp",method = RequestMethod.GET)
    public Position getPosition(@RequestParam int cid, @RequestParam double dbm) {
        return fingerprintService.findPosition(cid,dbm);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Fingerprint getById(@RequestParam int id){
        return fingerprintService.getById(id);
    }
}
