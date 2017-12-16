/**
 * FileName: MyExitCodeGenerator
 * Author:   Administrator
 * Date:     2017/12/16 22:46
 * Description: ExitCodeGenerator
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.component;

import org.springframework.boot.ExitCodeGenerator;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ExitCodeGenerator〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
public class MyExitCodeGenerator implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
        System.out.println("应用程序退出测试");
        return 0;
    }
}