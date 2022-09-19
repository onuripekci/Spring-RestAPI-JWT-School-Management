package com.works.restcontrollers;

import com.works.services.ManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/manager")
public class ManagerRestController {

    final ManagerService mService;
    public ManagerRestController(ManagerService mService) {
        this.mService = mService;
    }

    @GetMapping("/get")
    public Map get() {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("name", "Manager");
        return hm;
    }

    @PostMapping("/imageUpload")
    public ResponseEntity imageUpload(@RequestParam String path) {
        return mService.imageUpload(path);
    }


}
