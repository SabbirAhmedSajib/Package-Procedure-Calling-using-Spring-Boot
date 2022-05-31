package com.learning.ProcedureCalling.Procedure;

import com.learning.ProcedureCalling.Dto.Parameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;


import java.util.Optional;
@Service
@Slf4j
public class UserMasterEntryPro {



    private EntityManager oEntityManager;

    public UserMasterEntryPro(EntityManager oEntityManager) {
        this.oEntityManager = oEntityManager;
    }

    public Parameter dprInsertUserMaster(Parameter parameters) {


        Parameter returnObj = new Parameter();


        StoredProcedureQuery storedProcedureQuery = oEntityManager.createStoredProcedureQuery("LOCKER.dpk_usermgt_insupd.DPR_INSERT_SYUSRMAS");


        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(15, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(16, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(17, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(18, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(19, String.class, ParameterMode.IN);

        storedProcedureQuery.registerStoredProcedureParameter(20, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(21, String.class, ParameterMode.OUT);

        System.out.println("parameters.getUserCode(): " + parameters.getUserCode());
        System.out.println("parameters.getUserName(): " + parameters.getUserName());
        System.out.println("parameters.getUserPawd(): " + parameters.getUserPawd());
        System.out.println("parameters.getPaswDate(): " + parameters.getPaswDate());
        System.out.println("parameters.getValdflag(): " + parameters.getValdflag());
        System.out.println("parameters.getStatDate(): " + parameters.getStatDate());
        System.out.println("parameters.getDivnCode(): " + parameters.getDivnCode());
        System.out.println("parameters.getUserType(): " + parameters.getUserType());
        System.out.println("parameters.getStarTime(): " + parameters.getStarTime());
        System.out.println("parameters.getStopTime(): " + parameters.getStopTime());
        System.out.println("parameters.getOprStamp(): " + parameters.getOprStamp());
        System.out.println("parameters.getTimStamp(): " + parameters.getTimStamp());
        System.out.println("parameters.getExpDate(): " + parameters.getExpDate());
        System.out.println("parameters.getEmpCode(): " + parameters.getEmpCode());
        System.out.println("parameters.getGrupcode(): " + parameters.getGrupcode());
        System.out.println("parameters.getEmplydob(): " + parameters.getEmplydob());
        System.out.println("parameters.getEmailId1(): " + parameters.getEmailId1());
        System.out.println("parameters.getAddRess1(): " + parameters.getAddRess1());
        System.out.println("parameters.getTellNumber(): " + parameters.getTellNumber());

        storedProcedureQuery.setParameter(1, Optional.ofNullable(parameters.getUserCode()).orElse(""));
        storedProcedureQuery.setParameter(2, Optional.ofNullable(parameters.getUserName()).orElse(""));
        storedProcedureQuery.setParameter(3, Optional.ofNullable(parameters.getUserPawd()).orElse(""));

        storedProcedureQuery.setParameter(4, parameters.getPaswDate());
        //storedProcedureQuery.setParameter(4, 2022-05-17);

        storedProcedureQuery.setParameter(5, Optional.ofNullable(parameters.getValdflag()).orElse(""));
        storedProcedureQuery.setParameter(6, parameters.getStatDate());
        // storedProcedureQuery.setParameter(6, 2022-05-17);
        storedProcedureQuery.setParameter(7, Optional.ofNullable(parameters.getDivnCode()).orElse(""));
        storedProcedureQuery.setParameter(8, Optional.ofNullable(parameters.getUserType()).orElse(""));
        storedProcedureQuery.setParameter(9, Optional.ofNullable(parameters.getStarTime()).orElse(""));
        storedProcedureQuery.setParameter(10, Optional.ofNullable(parameters.getStopTime()).orElse(""));
        storedProcedureQuery.setParameter(11, Optional.ofNullable(parameters.getOprStamp()).orElse(""));
        storedProcedureQuery.setParameter(12, parameters.getTimStamp());
        // storedProcedureQuery.setParameter(12,2022-05-17);


        // storedProcedureQuery.setParameter(13, 2022-05-17);
        storedProcedureQuery.setParameter(13, parameters.getExpDate());

        storedProcedureQuery.setParameter(14, Optional.ofNullable(parameters.getEmpCode()).orElse(""));

        //storedProcedureQuery.setParameter(15, 2022-05-17);
        storedProcedureQuery.setParameter(15, parameters.getEmplydob());
        storedProcedureQuery.setParameter(16, Optional.ofNullable(parameters.getGrupcode()).orElse(""));
        storedProcedureQuery.setParameter(17, Optional.ofNullable(parameters.getAddRess1()).orElse(""));
        storedProcedureQuery.setParameter(18, Optional.ofNullable(parameters.getEmailId1()).orElse(""));
        storedProcedureQuery.setParameter(19, Optional.ofNullable(parameters.getTellNumber()).orElse(""));

        try {
            storedProcedureQuery.execute();
            returnObj.setSourceFlag((String) storedProcedureQuery.getOutputParameterValue(20));
            returnObj.setSourceData((String) storedProcedureQuery.getOutputParameterValue(21));


        } catch (Exception e) {

            //returnObj.setSourceFlag((String) storedProcedureQuery.getOutputParameterValue(20));
            //returnObj.setSourceData((String) storedProcedureQuery.getOutputParameterValue(21));
           returnObj.setSourceFlag((String) "1");
            returnObj.setSourceData((String) "Exception happen");

            e.printStackTrace();

        }
        System.out.println("storedProcedureQueryOut.setSourceFlag: " + (String) storedProcedureQuery.getOutputParameterValue(20));
        System.out.println("storedProcedureQueryOut.setSourceData: " + (String) storedProcedureQuery.getOutputParameterValue(21));

        return returnObj;
    }
}
