import java.util.Random;
import java.util.Scanner;
public class textAdventure {
    

    public static void main(String[] args) {

        //Variables and stuff
        Scanner myScanner = new Scanner(System.in);
        Random myRandomGen =  new Random();
        String[] enemies= {"COVID-19", "Murder Hornet", "Rioter", "Camel-ah", "commalah"};
        int enemyHealthMax=80;
        int enemyDamageMax=50;
        int playerHealthMax=202;
        int playerDamageMax=40;
        int runAway=3;
        int healthPotionCarried=5;
        int killCounter=0;
        int healthPotionDrop= 50; 
        boolean gameRunning=true;



        //Game starting
        System.out.println("Welcome to 2020. Can you survive?");
        game:
        while(gameRunning) {
            System.out.println("------------------------------------------");
            int enemyHealth= myRandomGen.nextInt(enemyHealthMax);
            String enemyName= enemies[myRandomGen.nextInt(enemies.length)];
            int enemyDamage=myRandomGen.nextInt(enemyDamageMax);
            System.out.println("A wild "+enemyName+ " has appeared!");
            while (enemyHealth>0) {
                System.out.println("The "+enemyName+" looks at you with a stone-cold gaze.");
                System.out.println("You can-");
                System.out.println("1. Attack the "+enemyName);
                System.out.println("2. Drink a potion");
                System.out.println("3. See information on the enemy and yourself");
                if(runAway>0) {
                System.out.println("4. Run away. You can run away "+runAway+" more times.");
                }

                int i= myScanner.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("You strike the "+enemyName+" with your sword!");
                        enemyHealth-=playerDamageMax;
                        System.out.println("The "+enemyName+" viciously strikes you.");
                        playerHealthMax-=enemyDamage;
                        if(playerHealthMax<0) {
                            System.out.println("You have died. You killed "+killCounter+"monsters.");
                            gameRunning=false;
                            break;
                        }
                        break;
                    case 2:
                    if(healthPotionCarried>0) {
                    System.out.println("You quickly guzzle your health potion.");
                        if (playerHealthMax > 202-30) {
                            playerHealthMax=202;
                        } else {
                            playerHealthMax+=30;
                        }
                        System.out.println("The "+enemyName+" viciously strikes you.");
                        playerHealthMax-=enemyDamage;
                        if(playerHealthMax<0) {
                            System.out.println("You have died. You killed "+killCounter+"monsters.");
                            gameRunning=false;
                            break;
                        }
                    } else {
                        System.out.println("You have no more health potions!");
                        System.out.println("The "+enemyName+" viciously strikes you.");
                        playerHealthMax-=enemyDamage;
                        if(playerHealthMax<0) {
                            System.out.println("You have died. You killed "+killCounter+"monsters.");
                            gameRunning=false;
                            break;
                        }

                    }
                        break;
                    case 3:
                        System.out.println("You:");
                        System.out.println("Health: "+playerHealthMax);
                        System.out.println("Damage: "+playerDamageMax);
                        System.out.println("Potions carried: "+healthPotionCarried);
                        System.out.println("Run away attempts left: "+runAway);
                        System.out.println("Your opponent: ");
                        System.out.println("Name: "+ enemyName);
                        System.out.println("Health: "+enemyHealth);
                        System.out.println("The "+enemyName+" viciously strikes you.");
                        playerHealthMax-=enemyDamage;
                        System.out.println("------------------------------------------");
                        System.out.println("You can-");
                        System.out.println("1. Attack the "+enemyName);
                        System.out.println("2. Drink a potion");
                        if(runAway>0) {
                            System.out.println("3. Run away. You can run away "+runAway+" more times.");
                        }
                        int input= myScanner.nextInt();
                        switch (input) {
                            case 1:
                            System.out.println("You strike the "+enemyName+" with your sword!");
                            enemyHealth-=playerDamageMax;
                            System.out.println("The "+enemyName+" viciously strikes you.");
                            playerHealthMax-=enemyDamage;
                            if(playerHealthMax<0) {
                                System.out.println("You have died. You killed "+killCounter+"monsters.");
                                gameRunning=false;
                                break;
                            }
                                break;
                                case 2:
                                if(healthPotionCarried>0) {
                                System.out.println("You quickly guzzle your health potion.");
                                    if (playerHealthMax > 202-30) {
                                        playerHealthMax=202;
                                    } else {
                                        playerHealthMax+=30;
                                    }
                                    System.out.println("The "+enemyName+" viciously strikes you.");
                                    playerHealthMax-=enemyDamage;
                                    if(playerHealthMax<0) {
                                        System.out.println("You have died. You killed "+killCounter+"monsters.");
                                        gameRunning=false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have no more health potions!");
                                    System.out.println("The "+enemyName+" viciously strikes you.");
                                    playerHealthMax-=enemyDamage;
                                    if(playerHealthMax<0) {
                                        System.out.println("You have died. You killed "+killCounter+"monsters.");
                                        gameRunning=false;
                                        break;
                                    }
            
                                }
                                    break;
                            case 3:
                            if(runAway>0) {
                                System.out.println("You barely escape the foaming jaws of the "+enemyName+"!");
                                enemyHealth=0;
                                runAway--;
                                break;
                                } else {
                                    System.out.println("You strike the "+enemyName+" with your sword!");
                                    enemyHealth-=playerDamageMax;
                                    System.out.println("The "+enemyName+" viciously strikes you.");
                            playerHealthMax-=enemyDamage;
                            if(playerHealthMax<0) {
                                System.out.println("You have died. You killed "+killCounter+"monsters.");
                                gameRunning=false;
                                break;
                            }
                                }
                                break;
                        
                            default:
                            System.out.println("You strike the "+enemyName+" with your sword!");
                            enemyHealth-=playerDamageMax;
                            System.out.println("The "+enemyName+" viciously strikes you.");
                            playerHealthMax-=enemyDamage;
                            if(playerHealthMax<0) {
                                System.out.println("You have died. You killed "+killCounter+"monsters.");
                                gameRunning=false;
                                break;
                            }
                             
                                break;
                        }
                        break;
                    case 4:
                    if(runAway>0) {
                    System.out.println("You barely escape the foaming jaws of the "+enemyName+"!");
                    enemyHealth=0;
                    runAway--;
                    break;
                    } else {
                        System.out.println("You strike the "+enemyName+" with your sword!");
                        enemyHealth-=playerDamageMax;
                        System.out.println("The "+enemyName+" viciously strikes you.");
                            playerHealthMax-=enemyDamage;
                            if(playerHealthMax<0) {
                                System.out.println("You have died. You killed "+killCounter+"monsters.");
                                gameRunning=false;
                                break;
                            }
                    }
                        break;
                
                    default:
                    System.out.println("You strike the "+enemyName+" with your sword!");
                        enemyHealth-=playerDamageMax;
                        System.out.println("The "+enemyName+" viciously strikes you.");
                            playerHealthMax-=enemyDamage;
                            if(playerHealthMax<0) {
                                System.out.println("You have died. You killed "+killCounter+" monsters.");
                                gameRunning=false;
                                break;
                            }
                        break;
                }

            }
            System.out.println("The " + enemyName+" is gone!");
            killCounter++;
            if (myRandomGen.nextInt(100) <= healthPotionDrop) {
                System.out.println(enemyName+" dropped a health potion. You pick it up.");
                healthPotionDrop++;
            }
            System.out.println("------------------------------------------");

        }
    }
}