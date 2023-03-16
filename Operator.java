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
		verifLvl();
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
		if(this.type == "Sniper"){
			if(!(setSniper.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Guard"){
			if(!(setGuard.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Supporter"){
			if(!(setSupporter.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Vanguard"){
			if(!(setVanguard.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Medic"){
			if(!(setMedic.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Defender"){
			if(!(setDefender.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Caster"){
			if(!(setCaster.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}

		if(this.type == "Specialist"){
			if(!(setSpecialist.contain(this.subType)))
				throw new IllegalArgumentException("wrong sub class name")
		}
	}

	Set<String> setSniper = new HashSet<String>();
	setSniper.add("Spreadshooter");
	setSniper.add("Marksman");
	setSniper.add("Heavyshooter");
	setSniper.add("Besieger");
	setSniper.add("Artilleryman");
	setSniper.add("Flinger");
	setSniper.add("Deadeye");
	Set<String> setGuard = new HashSet<String>();
	setGuard.add("Arts Fighter");
	setGuard.add("Fighter");
	setGuard.add("Lord");
	setGuard.add("Centurion");
	setGuard.add("Dreadnought");
	setGuard.add("Swordmaster");
	setGuard.add("Reaper Guard");
	setGuard.add("Liberator Guard");
	setGuard.add("Instructor");
	setGuard.add("Musha");
	Set<String> setSupporter = new HashSet<String>();
	setSupporter.add("Summoner");
	setSupporter.add("Decel Binder");
	setSupporter.add("Bard");
	setSupporter.add("Hexer");
	setSupporter.add("Abjurer");
	setSupporter.add("Artificer");
	Set<String> setVanguard = new HashSet<String>();
	setVanguard.add("Agent");
	setVanguard.add("Flagbearer");
	setVanguard.add("Charger");
	setVanguard.add("Pioneer");
	setVanguard.add("Tactician");
	Set<String> setMedic = new HashSet<String>();
	setMedic.add("ST Medic");
	setMedic.add("MT Medic");
	setMedic.add("Therapist");
	setMedic.add("Wandering Medic");
	setMedic.add("Incantations");
	Set<String> setDefender = new HashSet<String>();
	setDefender.add("Guardian");
	setDefender.add("Juggernaut");
	setDefender.add("Fortress");
	setDefender.add("Protector");
	setDefender.add("Duelist");
	setDefender.add("Arts Protector");
	Set<String> setCaster = new HashSet<String>();
	setCaster.add("Core Caster");
	setCaster.add("Blast Caster");
	setCaster.add("Mech-Accord");
	setCaster.add("Chain Caster");
	setCaster.add("Splash Caster");
	setCaster.add("Phalanx Caster");
	setCaster.add("Mystic Caster");
	Set<String> setSpecialist = new HashSet<String>();
	setSpecialist.add("Push Stroker");
	setSpecialist.add("Dollkeeper");
	setSpecialist.add("Hookmaster");
	setSpecialist.add("Executor");
	setSpecialist.add("Sacrificial Specialist");
	setSpecialist.add("Merchant");
	setSpecialist.add("Ambusher");
	setSpecialist.add("Trapmaster");
}
