import com.thedeanda.lorem.LoremIpsum;

import java.util.ArrayList;
import java.util.UUID;

public class HeroesData {
    private String[] heroes = {"Groo","Groo the Wanderer","Janet van Dyme","Avengers","Nova","Averngers","Adam Strange","R.E.B.E.L.S.","The Falcon","Avengers","The Savage Dragon","Image","Supergirl","Superman","Donna Troy","Wonder Woman","Usagi Yojimbo","Usagi Yojimbo","Cerebus","Cerebus the Aardvark","Ghost Rider","Ghost Rider","Moon Knight","Moon Knight/Avengers","She-Hulk","The Hulk","Renee Montoya","Batman/The Question","Michonne","The Walking Dead","Black Lightning","Black Lightning","Ka-Zar","Ka-Zar","Superboy","Superman","Eric O’Grady (Ant-Man)","Avengers","Black Canary","Birds of Prey","Nightcrawler","X-Men","Captain Britain","Avengers/MI13","Srg. Rock","DC","Namor","X-Men","The Rocketeer","The Rocketeer","Marv","Sin City","Black Widow","Avengers","Jonah Hex","DC","Luke Cage","Heros for Hire/Avengers","Wildcat","JSA","The Spectre","DC","Scott Pilgrim","Scott Pilgrim","Iron Fist","Heroes for Hire","Hank Pym","Avengers","Invisible Woman","Fantastic Four","Gambit","X-Men","The Atom (Ray Palmer)","JLA","Blade","Blade","Dashell Bad Horse","Vertigo","Blue Beetle (Ted Kord)","JLA","Fone Bone","Bone","Booster Gold","JLA","Beast","X-Men","The Tick","The Tick","Hawkman","JSA","John Steward","Green Lantern","Elijah Snow","Planetary (Wildstorm)","Bucky Barnes","Captain America/Avengers","Aquaman","Aquaman","Black Panther","Black Panther","Captain Marvel","Captain Marvel","Barry Allen","The Flash","Mitchell Hundred","Ex-Machina","Kitty Pride","X-Men","The Human Torch","Fantastic Four","Spider Jerusalem","Vertigo","Hawkeye","Avengers","Martian Manhunter","JLA","Storm","X-Men","Silver Surfer","Fantastic Four","Mr Fantastic","Fantastic Four","Cyclops","X-Men","Doctor Strange","Doctor Strange","The Crow","Caliber Comics","Spawn","Image","Judge Dredd","2000 AD","Jesse Custer","Preacher","Nick Fury","S.H.I.E.L.D.","Tim Drake","Robin","Deadpool","Wolverine","Green Arrow","JLA","John Constantine","Hellblazer","Swamp Thing","Swamp Thing","The Punisher","The Punisher","Rick Grimes","The Walking Dead","Hellboy","Hellboy","Yorick Brown","Y: The Last Man","Raphael","Teenage Mutant Ninja Turtles","Charles Xavier","X-Men","The Spirit","The Spirit","Catwoman","Batman","James Gordon","Batman","The Thing","Fantastic Four","Barbara Gordon","Batman/Birds of Prey","Rorshach","Watchmen","Dream of the Endless","The Sandman","Thor","Avengers","Jean Grey","X-Men","Iron Man","Avengers","Dick Grayson","Batman","Daredevil","Daredevil","The Hulk","Avengers","Wally West","The Flash/JLA","Hal Jordan","Green Lantern/JLA","Captain America","Avengers","Wonder Woman","Wonder Woman/JLA","Wolverine","X-Men/Wolverine","Spiderman","Spiderman","Batman","Batman/JLA","Superman","Superman/JLA","M.O.D.O.K.","Captain America","Fin Fang Foom","Iron Man","Mastermind","X-Men","Violator","Spawn","Despero","Justice League","Omega Red","X-Men","Annihilus","Fantastic Four","Omni Man","Invincible","Parallax","Green Lantern","The Adversary","Fables","Carnage","Spiderman","Shade","The Flash","Hunter Rose","Batman","Electro","Spiderman","The Governor","The Walking Dead","Mysterio","Spiderman","Doctor Light","DC Universe","Grigori Rasputin","Hellboy","Doctor Sivana","Captain Marvel","Mandarin","Iron Man","Prometheus","Justice League","Mirror Master","The Flash","Lady Deathstrike","X-Men","Proteus","X-Men","Mister Mxyzptlk","Superman","Magog","Justice League","Saint of Killers","The Preacher","Clayface","Batman","Sandman","Spiderman","Thunderbolt Ross","The Incredible Hulk","William Stryker","X-Men","Cheetah","Wonder Woman","Lucifer","Sandman","Mr. Freeze","Batman","Herr Starr","The Preacher","Kang the Conqueror","The Avengers","Poison Ivy","Batman","The Leader","The Incredible Hulk","The Lizard","Spiderman","Parasite","Superman","Amanda Waller","DC Comics","The Riddler","Batman","Scarecrow","Batman","Hobgoblin","Spiderman","Dormammu","Doctor Strange","Sebastian Shaw","X-Men","Abomination","The Incredible Hulk","Kraven the Hunter","Spiderman","Metallo","Superman","Penguin","Batman","Cassandra Nova","X-Men","Anti Monitor","DC Universe","Mephisto","Marvel Universe","Thanos","Marvel Universe","Doomsday","Superman","Harley Quinn","Batman","Sabretooth","X-Men","Deadshot","Batman","Talia Al Ghul","Batman","Mongul","DC Universe","Baron Zemo II","Captain America","Shredder","Teenage Mutant Ninja Turtles","Sentinels","X-Men","Zoom","The Flash","Vandal Savage","DC Universe","Gorilla Grodd","The Flash","Bane","Batman","Cyborg Superman","Superman","Deathstroke","Teen Titans","Professor Zoom","The Flash","General Zod","Superman","Mr. Sinister","X-Men","Doctor Octopus","Spiderman","Captain Cold","The Flash","Kid Miracleman","DC Universe","Bizarro","Superman","Apocalypse","X-Men","Ultron","The Avengers","Venom","Spiderman","Ozymandias","Watchmen","Bullseye","Daredevil","Juggernaut","X-Men","Mystique","X-Men","Brainiac","Superman","Black Adam","DC Universe","Sinestro","Green Lantern","Red Skull","Captain America","Green Goblin","Spiderman","Two Face","Batman","Catwoman","Batman","The Kingpin","Daredevil","Dark Phoenix","X-Men","Loki","Thor","Ra’s Al Ghul","Batman","Darkseid","Superman","Galactus","Marvel Universe","Lex Luthor","Superman","Dr. Doom","Fantastic Four","The Joker","Batman","Magneto","X-Men"};

    public String rndNombre(){
        int rnd = (int) (Math.random() * heroes.length);
        return heroes[rnd];
    }

    public String rndDescripcion(){
        LoremIpsum lorem = LoremIpsum.getInstance();
        return lorem.getWords(10, 20);
    }

    public boolean rndCapa(){
        int rnd = (int) (Math.random() * 2);
        return rnd == 1;
    }

    public double rndPrecio(){
        return Math.random() * 5000;
    }

    public String rndCodigo(){
        return UUID.randomUUID().toString();
    }

    public double rndAlto(){
        return Math.random() * 100;
    }
    public double rndAncho(){
        return Math.random() * 100;
    }
    public double rndProfundidad(){
        return Math.random() * 100;
    }






}
