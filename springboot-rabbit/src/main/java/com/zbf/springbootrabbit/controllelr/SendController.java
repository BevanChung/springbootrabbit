package com.zbf.springbootrabbit.controllelr;

import com.zbf.springbootrabbit.sender.FirstSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/7 10:58
 * @version 1.0
 */
@RestController
public class SendController {
    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message){
        String uuid = UUID.randomUUID().toString();
        firstSender.send(uuid,message);
        return uuid;
    }
}
