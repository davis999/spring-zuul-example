package io.davis.zuul;

@EnableZuulProxy
@SpringCloudApplication
public class Application {
  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class).web(true).run(args);
  }
}