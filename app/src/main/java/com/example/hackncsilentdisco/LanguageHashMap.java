package com.example.hackncsilentdisco;

import java.util.HashMap;

public class LanguageHashMap {

	@Deprecated
	public static HashMap<String, String> makeDictionary() {
		return makeSpanishDictionary();
	}
	
	/**
	 * Spanish word, English translation
	 */
	public static HashMap<String, String> makeSpanishDictionary() {
		HashMap<String, String> map = new HashMap<>();
		map.put("el, la", "the");
		map.put("de", "of, from");
		map.put("que", "that, which");
		map.put("y", "and");
		map.put("a", "to, at");
		map.put("en", "in, on");
		map.put("un", "a, an");
		map.put("ser", "to be (norm)");
		map.put("se", "[reflexive marker]");
		map.put("no", "no");
		map.put("haber", "to have (+Ved)");
		map.put("por", "by, for, through");
		map.put("con", "with");
		map.put("su", "his/her/their/your (-fam)");
		map.put("para", "for, to, in order to");
		map.put("como", "like, as");
		map.put("estar", "to be (location, change from norm)");
		map.put("tener", "to have");
		map.put("le", "[3rd person] (indirect obj)");
		map.put("lo", "the (+ neuter)");
		//map.put("lo", "[3rd person] (direct obj-m)");
		map.put("todo", "all, every");
		map.put("pero", "but, yet, except");
		map.put("más", "more");
		map.put("hacer", "to do, make");
		map.put("o", "or");
		map.put("poder", "to be able to; can");
		map.put("decir", "to tell, say");
		map.put("este", "this (m) [esta (f)]");
		map.put("ir", "to go");
		map.put("otro", "other, another");
		map.put("ese", "that (m) [esa (f)]");
		//map.put("la", "[3rd person] (direct obj-f)");
		map.put("si", "if, whether");
		map.put("me", "me (obj)");
		map.put("ya", "already, still");
		map.put("ver", "to see");
		map.put("porque", "because");
		map.put("dar", "to give");
		map.put("cuándo", "when");
		map.put("él", "he, [ellos] them (m)");
		map.put("muy", "very, really");
		map.put("sin", "without");
		map.put("vez", "time (specific occurrence)");
		map.put("mucho", "much, many, a lot (adv)");
		map.put("saber", "to know (a fact), find out");
		map.put("qué", "what?, which?, how (+ adj)!");
		map.put("sobre", "on top of, over, about");
		map.put("mi", "my");
		map.put("alguno", "some, someone (pron)");
		map.put("mismo", "same");
		map.put("yo", "I (subj)");
		map.put("también", "also");
		map.put("hasta", "until, up to, even (adv)");
		map.put("año", "year");
		map.put("dos", "two");
		map.put("querer", "to want, love");
		map.put("entre", "between, among");
		map.put("así", "like that");
		map.put("primero", "first");
		map.put("desde", "from, since");
		map.put("grande", "large, great, big");
		map.put("eso", "that (n)");
		map.put("ni", "not even, neither, nor");
		map.put("nos", "us (obj)");
		map.put("llegar", "to arrive");
		map.put("pasar", "to pass, spend (time)");
		map.put("tiempo", "time (general), weather");
		map.put("ella", "she, [ellas] them (f)");
		map.put("sí", "yes");
		map.put("día", "day");
		map.put("uno", "one");
		map.put("bien", "well");
		map.put("poco", "little, few, a little bit (adv)");
		map.put("deber", "should, ought to; to owe");
		map.put("entonces", "so, then");
		map.put("poner", "to put (on), get (+adj)");
		map.put("cosa", "thing");
		map.put("tanto", "so much, so many");
		map.put("hombre", "man, mankind, husband");
		map.put("parecer", "to seem, look like");
		map.put("nuestro", "our");
		map.put("tan", "such, as, too, so");
		map.put("dónde", "where");
		map.put("ahora", "now");
		map.put("parte", "part, portion");
		map.put("después", "after");
		map.put("vida", "life");
		map.put("quedar", "to remain, stay");
		map.put("siempre", "always, forever");
		map.put("creer", "to believe, think");
		map.put("hablar", "to speak, talk");
		map.put("llevar", "to take, carry");
		map.put("dejar", "to let, leave");
		map.put("nada", "nothing, (not) at all");
		map.put("cada", "each, every");
		map.put("seguir", "to follow, keep on");
		map.put("menos", "less, fewer");
		map.put("nuevo", "new");
		map.put("encontrar", "to find");

		return map;
	}

	/**
	 * French word, English translation
	 */
	public static HashMap<String, String> makeFrenchDictionary(){
		HashMap<String, String> map = new HashMap<>();

		map.put("un", "a, an, one");
		map.put("à", "to, at, in");
		map.put("en", "in, by");
		map.put("le", "the; him, her, it, them");
		map.put("et", "and");
		map.put("être", "to be; (being)");
		map.put("de", "of, from, some, any");
		map.put("avoir", "to have");
		map.put("que", "that, what, who, whom, (which)");
		map.put("ne", "not");
		map.put("dans", "in, into, from");
		map.put("ce", "this, that");
		map.put("il", "he, it");
		map.put("qui", "who, whom");
		map.put("pas", "not, n't; (footstep)");
		map.put("pour", "for, in order to");
		map.put("sur", "on, upon");
		map.put("se", "oneself, himself, herself, itself, themselves");
		map.put("son", "his, her, its; (sound; bran)");
		map.put("plus", "more, no more");
		map.put("pouvoir", "can, to be able to");
		map.put("par", "by");
		map.put("je", "I");
		map.put("avec", "with");
		map.put("tout", "all, very");
		map.put("faire", "to do, make");
		map.put("nous", "we, us");
		map.put("mettre", "to put, place");
		map.put("autre", "other");
		map.put("on", "one, we");
		map.put("mais", "but");
		map.put("leur", "them, their, theirs");
		map.put("comme", "like, as");
		map.put("ou", "or");
		map.put("si", "if, whether");
		map.put("avant", "before");
		map.put("y", "there");
		map.put("dire", "to say");
		map.put("elle", "she, her");
		map.put("devoir", "to have to, owe; (duty)");
		map.put("donner", "to give");
		map.put("deux", "two");
		map.put("même", "same, even, self");
		map.put("prendre", "to take");
		map.put("où", "where");
		map.put("aussi", "too, also, as");
		map.put("celui", "that, the one, he, him");
		map.put("bien", "well");
		map.put("cela", "that, it [c.l.]");
		map.put("une fois", "time, times");
		map.put("vous", "you [formal]");
		map.put("encore", "again, yet");
		map.put("vouloir", "to want");
		map.put("nouveau", "new");
		map.put("aller", "to go");
		map.put("entre", "between");
		map.put("premier", "first");
		map.put("aucun", "none, either, neither, not any");
		map.put("déjà", "already");
		map.put("grand", "great, big, tall");
		map.put("mon", "my");
		map.put("me", "me, to me, myself ");
		map.put("moins", "less");
		map.put("quelque", "some");
		map.put("lui", "him, her");
		map.put("un temps", "time");
		map.put("très", "very");
		map.put("savoir", "to know [to have the knowledge]");
		map.put("falloir", "to take, need, require");
		map.put("voir", "to see");
		map.put("notre", "our");
		map.put("sans", "without");
		map.put("dont", "whose, of which, (including)");
		map.put("une raison", "reason");
		map.put("un monde", "world, people");
		map.put("non", "no, not");
		map.put("un monsieur", "mister, sir, gentleman");
		map.put("un an", "year");
		map.put("un jour", "day");
		map.put("trouver", "to find");
		map.put("demander", "to ask for");
		map.put("alors", "then, so");
		map.put("après", "after");
		map.put("venir", "to come");
		map.put("une personne", "person, people, anybody, anyone, nobody");
		map.put("rendre", "to render, return, yield, give up");
		map.put("une part", "share");
		map.put("dernier", "last");
		map.put("lequel", "which (one), who, whom");
		map.put("pendant", "during; (pendant)");
		map.put("passer", "to pass");
		map.put("peu", "little");
		map.put("depuis", "since, for");
		map.put("une suite", "result, follow-up, rest");
		map.put("bon", "good");
		map.put("comprendre", "to understand");
		map.put("rester", "to stay");
		map.put("un point", "point; (at all) (masculine)");
		map.put("ainsi", "thus");
		map.put("une heure", "hour");

		return map;
	}
}
