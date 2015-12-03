package adamatti

import org.springframework.context.annotation.{Configuration, AnnotationConfigApplicationContext}
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Created by Marcelo on 02/12/2015.
 */
object WikiMain {
  def main(args: Array[String]): Unit = {
    println("Hello world");

    val context = new ClassPathXmlApplicationContext("/META-INF/spring-app.xml")
    context.registerShutdownHook()
    context.close()
  }
}
