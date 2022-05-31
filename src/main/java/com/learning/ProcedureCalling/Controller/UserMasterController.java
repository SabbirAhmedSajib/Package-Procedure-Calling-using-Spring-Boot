package com.learning.ProcedureCalling.Controller;

import com.learning.ProcedureCalling.Dto.Parameter;
import com.learning.ProcedureCalling.Procedure.UserMasterEntryPro;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin
@RequestMapping("/Api")
@Slf4j
public class UserMasterController {

    private final UserMasterEntryPro userMasterEntryPro;

    public UserMasterController(UserMasterEntryPro userMasterEntryPro) {
        this.userMasterEntryPro = userMasterEntryPro;
    }

    @PostMapping("/userMasterEntry")
    public Map<String, Object> UserMasterCreation(@RequestBody Parameter parameters) {
        Map<String, Object> map = new HashMap<>();
        Parameter returnObj = userMasterEntryPro.dprInsertUserMaster(parameters);
        map.put("sourceFlag", returnObj.getSourceFlag());
        map.put("sourceData", returnObj.getSourceData());
        return map;
    }
}
