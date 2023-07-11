package cl.awakelabs.ejercicio19;

public class Presenter {

    private ActivityModel modelo;

    public void evalPass(String password) {

        int nivelPass = modelo.validPass(password);

        if (nivelPass == ActivityModel.DEBIL) {

        } else if (nivelPass == ActivityModel.MEDIA) {

        } else if (nivelPass ==ActivityModel.FUERTE) {

        } else {

        }
    }
}
