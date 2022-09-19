package com.works.services;

import com.works.utils.Action;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class ManagerService {

    public ResponseEntity imageUpload(String path) {
        Action action = new Action(path);
        Thread th = new Thread(action);
        th.start();
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("message", "Gönderim Başladı");
        return new ResponseEntity(hm, HttpStatus.OK);
    }
}