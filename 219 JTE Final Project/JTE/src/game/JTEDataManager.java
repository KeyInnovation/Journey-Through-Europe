/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ui.JTEUI;
import ui.Map;
import ui.Player;

/**
 *
 * @author Antony Kwok
 */
public class JTEDataManager {
    JTEUI lastSavedGame;
    ArrayList<Map> maps;
    ArrayList<Player> players;
    ObjectOutputStream output;
    ObjectInputStream input;
    JTEUI ui;
    
    public JTEDataManager(JTEUI ui)
    {this.ui = ui;
        maps = new ArrayList<Map>();
       players = new ArrayList<Player>();}
    
    public void save(Map m){}
    public void save (Player p){}
    public boolean hasSave()
    { if(players.size() != 0) 
        return true; 
    else 
        return false;}
    public ArrayList<Player> loadPlayers(){return players;}
    public ArrayList<Map> loadMaps(){return maps;}
}
