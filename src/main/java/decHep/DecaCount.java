package decHep;

public class DecaCount {

    double p = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;
    double e = 0;
    int result = 0;
    int score =0;

    public int decaCount(String event, Double result) {

        switch (event){
            case "100m" ->{
                score=calculateRun(result, 25.4347,18,1.81);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got "+ score +" points");

            }
            case "400m" ->{
                score=calculateRun(result, 1.53775,82,1.81);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got "+ score +" points");

            }
            case "110m hurdles" ->{
                score=calculateRun(result, 5.74352,28.5 ,1.92);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got "+ score +" points");
            }
            case "1500m" ->{
                score=calculateRun(result, 0.03768,480,204.87);
                System.out.println("The event is " + event + " and your time is " + result + " Sec and you got "+ score +" points");
            }
            case "Long jump" ->{
                score=calculateJump(result , 0.14354, 220,1.4);
                System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got "+ score +" points");
            }
            case "High jump" ->{
                score=calculateJump(result , 0.8465, 75,1.42);
                System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got "+ score +" points");
            }
            case "Pole vault" ->{
                score=calculateJump(result , 0.2797, 100,1.35);
                System.out.println("The event is " + event + " and you jumped " + result + " Centimeters and you got "+ score +" points");
            }
            case "Shot put" -> {
                score=calculateThrow(result, 51.39, 1.5,1.05);
                System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got "+ score +" points");
            }
            case "Discus throw" -> {
                score=calculateThrow(result, 12.91, 4,41.51);
                System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got "+ score +" points");
            }
            case "Javelin throw" -> {
                score=calculateThrow(result, 10.14, 7,1.08);
                System.out.println("The event is " + event + " and you Threw " + result + " Meters and you got "+ score +" points");
            }
        }
        return score;
    }

    private int calculateJump(double result,double a,double b, double c) {             //  (a(p-b)^c)
        p = result;
        d = p-b;
        e = Math.pow(d, c)*a;
        return (int) this.e;
    }

    private int calculateThrow(double result,double a,double b, double c) {        //  (a(p-b)^c)
        p = result;
        d = p - b;
        e = Math.pow(d, c)*a;
        return (int) this.e;
    }

    private int calculateRun(double result,double a,double b, double c) {            //  (a(b-p)^c)
        p = result;
        d = b - p;
        e = Math.pow(d, c)*a;
        return (int) this.e;
    }

}
