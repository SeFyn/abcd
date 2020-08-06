package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan("cn.kgc.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ClientProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientProvider1Application.class, args);
    }

}
