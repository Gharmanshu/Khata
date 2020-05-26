package com.amazon.khataApp.services;

import com.amazon.khataApp.mapping.EpTOEpDTO;
import com.amazon.khataApp.mapping.EventPayloadToEventPayloadDTO;
import com.amazon.khataApp.model.EventPayload;
import com.amazon.khataApp.model.EventPayloadDTO;
import com.amazon.khataApp.repository.BusinessEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class KhataDAO {

    @Autowired
    private BusinessEventRepository businessEventRepository;

    @Autowired
    private EpTOEpDTO epTOEpDTO;

    public List<EventPayloadDTO> findAll() {
        return businessEventRepository.findAll();
    }

    public Optional<EventPayloadDTO> findById(String idempotenceId) {
        return businessEventRepository.findById(idempotenceId);
    }

    public EventPayloadDTO save(EventPayload eventPayload){
        EventPayloadDTO eventPayloadDTO = epTOEpDTO.toEventPayloadDTO(eventPayload);
        return businessEventRepository.save(eventPayloadDTO);
    }

    public void deleteById(String idempotenceId) {
        businessEventRepository.deleteById(idempotenceId);
    }


}
