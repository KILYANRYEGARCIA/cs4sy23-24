/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4.photon.lecture.classes;

/**
 *
 * @author PHOTON
 */
public class CS4PhotonLectureClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChessPlayers MagnusCarlsen = new ChessPlayers("Magnus Carlsen", 32, 2839, 2882);
        ChessPlayers FabianoCaruana = new ChessPlayers("Fabiano Caruana", 31, 2786, 2844);
        ChessPlayers GarryKasparov = new ChessPlayers("Garry Kasparov", 60, 2600, 2851);
        
        System.out.println(MagnusCarlsen.age + FabianoCaruana.age - GarryKasparov.age);
        System.out.println(MagnusCarlsen.PeakElo > GarryKasparov.PeakElo);
        System.out.println(MagnusCarlsen.PeakElo > ((GarryKasparov.CurrentElo + FabianoCaruana.CurrentElo)/2)); 
    }
    
}

