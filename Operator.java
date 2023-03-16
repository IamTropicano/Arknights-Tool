import java.io.*;
import java.util.*;

public class Operator {

	private String name;
	private int rarity;
	private String type;
	private String subType;
	private int elite;
	private int lvl;

	public Operator(String name, int rarity, String type, String subType, int elite, int lvl) throws IllegalArgumentException {
		verifClass();
		verifLvL();
		this.name = name;
		this.rarity = rarity;
		this.type = type;
		this.subType = subType;
		this.elite = elite;
		this.lvl = lvl;
	}
	
	public String toString() {
		return "Votre operateur : " + this.name + " est un " + this.subType + "(" + this.type + "). Cet operateur est de niveau : E" + this.elite + "Lvl" + this.lvl;
	}

	public void verifLvL()throws IllegalArgumentException {
		if(rarity < 1 || rarity > 6)
			throw new IllegalArgumentException("wrong rarity number");
		// CA VA ETRE LONG
		if(rarity == 1) {
			if(elite!=0)
				throw new IllegalArgumentException("wrong elite number");
			if(lvl < 0 || lvl > 30)
				throw new IllegalArgumentException("wrong lvl number");
		}
		else if(rarity==2) {
			if(elite!=0)
				throw new IllegalArgumentException("wrong elite number");
			if(lvl < 0 || lvl > 30)
				throw new IllegalArgumentException("wrong lvl number");
		}
		else if(rarity==3) {
			if(elite < 0 || elite  > 1)
				throw new IllegalArgumentException("wrong elite number");
			if(elite == 0 &&(lvl < 0 || lvl > 40))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 1 &&(lvl < 0 || lvl > 55))
				throw new IllegalArgumentException("wrong lvl number");
		}
		else if(rarity==4) {
			if(elite < 0 || elite  > 2)
				throw new IllegalArgumentException("wrong elite number");
			if(elite == 0 &&(lvl < 0 || lvl > 45))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 1 &&(lvl < 0 || lvl > 60))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 2 &&(lvl < 0 || lvl > 70))
				throw new IllegalArgumentException("wrong lvl number");
		}
		else if(rarity==5) {
			if(elite < 0 || elite  > 2)
				throw new IllegalArgumentException("wrong elite number");
			if(elite == 0 &&(lvl < 0 || lvl > 50))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 1 &&(lvl < 0 || lvl > 70))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 2 &&(lvl < 0 || lvl > 80))
				throw new IllegalArgumentException("wrong lvl number");
		}
		else if(this.rarity==6) {
			if(elite < 0 || elite  > 2)
				throw new IllegalArgumentException("wrong elite number");
			if(elite == 0 &&(lvl < 0 || lvl > 50))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 1 &&(lvl < 0 || lvl > 80))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 2 &&(lvl < 0 || lvl > 90))
				throw new IllegalArgumentException("wrong lvl number");
		}
	}

	public void verifClass() throws IllegalArgumentException {
		final Set<String> setSniper = new HashSet<>(Arrays.asList("Spreadshooter","Marksman","Heavyshooter","Besieger","Artilleryman","Flinger","Deadeye"));
		final Set<String> setGuard = new HashSet<String>(Arrays.asList("Arts Fighter","Fighter","Lord","Centurion","Dreadnought","Swordmaster","Reaper Guard","Liberator Guard","Instructor","Musha"));
		final Set<String> setSupporter = new HashSet<String>(Arrays.asList("Summoner","Decel Binder","Bard","Hexer","Abjurer","Artificer"));
		final Set<String> setVanguard = new HashSet<String>(Arrays.asList("Agent","Flagbearer","Charger","Pioneer","Tactician"));
		final Set<String> setMedic = new HashSet<String>(Arrays.asList("ST Medic","MT Medic","Therapist","Wandering Medic","Incantations"));
		final Set<String> setDefender = new HashSet<String>(Arrays.asList("Guardian","Juggernaut","Fortress","Protector","Duelist","Arts Protector"));
		final Set<String> setCaster = new HashSet<String>(Arrays.asList("Core Caster","Blast Caster","Mech-Accord","Chain Caster","Splash Caster","Phalanx Caster","Mystic Caster"));
		final Set<String> setSpecialist = new HashSet<String>(Arrays.asList("Push Stroker","Dollkeeper","Hookmaster","Executor","Sacrificial Specialist","Merchant","Ambusher","Trapmaster"));		
		if(this.type == "Sniper"){
			if(!(setSniper.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		if(this.type == "Guard"){
			if(!(setGuard.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		if(this.type == "Supporter"){
			if(!(setSupporter.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		if(this.type == "Vanguard"){
			if(!(setVanguard.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		
		if(this.type == "Medic"){
			if(!(setMedic.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		if(this.type == "Defender"){
			if(!(setDefender.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		if(this.type == "Caster"){
			if(!(setCaster.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}

		if(this.type == "Specialist"){
			if(!(setSpecialist.contains(this.subType)))
				throw new IllegalArgumentException("wrong sub class name");
		}
	}

	
}