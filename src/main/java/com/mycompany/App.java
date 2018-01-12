package com.mycompany;

import org.jooby.Jooby;
import org.jooby.assets.Assets;
import org.jooby.ftl.Ftl;

/**
 * @author jooby generator
 */
public class App extends Jooby {
  
  {
    use(new Assets());
    use(new Ftl("/templates", ".ftl"));
    use(MvcController.class);
  }
  
  public static void main(final String[] args) {
    run(App::new, args);
  }
  
}
