package com.ion.ddd.controller.http;

import com.ion.ddd.application.service.event.EventAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HiController {

    private static final Logger log = LoggerFactory.getLogger(HiController.class);

    @Autowired
    private EventAppService eventAppService;

    @GetMapping("/hi")
    public String hello() {
        return eventAppService.sayHi("Thomas");
    }

    @GetMapping("/hi/v1")
    public String sayHi() {
        return eventAppService.sayHi("Mary");
    }

    @GetMapping("/test-load")
    public String testLoad() throws InterruptedException {
        log.info("Request nhận bởi: {}", Thread.currentThread().getName());
        // Giữ thread này bận trong 3 giây
        Thread.sleep(3000);
        log.info("Request xử lý xong bởi: {}", Thread.currentThread().getName());
        return "Xử lý xong bởi: " + Thread.currentThread().getName();
    }

}
