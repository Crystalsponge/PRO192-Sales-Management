/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

//Mainly validation methods and menu UI
public class utils {
    public static boolean notEmpty(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }
        return true;
    }
    public static boolean notNull(Object object) {
        return object != null;
    }
    public static boolean validateName(String s) {
        if(!notEmpty(s)) {
            System.out.println("Name cannot be empty");
            return false;
        }
        if(s.matches(".*\\d.*")) {
            System.out.println("Name cannot contain number");
            return false;
        }
        return true;
    }
    public static boolean validatePhone(String s) {
        if(!notEmpty(s)) {
            System.out.println("Phone cannot be empty");
            return false;
        }
        if(!s.matches("0\\d{9}")) {
            System.out.println("Phone number must be 10 digits");
            return false;
        }
        return true;
    }
}

