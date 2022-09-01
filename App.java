public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyAgility();
        knight.sayMyIntelligence();
        

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
        
        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "Gondar";
        thief.sayMyName();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();

       archer.strength = 5;
       archer.agility = 5;
       archer.intelligence = 5;
       archer.name = "Tan";
       archer.sayMyName();
       archer.sayMyStrength();
       archer.sayMyAgility();
       archer.sayMyIntelligence();

       //Weapon Class

       Weapon Sword = new Weapon();
       Sword.damage = 100;
       Sword.name = "Tantan's Sword";
       Sword.weight = 5.5f;
       Sword.hasElementalDamage = false;
       Sword.description = "A sword owned by Tantan";

       

      



        
    }
}
