package com.greenbridge.controllers;

import com.greenbridge.entities.ListCart;
import com.greenbridge.entities.Prodotto;
import com.greenbridge.services.CarrelloClienteService;
import com.greenbridge.services.ProdottoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/carrello")
public class CarrelloRestController {
    @Autowired
    private ProdottoService prodottoService;
    @Autowired
    private CarrelloClienteService carrelloClienteService;

    //aggiungere un prodotto al carrello
    @PostMapping("/aggiungiCart")
    int aggiungiCart(@RequestParam Integer idProdotto,
                     @RequestParam int quantita, HttpSession session) {
        Prodotto prodotto = prodottoService.getProdottoById(idProdotto);
        ListCart listCart = (ListCart) session.getAttribute("list_cart");
        if (listCart.isPresent(idProdotto)) {
            return 0;
        }

        listCart.addCart(prodotto, quantita);
        return 1;

    }
//AGGIUNGERE DA  QUI
        @PostMapping("/edit_prodotto")
    float[] editProdotto(@RequestParam Integer idProdotto,
                         @RequestParam String edit, HttpSession session) {
            ListCart listCart = (ListCart) session.getAttribute("list_cart");
            if (edit.equals("delete")) {
                return listCart.delete(idProdotto);
            } else {
                Prodotto prodotto =
                        prodottoService.getProdottoById(idProdotto);
                carrelloClienteService.deleteByProdotto(prodotto);
                return listCart.editProdotto(idProdotto, edit);

            }

        }







}
