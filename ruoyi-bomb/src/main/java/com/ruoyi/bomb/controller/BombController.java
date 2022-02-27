package com.ruoyi.bomb.controller;

import com.ruoyi.bomb.service.BombService;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBomb")
public class BombController extends BaseController {
    @Autowired

    @GetMapping("/hello")
    public String userList(){
        BombService bombService = new BombService();
        return bombService.helloBomb();
    }

}
