package cl.awakelabs.ejercicio19;

public class ActivityModel {
    public static final int DEBIL =0;
    public static final int MEDIA =1;
    public static final int FUERTE =2;


    public int validPass(String password) {
      if (password.length() <5) {

          return DEBIL;

      } else if (password.equals(password.toLowerCase())) {

          return MEDIA;

      } else {

          return FUERTE;
      }

    }

}


