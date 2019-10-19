package cn.bllli.cms.anothercms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bllli.cms.anothercms.user.mapper")
public class AnotherCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherCmsApplication.class, args);
    }

}
