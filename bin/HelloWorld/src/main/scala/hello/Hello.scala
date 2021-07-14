package hello

import com.typesafe.scalalogging.LazyLogging

class MyMain extends LazyLogging {
  logger.debug("This is very convenient ;-)")
}

object Hello extends App{
  new MyMain()
}
