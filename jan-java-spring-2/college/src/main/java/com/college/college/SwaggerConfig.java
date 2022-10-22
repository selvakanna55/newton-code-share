//package com.college.college;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.RequestHandler;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//public class SwaggerConfig implements WebMvcConfigurer {
//
//    @Bean
//    public Docket apiDocket() {
//        ApiInfo apiInfo = new ApiInfoBuilder()
//                .title("newton api")
//                .description("api for spring boot learning").build();
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.college.college"))
//                .paths(PathSelectors.any()).build();
//    }
//
//}
