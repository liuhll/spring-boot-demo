/**
 * FileName: MyAppConfigController
 * Author:   Administrator
 * Date:     2017/12/16 23:06
 * Description: Read App Config
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.controller;

import com.learn.springboot.component.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Read App Config〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
@RestController
public class MyAppConfigController {

    @Autowired
    private AppConfig appConfig;

    @RequestMapping("/app/config")
    public String printAppConfigInfo(){

        return  appConfig.getName() + appConfig.getDescription();
    }
}