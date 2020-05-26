/*
package com.amazon.khataApp.controller;

import com.amazon.khataApp.mapping.BeTOEpMapper;
import com.amazon.khataApp.model.*;

import com.amazon.khataApp.services.KhataDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

*/
/**
 * Controller class to interact with Database( an API )
 *//*

@Slf4j
//@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BusinessEventController {

    */
/**
     * to convert businessEvent to eventPayload
     *//*

    @Autowired
    private BeTOEpMapper beTOEpMapper;

    */
/**
     * to do operations in repository
     *//*

    @Autowired
    private KhataDAO khataDAO;

    */
/**
     * GET method to show All business Event
     * JpaRepository method findAll() is used from service class
     * @return all the rows of table from repository
     *//*

    @GetMapping("/events")
    public ResponseEntity<List<EventPayloadDTO>> findAll() {
        return ResponseEntity.ok(khataDAO.findAll());
    }

    @PostMapping("/events")
    public ResponseEntity<EventPayload> create(@RequestBody BusinessEvent businessEvent) {
        final EventPayload eventPayload = beTOEpMapper.toEventPayload(businessEvent);
        eventPayloadHelper.validate(eventPayload); // Validate event
        eventPayloadHelper.transform(eventPayload); // Transform event
        businessEventService.save(eventPayload);
        return ResponseEntity.status(HttpStatus.CREATED).body(eventPayloadDTO);
    }

    */
/**
     * GET method to show a particular businessEvent
     * @param id of businessEvent to be returned
     * @return a particular business event with passed id
     *//*

    @GetMapping("event/{id}")
    public ResponseEntity<BusinessEvent> findById(@PathVariable Long id) {
        Optional<BusinessEvent> businessEvent = businessEventService.findById(id);
        return ResponseEntity.ok(businessEvent.get());
    }

    */
/**
     * PUT method
     * @param id of  Business Event
     * @param eventPayloadDTO businessEventDTO is passed that will be updated to businessEvent
     * @return passed businessEvent
     *//*

    @PutMapping("event/{id}")
    public ResponseEntity<EventPayload> update(@PathVariable Long id, @RequestBody EventPayload eventPayloadDTO) {
        BusinessEvent businessEvent = mapperImpl.toBusinessEvent(eventPayloadDTO);
        businessEvent.setId(id);
        businessEventService.save(businessEvent);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(eventPayloadDTO);
    }

    */
/**
     * DELETE method
     * @param id of businessEvent to be deleted
     * @return empty ResponseEntity
     *//*

    @DeleteMapping("event/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        businessEventService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
*/
