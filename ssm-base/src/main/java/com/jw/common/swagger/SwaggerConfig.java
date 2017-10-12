package com.jw.common.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @ClassName SwaggerConfig.java
 * @Description swagger配置
 * <ul>
 * <li>Restful API 访问路径: http://IP:port/{context-path}/swagger-ui.html </li>
 * <li>eg: http://localhost:8080/jd-config-web/swagger-ui.html</li> 
 * </ul>
 * @author          lhzissky
 * @version         V1.0  
 * @Date           2017年10月11日 下午5:07:40
 */
@Configuration //配置注解，自动在本类上下文加载一些环境变量信息  
@EnableSwagger2 //使swagger2生效 
@EnableWebMvc 
//@ComponentScan("com.jw.*") //需要扫描的包路径  
public class SwaggerConfig {

	@Bean  
    public Docket createRestApi() {  
        return new Docket(DocumentationType.SWAGGER_2)  
                .apiInfo(apiInfo())  
                .select()  
                .apis(RequestHandlerSelectors.basePackage("com.jw"))  
                .paths(PathSelectors.any())  
                .build();  
    }  
  
    private ApiInfo apiInfo() {  
        return new ApiInfoBuilder()  
                .title("Spring 中使用Swagger2构建RESTful APIs")  
                .termsOfServiceUrl("http://www.baidu.com")  
                .contact(new Contact("lhz", "", ""))
                .version("1.1")  
                .build();  
    }  
}