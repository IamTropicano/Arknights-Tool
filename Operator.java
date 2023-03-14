
public class Operator {
	private String name;
	private int rarity;
	private String type;
	private String subType;
	private int elite;
	private int lvl;

	public Operator(String name, int rarity, String type, String subType, int elite, int lvl) throws IllegalArgumentException {
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
		else if(rarity==6) {
			if(elite < 0 || elite  > 2)
				throw new IllegalArgumentException("wrong elite number");
			if(elite == 0 &&(lvl < 0 || lvl > 50))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 1 &&(lvl < 0 || lvl > 80))
				throw new IllegalArgumentException("wrong lvl number");
			if(elite == 2 &&(lvl < 0 || lvl > 90))
				throw new IllegalArgumentException("wrong lvl number");
		}
		// C'EST LA FIN YOUPI
		//ON ENCHAINE AVEC LES PUTAINS DE NOMS DE CLASSES
		if(type == "Sniper") {
			if(! (subType == "Spreadshooter" || subType == "Marksman" || subType == "Heavyshooter" || subType == "Besieger" || subType == "Artilleryman" || subType == "Flinger" || subType == "Deadeye"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else if(type == "Guard") {
			if(! (subType == "Arts Fighter" || subType == "Fighter" || subType == "Lord" || subType == "Centurion" || subType == "Dreadnought" || subType == "Swordmaster" || subType == "Reaper Guard"| subType == "Instructor" || subType == "Musha" || subType == "Liberator Guard"))
				throw new IllegalArgumentException("wonge subClass name");
		}
		else if(type =="Supporter" ) {
			if(! (subType == "Summoner" || subType == "Decel Binder" || subType == "Bard" || subType == "Hexer" || subType == "Abjurer" || subType == "Artificer"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else if(type == "Vanguard") {
			if(!(subType == "Agent" || subType == "Flagbearer" || subType == "Charger" || subType == "Pioneer" || subType == "Tactician"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else if(type == "Medic") {
			if(!(subType == "ST Medic" || subType == "MT Medic" || subType == "Therapist" || subType == "Wandering Medic" || subType == "Incantation"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else if(type == "Defender") {
			if(!(subType == "Guardian" || subType == "Juggernaut" || subType == "Fortress" || subType == "Protector" || subType == "Duelist" || subType == "Arts Protector"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else if(type == "Caster") {
			if(!(subType == "Core Caster" || subType == "Blast Caster" || subType == "Mech-Accord" || subType == "Chain Caster" || subType == "Splash Caster" || subType == "Phalanx Caster" || subType == "Mystic Caster"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else if(type == "Specialist") {
			if(!(subType == "Push Stroker" || subType == "Dollkeeper" || subType == "Hookmaster" || subType == "Executor" || subType == "Sacrificial Specialist" || subType == "Merchant" || subType == "Ambusher" || subType == "Trapmaster"))
				throw new IllegalArgumentException("wrong subClass name");
		}
		else {
			throw new IllegalArgumentException("wrong class name");
		}
		
		
		//ALLEZ HOP CA C'EST FAIT
		this.name = name;
		this.rarity = rarity;
		this.type = type;
		this.subType = subType;
		this.elite = elite;
		this.lvl = lvl;
	}
	
	public String ToString() {
		return "Votre operateur : " + this.name + " est un " + this.subType + "(" + this.type + "). Cet operateur est de niveau : E" + this.elite + "Lvl" + this.lvl;
	}
}
