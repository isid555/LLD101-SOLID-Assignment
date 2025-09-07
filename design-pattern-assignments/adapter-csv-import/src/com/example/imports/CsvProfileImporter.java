package com.example.imports;
import java.nio.file.Path;
import java.util.List;

import java.io.IOException;
import java.io.UncheckedIOException;



public class CsvProfileImporter implements ProfileImporter{


    private final NaiveCsvReader csvReader ;
    private final ProfileService profileService;

    // constructor
    public CsvProfileImporter(NaiveCsvReader csvReader ,ProfileService profileService ){
        this.csvReader = csvReader;
        this.profileService = profileService;
    }

   public int importFrom(Path csvFile){
        int count = 0;


            List<String[]> rows = csvReader.read(csvFile);
            for(String[] r : rows){
                if(r.length < 3){
                    // we need id , email name
                    System.out.println("Skip row");
                    continue;
                }
                String id = r[0];
                String email = r[1];
                String name  = r[2];

                profileService.createProfile(id,email , name);
                count++;

            }


        return count;
    }
}