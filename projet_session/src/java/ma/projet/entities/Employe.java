/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity

public class Employe extends User{

    public Employe() {
    }

    public Employe(String email, String password) {
        super(email, password);
    }



 

    @Override
    public String toString() {
        return "Employe{" + '}';
    }
    
    
    
    
}
