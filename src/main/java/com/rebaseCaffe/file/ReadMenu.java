package com.rebaseCaffe.file;

import com.rebaseCaffe.model.Dish;
import com.rebaseCaffe.model.Menu;

import java.io.IOException;
import java.util.*;

import static com.rebaseCaffe.file.FileUtils.*;

public class ReadMenu implements FileParser<Menu> {

    public Menu parse(String FileName) {
        try {
            Set<Dish> menuOfDish = new HashSet<>();
            String stringData = read(FileName);

            for (String dataDish : stringData.split("\n")) {
                //думаю лучше что б оно(или не лучше) передавало массив строк в конструктор, но пока сойдет
                if (stringData.split("\n").length != 3){
                    throw new RuntimeException();
                }
                menuOfDish.add(new Dish(dataDish.split(",")[1], dataDish.split(",")[2], dataDish.split(",")[3]));
            }

            return new Menu(menuOfDish);


        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);

        }

    }


}
