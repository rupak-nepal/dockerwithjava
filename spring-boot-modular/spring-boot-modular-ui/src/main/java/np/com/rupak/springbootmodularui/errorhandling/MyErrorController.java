package np.com.rupak.springbootmodularui.errorhandling;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by rupak
 * On : 09, Jun, 2019
 */
@Controller
public class MyErrorController implements ErrorController {

    private static final Logger log = Logger.getLogger(MyErrorController.class.getName());

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        log.log(Level.INFO,"Inside /error request routing page.");
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null){
            Integer statusCode = Integer.valueOf(status.toString());
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                log.log(Level.INFO,"Inside 404  NOT found request routing page.");
                return "error-404";
            }
            else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                log.log(Level.INFO,"Inside 505  NOT found request routing page.");
                return "error-505";
            }
        }
        return "error";
    }

    @Override
    public String getErrorPath() {
        log.log(Level.INFO,"Error occured and redirecting to /error url for handling ...");
        return "/error";
    }
}
