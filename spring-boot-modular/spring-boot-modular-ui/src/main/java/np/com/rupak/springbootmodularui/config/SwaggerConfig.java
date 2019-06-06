package np.com.rupak.springbootmodularui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
@ComponentScan("np.com.rupak.springbootmodularui.controller")
public class SwaggerConfig {

    @Bean
    public Docket swaggerSpringMVCPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(appDetails());
    }

    private ApiInfo appDetails() {
        return new ApiInfo("SpringBootModular", "Just Testing security, docker, modular..etc."
                , "1.0.0", ""
                , new Contact("Rupak Nepal", "rupaknepal.blogspot.com.np", null)
                , "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0"
                , null);
    }


}
