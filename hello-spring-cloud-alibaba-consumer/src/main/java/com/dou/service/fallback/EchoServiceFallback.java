package com.dou.service.fallback;

import com.dou.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String string) {
        return "echo fallback";
    }

}
