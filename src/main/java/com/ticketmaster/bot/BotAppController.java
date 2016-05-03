package com.ticketmaster.bot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lovebisaria on 02/05/16.
 */



@RestController
@RequestMapping(BotAppController.REQUEST_PATH)
public class BotAppController {

    private static final Logger log = LoggerFactory.getLogger(BotAppController.class);

    public final static String REQUEST_PATH="/bot/v1";

    @RequestMapping(value = "/webhook", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public Object verifyWebhook(Model model) {
        return "{\"text\": \"Hello World\"}" ;
    }
}
