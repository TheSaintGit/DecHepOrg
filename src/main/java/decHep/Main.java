package decHep;

import java.util.Scanner;

public class Main {
   static NameSaver nameSaver = new NameSaver();
    static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {


            boolean Notquit = true;
            while (Notquit) {

                System.out.println("Main Menu. Make a choise, ");
                System.out.println("Press:");
                System.out.println("1: start a new contest");
                System.out.println("2: load old scoreboard");
                System.out.println("3: quit");

                int valMeny1 = scan.nextInt();
                scan.nextLine();
                if (valMeny1 == 1) {

                    System.out.println("start new contest");
                    System.out.println("make a choise:");
                    System.out.println("press");
                    System.out.println("1: Decathlon");
                    System.out.println("2: Hepathlon");
                    System.out.println("3: Back to main menu");

                    int valMeny2 = scan.nextInt();
                    scan.nextLine();
                    if (valMeny2 == 1) {
                        //Namn på tävling
                        System.out.println("Name your contest");
                        String Contest=scan.nextLine();
                        nameSaver.SetContest(Contest);

                        //välj antal deltagare
                        System.out.println("Write the numbers of participants you want in your scoreboard ");
                        int Deltagare = scan.nextInt();
                        scan.nextLine();
                        nameSaver.setAthlets(Deltagare);

                        // deltagarnas namn
                        for (int i = 0; i < nameSaver.getNames().length; i++) {
                            System.out.println("write the participants name:" + (i + 1));
                            String name = scan.nextLine();
                            nameSaver.setName(i, name);

                            //poäng  för alla deltagare
                            //System.out.println("Write scores for your participants");

                        }
                        setscore();
                    } else if (valMeny2 == 2) {

                        System.out.println("Name your contest");
                        String Contest=scan.nextLine();
                        nameSaver.SetContest(Contest);

                        //välj antal deltagare
                        System.out.println("Write the numbers of participants you want in your scoreboard ");
                        int Deltagare2 = scan.nextInt();
                        nameSaver.setAthlets(Deltagare2);

                        // deltagarnas namn

                        for (int i = 0; i < nameSaver.getNames().length; i++) {
                            System.out.println("write the participants name:" + (i + 1));
                            String name2 = scan.nextLine();
                            nameSaver.setName(i, name2);}

                        //poäng för alla deltagare
                    }
                    else  if(valMeny2==3){
                        System.out.println("back to main menu"); }




                }
                else if (valMeny1==2){
                    System.out.println("Load old contest");
                    System.out.println("make a choise");
                    //Här kommer sparade tävlingar

                }
                else if (valMeny1 ==3) {
                    System.out.println("Quit, GoodBye!");
                    Notquit=false;
                }
            }
        }

    public static void setscore() {

        String [] names = nameSaver.getNames();
        String[][] Scorecard = new String[names.length+1][7];
        Scorecard[0][0] = "Participants";                //Scorecard [1][0]  Name of first participants
        Scorecard[0][1] = "100m Result";                //Scorecard [1][1]  for adding 100m result for participants number 1
        Scorecard[0][2] = "100m Points";
        Scorecard[0][3] = "Long jump Result";           //Scorecard [1][3]  for adding Long jump result for participants number 1
        Scorecard[0][4] = "Long jump Points";
        Scorecard[0][5] = "Shot put Result";            //Scorecard [1][5]  for adding Shot put result for participants number 1
        Scorecard[0][6] = "Shot put Points";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            Scorecard[i + 1][0] = names[i];
        }
            // Hämta uträkning

            System.out.println("Ange resultat i sekunder på  " + names[0] + " på 100m");
            double result=scan.nextDouble();
            DecaCount ScoreDeca = new DecaCount();
            Scorecard[2][1]=String.valueOf(result);
            Scorecard[2][2]=String.valueOf(ScoreDeca.decaCount("100m",result));




            for (int k = 0; k < names.length+1; k++) {                                   // Skriver ut scorecard
                for (int j = 0; j < 7; j++) {
                    System.out.print("| " + Scorecard[k][j] + "| ");
                }
                System.out.println("   ");
            }



        /*  String [] names = nameSaver.getNames();
            String [] event = new String []{"100m","Long jump","Shot put","High jump","400m","110m hurdles","Discus throw","Pole vault","Javelin throw","1500m"};
            int[][] score = new int[event.length][names.length];
            for(int i  = 0; i < event.length; i++) {
            for (var j = 0; j < names.length; j++) {
                score[i][j] = 10000;
            }
        }
        */
    }
}

