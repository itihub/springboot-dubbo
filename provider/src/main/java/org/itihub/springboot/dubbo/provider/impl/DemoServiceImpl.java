package org.itihub.springboot.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.itihub.springboot.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * @Component 将此类注为Bean
 * @Service 声明暴露接口
 */
@Component
@Service(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
