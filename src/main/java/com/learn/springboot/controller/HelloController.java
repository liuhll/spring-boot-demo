/**
 * FileName: HelloController
 * Author:   Administrator
 * Date:     2017/12/16 21:41
 * Description: HelloController
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈HelloController〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(){
        return "Hello";
    }
}