package decHep;

public class Scorecard {

    String[][] Scorecard = new String[0][0];

    public void scorecard(int participant, String event, float result, boolean check) {
        if (check == true) {
            Scorecard = new String[participant + 1][22];
            Scorecard[0][0] = "Participants";                //Scorecard [1][0]  Name of first participants
            Scorecard[0][1] = "100m Result";                //Scorecard [1][1]  for adding 100m result for participants number 1
            Scorecard[0][2] = "100m Points";
            Scorecard[0][3] = "Long jump Result";           //Scorecard [1][3]  for adding Long jump result for participants number 1
            Scorecard[0][4] = "Long jump Points";
            Scorecard[0][5] = "Shot put Result";            //Scorecard [1][5]  for adding Shot put result for participants number 1
            Scorecard[0][6] = "Shot put Points";
            Scorecard[0][7] = "High jump Result";
            Scorecard[0][8] = "High jump Points";
            Scorecard[0][9] = "400m Result";
            Scorecard[0][10] = "400m Points";
            Scorecard[0][11] = "110m hurdles Result";
            Scorecard[0][12] = "110m hurdles Points";
            Scorecard[0][13] = "Discus throw Result";
            Scorecard[0][14] = "Discus throw Points";
            Scorecard[0][15] = "Pole vault Result";
            Scorecard[0][16] = "Pole vault Points";
            Scorecard[0][17] = "Javelin throw Result";
            Scorecard[0][18] = "Javelin throw Points";
            Scorecard[0][19] = "1500m Result";
            Scorecard[0][20] = "1500m Points";
            Scorecard[0][21] = "Total Points";
        } else {


          /*  for (int i = 0; i < int1 + 1; i++) {
                for (int j = 0; j < 22; j++) {
                    System.out.print("| " + Scorecard[i][j] + "| ");
                }
                System.out.println("   ");
            }
*/
        }
    }
}
