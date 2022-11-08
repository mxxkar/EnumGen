/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accounttype;

/**
 *
 * @author Sekar Ambar Arum - enum
 */
public class AccountType {

    static AccountType DEPOSIT;

    String name() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getRate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  enum Type {
    CURRENT("CU", 1.0),
    SAVINGS("SA", 2.0),
    DEPOSIT("DP", 3.0);
    private String code;
    private double rate;
    private Type(String code, double rate){
        this.code = code;
        this.rate = rate;

    }
    
    public String getCode() {
        return code;
        }
    public double getRate() {
        return rate;
        }
    }
    
}
