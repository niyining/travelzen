package com.ztravel.common.resource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource({"classpath:spring/ztr-resource-mvc.xml","classpath:spring/front-exception-handler-bean.xml"})
public class FrontResourceMvcConfig {

}
