package pruebas_X;
import com.sun.speech.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class prueba_voz {
	private static Voice[] voices;
	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		VoiceManager vm = VoiceManager.getInstance();
	    // Gathers all availible voices
	    voices = vm.getVoices();

	    // Sets the voice to a kevin voice
	    Voice voice = vm.getVoice("kevin");
	    voice.allocate();

	    voice.speak("Test test test");
	    voice.deallocate();
		
	}

}
