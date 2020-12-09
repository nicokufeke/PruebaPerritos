package cl.eme.pruebaperritos.presenter;

import java.util.List;

import cl.eme.pruebaperritos.model.InterfaceModel;

public class PresenterList implements IPresenterList, IPresenterModel{
    InterfaceModel interfaceModel;
    IPresenterViewList iPresenterViewList;

    public PresenterList(IPresenterViewList iPresenterViewList) {
        this.iPresenterViewList = iPresenterViewList;
    }

    public void setInterfaceModel(InterfaceModel interfaceModel) {
        this.interfaceModel = interfaceModel;
    }

    @Override
    public void loadBreeds() {
     interfaceModel.loadBreeds();
    }

    @Override
    public void notificar(List<String> list) {
    iPresenterViewList.showDogs(list);
    }
}

}
