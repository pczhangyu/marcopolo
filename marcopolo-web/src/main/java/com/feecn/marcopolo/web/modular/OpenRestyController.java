package com.feecn.marcopolo.web.modular;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;


/**
 * @author pczhangyu
 */
@Controller
public class OpenRestyController {

    private static Logger logger = LogManager.getLogger(OpenRestyController.class);

    private Integer requestCount =0;
    private Integer requestCount2 =0;
    private Integer requestCount3 =0;

    private static InetAddress addr;

    static {
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @PostMapping(value="/uat/post")
    public ResponseEntity<?> changeLogLevel(@RequestBody Map vo)
    {
        logger.info("my view obj is,{}",vo);
        requestCount= requestCount+1;
        return ResponseEntity.ok(String.format("post 测试接口已经被请求了 %s 次。当前服务端主机名是 %s ", requestCount,addr.getHostName()));
    }

    @RequestMapping(value = "/uat/post/get",method = {RequestMethod.GET,RequestMethod.POST})
    public ResponseEntity<?> getBothPostGet(@RequestParam(value = "param")String param,@RequestBody Map vo){
        requestCount3= requestCount3+1;
        logger.info("my view obj is,{}",vo);
        logger.info("my param is,{}",param);
        return ResponseEntity.ok(String.format("get/post 同时支持的测试接口已经被请求了 %s 次。当前服务端主机名是 %s ", requestCount3,addr.getHostName()));
    }

    @GetMapping(value = "/uat/get")
    public ResponseEntity<?> getTest(@RequestParam(value = "param")String param){
        requestCount2= requestCount2+1;
        return ResponseEntity.ok(String.format("get 测试接口已经被请求了 %s 次。当前服务端是 %s ", requestCount2,addr.getHostName()));
    }


}
