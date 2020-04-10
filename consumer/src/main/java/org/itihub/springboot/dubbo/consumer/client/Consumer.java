package org.itihub.springboot.dubbo.consumer.client;

import com.alibaba.dubbo.config.annotation.Reference;
import org.itihub.springboot.dubbo.api.DemoService;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    // dubbo直连方式服务调用
//    @Reference(url = "dubbo://127.0.0.1:20880")

    // dubbo注册中心方式
    @Reference(interfaceClass = DemoService.class)
    private DemoService demoService;

    public void sendMessage(String message){
        String result = demoService.sayHello(message);
        System.out.println("调用dubbo服务返回值：" + result);
    }
}
