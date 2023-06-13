import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class MainController {

    @GetMapping("/hola-mundo")
    public String primeraFuncion(){
        return "<h1>hola mundo</h1>";
    }


    @GetMapping("/piedra-papel-tijera/{manoJugador}")
    public String PiedraPapelTijera(@PathVariable String manoJugador) {

        String piedra = "<pre>'Piedra'<br>    _______<br>---'   ____)<br>      (_____)<br>      (_____)<br>      (____)<br>---.__(___)</pre>";

        String papel = "<pre>'Papel'<br>     _______<br>---'    ____)____<br>           ______)<br>          _______)<br>         _______)<br>---.__________)</pre>";

        String tijera = "<pre>'Tijera'<br>    _______<br>---'   ____)____<br>          ______)<br>       __________)<br>      (____)<br>---.__(___)</pre>";

        Random random = new Random();
        int manoComputador = random.nextInt(3)+1;
        String resultado = "";

        switch (manoJugador){
            case "piedra":
                if (manoComputador == 1) {
                    resultado = "Tu mano: " + piedra + "\n" + "Compu: " + piedra + "\n" + "Es un empate";
                } else if (manoComputador == 2) {
                    resultado = "Tu mano: " + piedra + "\n" + "Compu: " + papel + "\n" + "Computadora Wins!";
                } else {
                    resultado = "Tu mano: " + piedra + "\n" + "Compu: " + tijera + "\n" + "¡Felicitaciones! Ganaste!!";
                }
                break;
            case "papel":
                if (manoComputador == 1) {
                    resultado = "Tu mano: " + papel + "\n" + "Compu: " + piedra + "\n" + "¡Felicitaciones! Ganaste!!";
                } else if (manoComputador == 2) {
                    resultado = "Tu mano: " + papel + "\n" + "Compu: " + papel + "\n" + "Es un empate";
                } else {
                    resultado = "Tu mano: " + papel + "\n" + "Compu: " + tijera + "\n" + "Computadora Wins!";
                }
                break;
            case "tijera":
                if (manoComputador==1){
                    resultado = "Tu mano:"+tijera +"\n"+"Compu:"+piedra+"\n"+ "Computadora Wins!";

                } else if (manoComputador==2) {
                    resultado= "Tu mano:"+tijera +"\n"+"Compu:"+papel+"\n"+ "Felicitaciones! Ganaste!!";

                } else {
                    resultado = "Tu mano:"+tijera +"\n"+"Compu:"+tijera+"\n"+ "Es un empate";
                }break;
            default:
                resultado="Error: Opción invalida";
        }
        return resultado;

    }

    @GetMapping("generar-password")
    public String generatePassword(){
        int length = 10; // Length of the random string
        String randomString = generateRandomString(length);
        double aleatorio = Math.random()* 1000000;
        long numeroAleatorio = Math.round(aleatorio);
        String pass = randomString + numeroAleatorio;
        return pass;
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }


}
