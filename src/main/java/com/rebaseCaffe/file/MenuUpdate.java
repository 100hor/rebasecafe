package com.rebaseCaffe.file;

import com.rebaseCaffe.model.Dish;
import com.rebaseCaffe.model.Menu;

import java.io.FileNotFoundException;

import static com.rebaseCaffe.file.FileUtils.*;


public class MenuUpdate{


    private static void newMenuFile (String filename, Menu newMenu){
        newMenu.getDishSet().forEach(iter -> write(filename, iter.toString()));
    }

    private static void updateMenuFile(String filename, Menu updatedMenu){
            updatedMenu.getDishSet().forEach(iter -> {
                try {
                    update(filename, iter.toString());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });

    }

    public static Menu addDishToMenu(String filename, Menu existedMenu, Dish newDish){
        existedMenu.getDishSet().add(newDish);
        updateMenuFile(filename, existedMenu);
        return existedMenu;
    }

    public static Menu deleteDishFromMenu(String filename, Menu existedMenu, String deletedDishTitle){
        for (Dish iter: existedMenu.getDishSet()){
            if (iter.getTitle().equals(deletedDishTitle)){
                existedMenu.getDishSet().remove(iter);
                break;
            }
        }
        updateMenuFile(filename, existedMenu);
        return existedMenu;
    }


}
