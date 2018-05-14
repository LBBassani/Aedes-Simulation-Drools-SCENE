/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.study.scenary.entities;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

@Role(Role.Type.EVENT)
@Expires("38d")

/**
 *
 * @author alessandro
 */
public class Mosquito{

   private House house;
   private House born;

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	
	    public House getBorn() {
	        return born;
	    }

	    public void setBorn(House born) {
	        this.born = born;
	    }
	   
   
}
