import java.io.File;
import java.io.IOException;

import org.jfugue.midi.MidiFileManager;
import org.jfugue.pattern.Pattern;
import org.jfugue.pattern.PatternProducer;
import org.jfugue.player.Player;


public class JFugueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p1 = new Pattern("C D E C | Ci Ci Bi Ci Ai Ai Ei Ei | Gw Cw").setVoice(0).setInstrument("Piano");
		
	    Pattern p2 = new Pattern("Rw     | Rw     | GmajQQQ  CmajQ").setVoice(1).setInstrument("Flute");
	    Player player = new Player();
	    //player.play(p1, p2); 
		Pattern pattern5 = new Pattern("Bb3/0.041666666666666664a122d0 Bb2/0.80625a127d0 A5sa100d20");
		player.play(pattern5);
	    try {
	        MidiFileManager.savePatternToMidi((PatternProducer) pattern5, new File("FirstMidi.midi"));
	        Pattern pattern3 = MidiFileManager.loadPatternFromMidi(new File("D:\\Work\\workspace3\\JFugueTest\\midi\\Celine_Dion_-_My_Heart_Will_Go_On_(Techno_Remix).mid"));
	        System.out.println(pattern3);
	        player.play(pattern3);
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }

	}

}
