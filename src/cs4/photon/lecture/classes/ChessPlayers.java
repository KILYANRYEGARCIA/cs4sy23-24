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
public class ChessPlayers {
    String name;
    int age;
    double CurrentElo;
    double PeakElo;
        
    public ChessPlayers(String name, int age, double CurrentElo, double PeakElo){
        this.name = name;
        this.age =age;
        this.CurrentElo = CurrentElo;
        this.PeakElo = PeakElo;
    }
}
