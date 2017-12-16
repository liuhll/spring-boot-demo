/**
 * FileName: MyCustomCommandLine
 * Author:   Administrator
 * Date:     2017/12/16 22:40
 * Description: 自定义的CommadLine
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的CommadLine〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
@Component
public class MyCustomCommandLine implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.print("将在SpringApplication.run（…）之前调用");
        for (String s:strings){
            System.out.println(s + "--------------------------------------!!!<br/>");
        }
    }
}