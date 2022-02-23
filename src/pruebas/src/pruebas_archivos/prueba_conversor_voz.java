package pruebas_archivos;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class prueba_conversor_voz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoiceManager manager = VoiceManager.getInstance();
		Voice voz = manager.getVoice("Kevin16");
		voz.allocate();
		voz.speak("Hola mundo");
		voz.deallocate();

	}

}
