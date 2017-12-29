package com.springcloudify.eurekaconsumerfeign.controller;

import com.springcloudify.eurekaconsumerfeign.restInterface.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wj42134
 * @date 2017 12 29 19:22
 */
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

}
