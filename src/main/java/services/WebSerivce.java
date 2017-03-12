package services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WebSerivce implements BewonerService {
    private BewonerController customerService = new BewonerController();

    @WebMethod(action = "geefAantalWerklozenPerStad")
    public int geefAantalWerklozenPerStad(String stad) {
        return customerService.geefAantalWerklozenPerStad(stad);
    }

    @WebMethod(action = "geefAantalArbeidersPerStad")
    public int geefAantalArbeidersPerStad(String stad) {
        return customerService.geefAantalArbeidersPerStad(stad);
    }

    @WebMethod(action = "geefAantalBewonersPerStad")
    public int geefAantalBewonersPerStad(String stad) {
        return customerService.geefAantalBewonersPerStad(stad);
    }
}

