package be.hvwebsites.voorraad.messaging;

import be.hvwebsites.voorraad.events.ArtikelGemaakt;
import be.hvwebsites.voorraad.services.ArtikelService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ArtikelListener {
    private final ArtikelService service;

    public ArtikelListener(ArtikelService service) {
        this.service = service;
    }

    @RabbitListener(queues = "voorraad")
    void verwerkBericht(ArtikelGemaakt artikelGemaakt){
        service.create(artikelGemaakt.naarArtikel());
    }
}
