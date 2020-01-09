package com.mmp.common.configer.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chenguangxu
 * @date 2020/1/9 9:44
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mmp.mp.url.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://ip:port/swagger-ui.html
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("mybatis - mybatis-plus")
                .version("1.0")
                .build();
    }

/**
 * 创建API应用
 * apiInfo() 增加API相关信息
 * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
 * 本例采用指定扫描的包路径来定义指定要建立API的目录。
 *
 * @return
 */

    //分组
    /*@Bean
    public Docket restApiByKb() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("知识库接口组")
                .apiInfo(apiInfo("metronDev APIs", "1.0"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.apache.metron.rest.oneops.kb.controller"))
                .paths(PathSelectors.any())
                .build();
    }*/


}