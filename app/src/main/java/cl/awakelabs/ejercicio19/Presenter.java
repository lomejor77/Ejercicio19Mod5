package cl.awakelabs.ejercicio19;

public class Presenter {

    private ActivityModel modelo;
    private ViewPresenter vistaPresentador;

    public Presenter(ViewPresenter vistaPresentador) {
        this.vistaPresentador = vistaPresentador;
        modelo = new ActivityModel();
    }

    public void evalPass(String password) {

        int nivelPass = modelo.validPass(password);

        if (nivelPass == ActivityModel.DEBIL) {

            this.vistaPresentador.verDebil();

        } else if (nivelPass == ActivityModel.MEDIA) {

            this.vistaPresentador.verMedia();

        } else if (nivelPass ==ActivityModel.FUERTE) {

            this.vistaPresentador.verFuerte();

        } else {

            this.vistaPresentador.mostrarError();

        }
    }
}
