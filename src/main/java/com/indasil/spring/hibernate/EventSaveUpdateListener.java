package com.indasil.spring.hibernate;

import com.indasil.persistence.domain.TenantEntity;
import org.hibernate.HibernateException;
import org.hibernate.event.internal.DefaultSaveOrUpdateEventListener;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vashishta on 9/29/15.
 */
@Component
public class EventSaveUpdateListener extends DefaultSaveOrUpdateEventListener {

    @Autowired
    private TenantCheck tenantCheck;

    @Override
    public void onSaveOrUpdate(SaveOrUpdateEvent event) throws HibernateException {
        Object entity = event.getEntity();

        if (entity instanceof TenantEntity) {
            tenantCheck.checkAuth((TenantEntity) entity);
        }
        System.out.println(entity);
    }
}
