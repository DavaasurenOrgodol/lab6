package edu.miu.cs.cs489.lesson6.citylibraryapp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Surgery;
import edu.miu.cs.cs489.lesson6.citylibraryapp.repository.SurgeryRepository;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.SurgeryService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurgeryServiceImpl implements SurgeryService {
    private SurgeryRepository surgeryRepository;

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        // TODO Auto-generated method stub
        Surgery savedSurgery = surgeryRepository.save(newSurgery);
        return savedSurgery;
    }

}
