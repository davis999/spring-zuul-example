package io.davis.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rai on 17/3/5.
 */
@RestController
public class TestController {
  @Value("${zuul.routes.category.url}")
  private String url;

  @GetMapping("/")
  public String testUrl() {
    return url + " - " + System.currentTimeMillis();
  }
}
