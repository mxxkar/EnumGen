/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttype;

/**
 *
 * @author LENOVO
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccountType account = AccountType.DEPOSIT;
        System.out.println("Type: " + account.name()
        +"\nCode: " + account.getCode()
        +"\nRate: " + account.getRate());
    
        
        Cell<Integer> integerCell = new Cell<Integer>();
        Cell<String> stringCell = new Cell<String>();
        integerCell.setValue(1);
        stringCell.setValue("One");
        int num = integerCell.getValue();
        String str = stringCell.getValue();
        System.out.println("Integer Value: " + num);
        System.out.println("String Value : " + str);
        
        GenMet gmc = new GenMet();
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"This","is","fun"};
        gmc.printArray(integerArray);
        gmc.printArray(stringArray); 
    }
    
}