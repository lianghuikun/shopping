package com.shopping.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.shopping.dao")
public class MyBatisConfig {
}
