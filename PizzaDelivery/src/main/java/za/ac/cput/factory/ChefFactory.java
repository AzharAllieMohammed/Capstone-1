package za.ac.cput.factory;

import za.ac.cput.domain.Chef;
import za.ac.cput.util.Helper;

/*
* ChefFactory.java
* Author: Dawood Kamalie  (220147760)
* Date: 7/4/2023
* */
public class ChefFactory {
    public static Chef createChef(String empId, String chefName, String chefSurname, String chefId, String nationality, String culinaryExperience) {
        if (Helper.isNullOrEmpty(empId) ||Helper.isNullOrEmpty(chefName) ||Helper.isNullOrEmpty(chefSurname) ||Helper.isNullOrEmpty(chefId) || Helper.isNullOrEmpty(nationality) || Helper.isNullOrEmpty(culinaryExperience)) {
            return null;
        }

        String orderId = Helper.generateId();

        Chef chef = new Chef.Builder().setEmpId(empId).setChefName(chefName).setChefSurname(chefSurname).setChefId(chefId).setNationality(nationality).setCulinaryExperience(culinaryExperience).build();
        return chef;
    }
}
