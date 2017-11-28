import java.util.*;

public class characterPlayer
{

   //Player stats and information
   private String name;
   private String gender;
   private int fullHealth;
   private int tempHealth;
   private double level;
   private double money;
   private int strength;   //player given value between 1-10; values of the sum of all 4 must be less then 10 when chosen at start
   private int agility;    //player given value between 1-10; values of the sum of all 4 must be less then 10 when chosen at start
   private int charisma;   //player given value between 1-10; values of the sum of all 4 must be less then 10 when chosen at start
   private int luck;       //player given value between 1-10; values of the sum of all 4 must be less then 10 when chosen at start
   private int armorRating;
   private int accuracyMultiplier;
   private ArrayList inventory = new ArrayList();


   //Default constructor
   public characterPlayer()
   {
      name = "";
      gender = "";
      fullHealth = 100;
      level = 0;
      money = 0;
      strength = 1;
      agility = 1;
      charisma = 1;
      luck = 1;
      armorRating = 0;
      accuracyMultiplier = 1;
   }
   
   //Input Constructor
   public characterPlayer(String nameInput, String genderInput, int strengthInput, int agilityInput, int charismaInput, int luckInput)
   {
      name = nameInput;
      gender = genderInput;
      fullHealth = 100;
      level = 0;
      money = 0;
      strength = strengthInput;
      agility = agilityInput;
      charisma = charismaInput;
      luck = luckInput;
      armorRating = 0;
      accuracyMultiplier = 1;
   }
   
   
   //-------------------------------------------------------------------------------------
   
   //Methods for fullHealth
   public void setFullHealth(int fullHealthTest)
   {
      fullHealth = fullHealthTest;
   }
   public int getFullHealth()
   {
      return fullHealth;
   }
   
   //Methods for tempHealth
   public void setTempHealth(int tempHealthTest)
   {
      tempHealth = tempHealthTest;
   }
   public int getTempHealth()
   {
      return tempHealth;
   }
   
   //Methods for level
   public void setLevel(int levelTest)
   {
      level = levelTest;
   }
   public int getLevel()
   {
      return level;
   }
}