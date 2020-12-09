package cl.eme.pruebaperritos.presenter;

import cl.eme.pruebaperritos.model.Perritos;

public class Presenter {

    PresenterView view;
    Perritos perritos;

    public Presenter(PresenterView view) {
        this.view = view;
        perritos = new Perritos();
    }
    public void getListBreed(String breed){

    }

}
