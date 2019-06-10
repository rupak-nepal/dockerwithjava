package np.com.rupak.springbootmodularui.mvcconfig;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

/**
 * Created by rupak.
 * Date: 08,Jun,2019
 * Time: 6:21 PM
 */
public class RegisterViewController {

    static void registerIndexController(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
    }
}
