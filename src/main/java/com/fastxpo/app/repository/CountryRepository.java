package com.fastxpo.app.repository;

import com.fastxpo.app.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country,Long> {



   // @Query("Select countryName from Country c where c.countryName ilike concat('%',:countryname,'%')")
    Country findBycountryName(String countryName);
}
