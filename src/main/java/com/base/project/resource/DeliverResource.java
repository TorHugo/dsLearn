package com.base.project.resource;

import com.base.project.model.dto.DeliverRevisionDTO;
import com.base.project.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

import static com.base.project.util.ResponseUtils.noContent;

@RestController
@RequestMapping(value = "/api/deliveries")
public class DeliverResource {

    @Autowired
    private DeliverService deliverService;

    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    @PutMapping(value = "/{idDeliver}")
    public ResponseEntity<Void> revisionDeliver
            (@PathVariable final Long idDeliver,
             @RequestBody final DeliverRevisionDTO deliverRevisionDTO){
        deliverService.saveRevision(idDeliver, deliverRevisionDTO);
        return  ResponseEntity.status(noContent).build();
    }
}
