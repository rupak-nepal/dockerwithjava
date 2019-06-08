package np.com.rupak.springbootmodularui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class.getName());

    @RequestMapping(path = {"/"},method = RequestMethod.GET)
    public ModelAndView viewIndexPage(){
        logger.log(Level.INFO,"Getting indise index main page.");
        return new ModelAndView("index");
    }
}
