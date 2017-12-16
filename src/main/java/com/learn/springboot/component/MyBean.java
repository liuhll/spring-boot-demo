/**
 * FileName: MyBean
 * Author:   Administrator
 * Date:     2017/12/16 22:21
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试读取应用程序参数〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
@Component
public class MyBean {

    @Autowired
    public MyBean(ApplicationArguments arguments){
        boolean debug = arguments.containsOption("debug");

        List<String> files = arguments.getNonOptionArgs();
        for (String s : files){
            System.out.print(s);
        }
    }
}