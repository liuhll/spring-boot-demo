/**
 * FileName: AppConfig
 * Author:   Administrator
 * Date:     2017/12/16 23:00
 * Description: MyAppConfigInfo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.learn.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * 〈一句话功能简述〉<br> 
 * 〈MyAppConfigInfo〉
 *
 * @author Administrator
 * @create 2017/12/16
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "app")
@Component
@Validated
public class AppConfig {

    /*
    *
    * Getters和setter方法通常是必须要有的，因为绑定是通过标准的Java Beans属性描述符，就像在Spring MVC中一样。
    * 在某些情况下可能会省略setter方法：
    *   Map 只要它们被初始化，需要一个getter，但不一定是一个setter，因为它们可以被binder修改。
    * 集合和数组可以通过索引（通常使用YAML）或使用单个逗号分隔值（Properties中）来访问。
    * 在后一种情况下，setter方法是强制性的。 我们建议总是为这样的类型添加一个设置器。 如果您初始化集合，请确保它不是不可变的（如上例所示）
    * 如果已初始化嵌套POJO属性（如上例中的Security字段），则不需要setter方法。如果您希望binder使用其默认构造函数即时创建实例，则需要一个setter。
    *
    * */


    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @NotNull
    private String description;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}