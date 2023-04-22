package com.base.project.service.impl;

import com.base.project.exception.impl.ResourceNotFoundException;
import com.base.project.model.dto.DeliverRevisionDTO;
import com.base.project.model.entity.DeliverModel;
import com.base.project.repository.DeliverRepository;
import com.base.project.service.DeliverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeliverServiceImpl implements DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    @Override
    public void saveRevision(final Long idDeliver, final DeliverRevisionDTO deliverRevisionDTO) {
        log.info("1. Recupered deliver in the database. idDeliver: {}", idDeliver);
        final DeliverModel deliver = deliverRepository.findById(idDeliver)
                .orElseThrow(() -> new ResourceNotFoundException("Entity not found!"));
        mappingRevision(deliver, deliverRevisionDTO);
        log.info("2. Update status.");
            deliverRepository.save(deliver);
    }

    private void mappingRevision(final DeliverModel deliverModel,
                                 final DeliverRevisionDTO deliverRevisionDTO){
        deliverModel.setStatus(deliverRevisionDTO.getStatus());
        deliverModel.setFeedback(deliverRevisionDTO.getFeedback());
        deliverModel.setCorrectCount(deliverRevisionDTO.getCorrectCount());
    }
}
