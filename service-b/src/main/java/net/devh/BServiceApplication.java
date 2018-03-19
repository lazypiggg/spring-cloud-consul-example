package net.devh;

import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/6/3
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class BServiceApplication {

    @Bean
    public Docket docket() {
        ApiSelectorBuilder apiSelectorBuilder = new Docket(DocumentationType.SWAGGER_2).select();
        apiSelectorBuilder.apis(withClassAnnotation(Api.class));
        return apiSelectorBuilder
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .apiInfo(
                    new ApiInfoBuilder().title("Service B API Doc")
                    .description("Service B API Doc")
                    .version("1.0")
                    .termsOfServiceUrl("https://github.com/wangzheng422/spring-cloud-consul-example")
                    .contact(new Contact("George", "https://github.com/wangzheng422", "wangzheng422@gmail.com"))
                    .build())
                .forCodeGeneration(true);

    }

    @Bean
	UiConfiguration uiConfig() {
		       
        return UiConfigurationBuilder.builder().validatorUrl(null).build();
	}

    public static void main(String[] args) {
        SpringApplication.run(BServiceApplication.class, args);
    }
}
