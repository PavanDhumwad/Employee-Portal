package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("BAsic")
public class BasicConfiguration
{
    String machineInfo;
    /*
    s is
     */
    public String getMachineInfo() {
        return machineInfo;
    }

    public void setMachineInfo(String machineInfo) {
        this.machineInfo = machineInfo;
    }
}
