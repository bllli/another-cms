package cn.bllli.cms.anothercms;

import cn.bllli.cms.anothercms.user.entity.User;
import cn.bllli.cms.anothercms.user.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AnotherCmsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    IUserService userService;

    @Test
    void createUser() {
        User user = new User();
        user.setUserName("hahah");

        System.out.println(user);
        userService.save(user);

        System.out.println(user);

    }

}
