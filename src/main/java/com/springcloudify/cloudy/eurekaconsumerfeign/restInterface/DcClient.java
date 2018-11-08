package com.springcloudify.cloudy.eurekaconsumerfeign.restInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wj42134
 * @date 2017 12 29 19:21
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

}
