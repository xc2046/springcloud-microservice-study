package com.xc.consumer.feign;

import com.xc.consumer.config.FeignConfiguration;
import com.xc.consumer.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {
    @RequestLine("GET/{id}")
    User findById(@Param("id") Long id);

}
