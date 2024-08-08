/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.List;

/**
 *
 * @author Marlon Ramirez
 */
public class Menus {
    String TypeMenu;
    String ClientName;
    String CLientAdresss;
    String Number;
    List<String> Extras;

    public Menus(String TypeMenu, String ClientName, String CLientAdresss, String Number, List<String> Extras) {
        this.TypeMenu = TypeMenu;
        this.ClientName = ClientName;
        this.CLientAdresss = CLientAdresss;
        this.Number = Number;
        this.Extras = Extras;
    }

    public String getTypeMenu() {
        return TypeMenu;
    }

    public void setTypeMenu(String TypeMenu) {
        this.TypeMenu = TypeMenu;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getCLientAdresss() {
        return CLientAdresss;
    }

    public void setCLientAdresss(String CLientAdresss) {
        this.CLientAdresss = CLientAdresss;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public List<String> getExtras() {
        return Extras;
    }

    public void setExtras(List<String> Extras) {
        this.Extras = Extras;
    } 
}
