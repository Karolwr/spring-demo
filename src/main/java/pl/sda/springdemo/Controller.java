package pl.sda.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//adnotacja mowiaca o polaczeniu ze sprngiem
@RestController
public class Controller {
    //jak ma nazywac sie zasob http
    //jest wysylany adres i parametry tego serwera
    //naza klasa sprwdza czy jest zmapowany adres /start
    @GetMapping("/start")
    public String powitanie() {
        return "Witaj na stronie:)";// mozna by tu wpisac formularz html i zwrocic pozniej dane z formuarza

        //trzeba postawic serwer tomcat jeli po www to do pliku .var pliki .jar
    }
}
