package adamatti.model.dao

import javax.annotation.PostConstruct

import org.springframework.stereotype.Repository

/**
 * Created by Marcelo on 02/12/2015.
 */
@Repository
class TiddlerDao {
  @PostConstruct
  def init(): Unit ={
    println("TiddlerDao created")
  }
}
