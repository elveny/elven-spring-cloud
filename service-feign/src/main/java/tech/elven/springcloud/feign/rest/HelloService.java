/**
 * msxf.com Inc.
 * Copyright (c) 2017-2026 All Rights Reserved.
 */
package tech.elven.springcloud.feign.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Filename HelloService.java
 * @description
 * @Version 1.0
 * @author qiusheng.wu
 * @History
 * <br/>
 * <li>Author: qiusheng.wu</li>
 * <li>Date: 2017/9/19 19:53</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@FeignClient(value = "elven-spring-cloud-serviceA")
public interface HelloService {
    @RequestMapping(value = "/cloud.elven.tech/serviceA/rest/hello/hello",method = RequestMethod.GET)
    String hello();
}