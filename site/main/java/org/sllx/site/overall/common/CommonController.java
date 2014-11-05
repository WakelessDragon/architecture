package org.sllx.site.overall.common;

import org.sllx.mvc.Controller;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.ModelAttribute;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * Created by sllx on 14-11-4.
 */
public abstract class CommonController extends Controller {

    private Link selfLink = linkTo(this.getClass()).withSelfRel();
    @ModelAttribute("selfLink")
    public String getSelfLink(){
        return selfLink.getHref();
    }

}
