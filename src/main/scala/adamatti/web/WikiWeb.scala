package adamatti.web

import javax.annotation.PostConstruct

import adamatti.model.dao.TiddlerDao
import com.twitter.finatra.{Request, Controller}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Marcelo on 02/12/2015.
 */
@Component
class WikiWeb @Autowired() (tiddlerDao: TiddlerDao, finatraApp:FinatraApp) extends Controller{
  @PostConstruct
  def init(): Unit ={
    //finatraApp.register(this)
  }

  get("home"){ request: Request =>
    //response.ok.plain("hello").toFuture
    render.plain("hello world").toFuture
  }
}
