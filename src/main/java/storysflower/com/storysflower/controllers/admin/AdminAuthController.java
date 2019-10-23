package storysflower.com.storysflower.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import storysflower.com.storysflower.constants.UrlConstants;
@Controller

public class AdminAuthController {


        @GetMapping(UrlConstants.URL_LOGIN)
        public String index() {
            return "admin/login";
        }

}
