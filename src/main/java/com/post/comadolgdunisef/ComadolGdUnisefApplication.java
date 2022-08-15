package com.post.comadolgdunisef;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.post.comadolgdunisef.comadol.a.a01.impl")
@EnableJpaRepositories("com.post.comadolgdunisef.comadol.a.mapper")
//@SpringBootApplication(scanBasePackages={"com.post.comadolgdunisef.comadol.a.mapper"})
//@ComponentScan(basePackages = {"com.post.comadolgdunisef.comadol"})
//@MapperScan("com.post.comadolgdunisef.comadol.a.mapper")
//@EnableJpaRepositories(basePackages = {"com.post.comadolgdunisef.comadol.a.mapper", "com.post.comadolgdunisef"})
//@EntityScan(basePackages = {"com.post.comadolgdunisef.comadol.a.mapper", "com.post.comadolgdunisef"})
public class ComadolGdUnisefApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComadolGdUnisefApplication.class, args);
    }

}
