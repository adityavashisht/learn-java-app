package com.indasil.spring.hibernate;

import com.indasil.persistence.domain.TenantEntity;
import org.springframework.stereotype.Component;

/**
 * Created by vashishta on 9/29/15.
 */
@Component
public class TenantCheck {


    public boolean checkAuth(TenantEntity tenantEntity) {

        boolean isValid;
        if (tenantEntity.getId() != null) {
            System.out.println("Stop.....");
            isValid = false;
        } else {
            isValid = true;
        }

        return isValid;
    }
}
