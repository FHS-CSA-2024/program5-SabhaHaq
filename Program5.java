


public class Program5 {
     public static void main(String[] args) {
         //Variables
         int royalMiles = 286;
         double royalGallons = 9.0; 
         int koopaKingMiles = 412; 
         double koopaKingGallons = 40.0;
         int pipeFrameMiles = 361;
         double pipeFrameGallons = 18.0; 
         int badwagonMiles = 161;
         double badwagonGallons = 11.0; 
          
         //Your code here
         double royale = (double) (royalMiles/royalGallons)*100;
         int royal1 = (int) (royale + 5)/10;
         double royal2 = (double) royal1/10;
         
         double koopaKing = (double) (koopaKingMiles/ koopaKingGallons)*100; 
         int koopaKing1 = (int) (koopaKing + 5)/10;
         double koopaKing2 = (double) koopaKing1/10;
          
         double pipeFrame = (double)  (pipeFrameMiles/pipeFrameGallons)*100; 
         int pipeFrame1 = (int) (pipeFrame + 5)/10;
         double pipeFrame2 = (double) pipeFrame1/10;
         
         double badWagon = (double)  (badwagonMiles/badwagonGallons)*100; 
         int badWagon1 = (int) (badWagon + 5)/10; 
         double badWagon2 = (double) badWagon1/10; 
         
         System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
         System.out.println("Royal averaged " + royal2 );
         System.out.println("Koopa King averaged " + koopaKing2);
         System.out.println("Pipe Frame averaged " + pipeFrame2); 
         System.out.println("Bad Wagon averaged " + badWagon2);
        
        }
    }
         
         
         


//Paste console output below:
/*
 Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royal averaged 31.8
Koopa King averaged 10.3
Pipe Frame averaged 20.1
Bad Wagon averaged 14.6
