package com.wenhao.blog.controller;

import com.wenhao.blog.domain.Bill;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BillController {

    @PostMapping("/bill")
    public void save(@RequestBody Bill bill) {
        System.out.println("这是账单" + bill);
    }
}
