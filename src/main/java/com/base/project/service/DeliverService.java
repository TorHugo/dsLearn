package com.base.project.service;

import com.base.project.model.dto.DeliverRevisionDTO;

public interface DeliverService {
    void saveRevision(final Long idDeliver, final DeliverRevisionDTO deliverRevisionDTO);
}
