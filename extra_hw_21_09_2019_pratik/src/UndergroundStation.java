import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class UndergroundStation {
    //    This program will ask you to enter any alphabet between A to G and it will gives you station names [LONDON UNDERGROUND - ZONE - 1 ONLY]
//    starting from that alphabet and will tell hyou which tube lines you can get from that station
    static char station;
    static String stationName;

    public static void main(String[] args) {
        londonUnderGround();
    }

    public static void londonUnderGround() {
        System.out.print("Please Input Any Alphabet Between A to G; It Will Print LONDON UNDERGROUND [ZONE 1 ONLY] Station Names \n Starting From That Alphabet For You And Will Tell You Which Tubelines You Can Travel From That Station :");
        for (station = 'A'; station <= 'G'; station++) {
            Scanner scan = new Scanner(System.in);
            station = scan.next().charAt(0);
            station = Character.toUpperCase((station));

            if (station == 'A') {
                System.out.println("Please Find Below List Of Station Names Starting From 'A':  ");
                System.out.println("Aldgate, AldgateEast, Angel,");
                System.out.print("Please Type The Exact Station Name :  ");
                stationName = scan.next();
                if (stationName.equals("Aldgate")) {
                    System.out.println("From 'Aldgate' You Can Find Options For Underground Lines As Below");
                    System.out.println("Metropolitan, Circle");
                }
                if (stationName.equals("AldgateEast")) {
                    System.out.println("From 'Aldgate-East' You Can Find Options For Underground Lines As Below");
                    System.out.println("Hammersmith & City, District");
                }
                if (stationName.equals("Angel")) {
                    System.out.println("From 'Angel' You Can Find Options For Underground Lines As Below");
                    System.out.println("Northen");
                }
            } else if (station == 'B') {
                System.out.println("Please Find Below List Of Station Names Starting From 'B':  ");
                System.out.println("BakerStreet, Bank, Barbican, Bayswater, Blackfriars, BondStreet, Borough");
                System.out.print("Please Type The Exact Station Name :  ");
                stationName = scan.next();
                if (stationName.equals("BakerStreet")) {
                    System.out.println("From 'Baker Street' You Can Find Options For Underground Lines As Below");
                    System.out.println("Metropolitan, Bakerloo, Circle, Jubilee, Hamersmith & City");
                }
                if (stationName.equals("Bank")) {
                    System.out.println("From 'Bank' You Can Find Options For Underground Lines As Below");
                    System.out.println("Waterloo & City, Northern, Central");
                }
                if (stationName.equals("Barbican")) {
                    System.out.println("From 'Barbican' You Can Find Options For Underground Lines As Below");
                    System.out.println("Metropolitan, Circle, Hammersmith & City");
                }
                if (stationName.equals("Bayswater")) {
                    System.out.println("From 'Bayswater' You Can Find Options For Underground Lines As Below");
                    System.out.println("District, Circle");
                }
                if (stationName.equals("Blackfriars")) {
                    System.out.println("From 'Blackfriars' You Can Find Options For Underground Lines As Below");
                    System.out.println("District, Circle");
                }
                if (stationName.equals("BondStreet")) {
                    System.out.println("From 'Bond Street' You Can Find Options For Underground Lines As Below");
                    System.out.println("Central, Jubilee");
                }
                if (stationName.equals("Borough")) {
                    System.out.println("From 'Borough' You Can Find Options For Underground Lines As Below");
                    System.out.println("Northern");
                }

            } else if (station == 'C') {
                System.out.println("Please Find Below List Of Station Names Starting From 'C':  ");
                System.out.println("CannonStreet, ChanceryLane, CharingCross, CoventGarden");
                System.out.print("Please Type The Exact Station Name :  ");
                stationName = scan.next();
                if (stationName.equals("CannonStreet")) {
                    System.out.println("From 'Cannon Street' You Can Find Options For Underground Lines As Below");
                    System.out.println("District, Circle");
                }
                if (stationName.equals("ChanceryLane")) {
                    System.out.println("From 'Chancery Lane' You Can Find Options For Underground Lines As Below");
                    System.out.println("Central");
                }
                if (stationName.equals("CharingCross")) {
                    System.out.println("From 'Chering Cross' You Can Find Options For Underground Lines As Below");
                    System.out.println("Bakerloo, Northern");
                }
                if (stationName.equals("CoventGarden")) {
                    System.out.println("From 'Covent Garden' You Can Find Options For Underground Lines As Below");
                    System.out.println("Piccadilly");
                }

            } else if (station == 'D') {
                System.out.println("SORRY - There Is No Station Names Starting From 'D'In Zone 1 [TFL] :  ");
            } else if (station == 'E') {
                System.out.println("Please Find Below List Of Station Names Starting From 'E':  ");
                System.out.println("EdgwareRoad, EdgwareRaod, Embankment, Euston, EustonSquare, Earl'sCourt, Elephant&Castle");
                System.out.print("Please Type The Exact Station Name :  ");
                stationName = scan.next();
                if (stationName.equals("EdgwareRoad")) {
                    System.out.println("From 'Edgware Road' You Can Find Options For Underground Lines As Below");
                    System.out.println("Bakerloo, Hammersmith & City, District, Circle");
                }
                if (stationName.equals("Embankment")) {
                    System.out.println("From 'Embankment' You Can Find Options For Underground Lines As Below");
                    System.out.println("District, Bakerloo, Northern, Cirlce");
                }
                if (stationName.equals("Euston")) {
                    System.out.println("From 'Euston' You Can Find Options For Underground Lines As Below");
                    System.out.println("Northern, Victoria");
                }
                if (stationName.equals("Earl'sCourt")) {
                    System.out.println("From 'Earl's Court' You Can Find Options For Underground Lines As Below");
                    System.out.println("District, Piccadilly");
                }
                if (stationName.equals("Elephant&Castle")) {
                    System.out.println("From 'Elephant & Castle' You Can Find Options For Underground Lines As Below");
                    System.out.println("Northern, Bakerloo");
                }

            } else if (station == 'F') {
                System.out.println("Please Find Below List Of Station Names Starting From 'F':  ");
                System.out.println("Farringdon");
                System.out.println("From 'Farringdon' You Can Find Options For Underground Lines As Below");
                System.out.println("Metropolitan, Circle, Hammersmith & City");
            } else if (station == 'G') {
                System.out.println("Please Find Below List Of Station Names Starting From 'G':  ");
                System.out.println("GloucestorRoad, GoodgeStreet, Great PortlandStreet, GreenPark");
                System.out.print("Please Type The Exact Station Name :  ");
                stationName = scan.next();
                if (stationName.equals("GloucesterRoad")) {
                    System.out.println("From 'Gloucester Road' You Can Find Options For Underground Lines As Below");
                    System.out.println("District, Piccadilly, Circle");
                }
                if (stationName.equals("GoodgeStreet")) {
                    System.out.println("From 'Goodge Street' You Can Find Options For Underground Lines As Below");
                    System.out.println("Northern");
                }
                if (stationName.equals("GreatPortlandStreet")) {
                    System.out.println("From 'Great Portland Street' You Can Find Options For Underground Lines As Below");
                    System.out.println("Metropolitan, Circle, Hammersmith & City");
                }
                if (stationName.equals("GrrenPark")) {
                    System.out.println("From 'Green Park' You Can Find Options For Underground Lines As Below");
                    System.out.println("Piccadilly, Victoria, Jubilee");
                }
            }
            if (station > 'G') {
                System.out.println("SORRY - This Program Is All About Alphabet A To G Only, Thanks.");

            }
            break;
        }

    }

}


