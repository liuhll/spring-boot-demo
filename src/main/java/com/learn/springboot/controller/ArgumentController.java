/**
 * FileName: ArgumentController
 * Author:   Administrator
 * Date:     2017/12/16 22:25
 * Description: ApplicationAguments
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ApplicationAguments〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
@RestController
public class ArgumentController {

    @Autowired
    private ApplicationArguments applicationArguments;

    @RequestMapping("/arguments")
    public String[] Arguments(){
        List<String> list = applicationArguments.getNonOptionArgs();
        String[] strings = new String[list.size()];
        list.toArray(strings);
        return strings;
    }
}