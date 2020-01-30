package com.example.demo.controller;

import com.example.demo.configuration.BasicConfiguration;
import com.example.demo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ConfigController
{
    @Autowired
    private BasicConfiguration basicConfiguration;
    @GetMapping(Constants.CONFIG)
    public HashMap getConfig()
    {
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("machine", basicConfiguration.getMachineInfo());
        return hmap;
    }

    @Value("${owner.name}")
    private String ownerName;
    @GetMapping("/config")
    public String getOwnerName()
    {
        return "Owner Name : "+ ownerName;
    }
}
