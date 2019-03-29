package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author zhao
 * @Date 2019/3/27 15:36
 * @Description:
 **/
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.huayu.quick.controller"})
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {
    @Bean
    public Docket customDocket() {
        //
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("赵", "https://www.baidu.me", "baidu_666@icloud.com");
        return new ApiInfo("部门管理API接口",//大标题 title
                "部门管理",//小标题
                "0.0.1",//版本
                "www.baidu.com",//termsOfServiceUrl
                contact,//作者
                "Blog",//链接显示文字
                "https://www.baidu.me"//网站链接
        );
    }
}
