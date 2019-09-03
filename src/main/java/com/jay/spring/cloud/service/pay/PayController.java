package com.jay.spring.cloud.service.pay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Jay on 2019/9/3
 */
@RestController
public class PayController
{
    @GetMapping("pay/book")
    public String payBook()
    {
        return "pay book success.";
    }
}
