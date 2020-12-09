package cl.eme.pruebaperritos.presenter;

public interface IPresenterDetail {
    void loadBreedImages(String loadBI);
    void loadSubBreedImages(String lBreed, String loadSBI);
    void saveFavorites (Favorites favorites);


}
